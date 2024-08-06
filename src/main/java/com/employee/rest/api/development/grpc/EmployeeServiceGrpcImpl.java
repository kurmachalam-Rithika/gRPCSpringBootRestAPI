package com.employee.rest.api.development.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import com.employee.rest.api.development.service.EmployeeService;
import com.google.protobuf.Empty;
import org.lognet.springboot.grpc.GRpcService;
import java.util.List;
import java.util.stream.Collectors;

@GRpcService
public class EmployeeServiceGrpcImpl extends EmployeeServiceGrpc.EmployeeServiceImplBase {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void getEmployeeById(EmployeeRequest request, StreamObserver<Employee> responseObserver) {
        employeeService.getEmployeeById(request.getId())
                .ifPresent(employee -> responseObserver.onNext(toGrpcEmployee(employee)));
        responseObserver.onCompleted();
    }

    @Override
    public void getAllEmployees(Empty request, StreamObserver<EmployeeList> responseObserver) {
        List<com.employee.rest.api.development.model.Employee> employees = employeeService.getAllEmployees();
        List<Employee> grpcEmployees = employees.stream()
                .map(this::toGrpcEmployee)
                .collect(Collectors.toList());
        EmployeeList response = EmployeeList.newBuilder().addAllEmployees(grpcEmployees).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    @Override
    public void createEmployee(Employee request, StreamObserver<Employee> responseObserver) {
        com.employee.rest.api.development.model.Employee domainEmployee = toDomainEmployee(request);
        com.employee.rest.api.development.model.Employee savedEmployee = employeeService.saveEmployee(domainEmployee);
        responseObserver.onNext(toGrpcEmployee(savedEmployee));
        responseObserver.onCompleted();
    }

    @Override
    public void updateEmployee(Employee request, StreamObserver<Employee> responseObserver) {
        com.employee.rest.api.development.model.Employee domainEmployee = toDomainEmployee(request);
        com.employee.rest.api.development.model.Employee updatedEmployee = employeeService.updateEmployee(request.getId(), domainEmployee);
        responseObserver.onNext(toGrpcEmployee(updatedEmployee));
        responseObserver.onCompleted();
    }

    @Override
    public void deleteEmployee(EmployeeRequest request, StreamObserver<Empty> responseObserver) {
        employeeService.deleteEmployee(request.getId());
        responseObserver.onNext(Empty.newBuilder().build());
        responseObserver.onCompleted();
    }

    private Employee toGrpcEmployee(com.employee.rest.api.development.model.Employee domainEmployee) {
        return Employee.newBuilder()
                .setId(domainEmployee.getId())
                .setName(domainEmployee.getName())
                .setDesignation(domainEmployee.getDesignation())
                .setSalary(domainEmployee.getSalary())
                .setDepartment(domainEmployee.getDepartment())
                .build();
    }

    private com.employee.rest.api.development.model.Employee toDomainEmployee(Employee grpcEmployee) {
        return new com.employee.rest.api.development.model.Employee(
        		grpcEmployee.getId(),
                grpcEmployee.getName(),
                grpcEmployee.getDesignation(),
                grpcEmployee.getSalary(),
                grpcEmployee.getDepartment());
    }
}
