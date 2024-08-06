package com.employee.rest.api.development.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.rest.api.development.model.Employee;
import com.employee.rest.api.development.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    public Optional<Employee> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    public Employee updateEmployee(Integer id, Employee employee) {
        if (repository.existsById(id)) {
            employee.setId(id);
            return repository.save(employee);
        }
        return null;
    }

    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
