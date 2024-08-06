package com.employee.rest.api.development.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: employee.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EmployeeServiceGrpc {

  private EmployeeServiceGrpc() {}

  public static final String SERVICE_NAME = "EmployeeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.EmployeeRequest,
      com.employee.rest.api.development.grpc.Employee> getGetEmployeeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEmployeeById",
      requestType = com.employee.rest.api.development.grpc.EmployeeRequest.class,
      responseType = com.employee.rest.api.development.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.EmployeeRequest,
      com.employee.rest.api.development.grpc.Employee> getGetEmployeeByIdMethod() {
    io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.EmployeeRequest, com.employee.rest.api.development.grpc.Employee> getGetEmployeeByIdMethod;
    if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetEmployeeByIdMethod = EmployeeServiceGrpc.getGetEmployeeByIdMethod) == null) {
          EmployeeServiceGrpc.getGetEmployeeByIdMethod = getGetEmployeeByIdMethod =
              io.grpc.MethodDescriptor.<com.employee.rest.api.development.grpc.EmployeeRequest, com.employee.rest.api.development.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetEmployeeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetEmployeeById"))
              .build();
        }
      }
    }
    return getGetEmployeeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.employee.rest.api.development.grpc.EmployeeResponse> getGetAllEmployeesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllEmployees",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.employee.rest.api.development.grpc.EmployeeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.employee.rest.api.development.grpc.EmployeeResponse> getGetAllEmployeesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.employee.rest.api.development.grpc.EmployeeResponse> getGetAllEmployeesMethod;
    if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getGetAllEmployeesMethod = EmployeeServiceGrpc.getGetAllEmployeesMethod) == null) {
          EmployeeServiceGrpc.getGetAllEmployeesMethod = getGetAllEmployeesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.employee.rest.api.development.grpc.EmployeeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllEmployees"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.EmployeeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("GetAllEmployees"))
              .build();
        }
      }
    }
    return getGetAllEmployeesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.Employee,
      com.employee.rest.api.development.grpc.Employee> getCreateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEmployee",
      requestType = com.employee.rest.api.development.grpc.Employee.class,
      responseType = com.employee.rest.api.development.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.Employee,
      com.employee.rest.api.development.grpc.Employee> getCreateEmployeeMethod() {
    io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.Employee, com.employee.rest.api.development.grpc.Employee> getCreateEmployeeMethod;
    if ((getCreateEmployeeMethod = EmployeeServiceGrpc.getCreateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getCreateEmployeeMethod = EmployeeServiceGrpc.getCreateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getCreateEmployeeMethod = getCreateEmployeeMethod =
              io.grpc.MethodDescriptor.<com.employee.rest.api.development.grpc.Employee, com.employee.rest.api.development.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("CreateEmployee"))
              .build();
        }
      }
    }
    return getCreateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.Employee,
      com.employee.rest.api.development.grpc.Employee> getUpdateEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEmployee",
      requestType = com.employee.rest.api.development.grpc.Employee.class,
      responseType = com.employee.rest.api.development.grpc.Employee.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.Employee,
      com.employee.rest.api.development.grpc.Employee> getUpdateEmployeeMethod() {
    io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.Employee, com.employee.rest.api.development.grpc.Employee> getUpdateEmployeeMethod;
    if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getUpdateEmployeeMethod = EmployeeServiceGrpc.getUpdateEmployeeMethod) == null) {
          EmployeeServiceGrpc.getUpdateEmployeeMethod = getUpdateEmployeeMethod =
              io.grpc.MethodDescriptor.<com.employee.rest.api.development.grpc.Employee, com.employee.rest.api.development.grpc.Employee>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.Employee.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.Employee.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("UpdateEmployee"))
              .build();
        }
      }
    }
    return getUpdateEmployeeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.EmployeeRequest,
      com.google.protobuf.Empty> getDeleteEmployeeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEmployee",
      requestType = com.employee.rest.api.development.grpc.EmployeeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.EmployeeRequest,
      com.google.protobuf.Empty> getDeleteEmployeeMethod() {
    io.grpc.MethodDescriptor<com.employee.rest.api.development.grpc.EmployeeRequest, com.google.protobuf.Empty> getDeleteEmployeeMethod;
    if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
      synchronized (EmployeeServiceGrpc.class) {
        if ((getDeleteEmployeeMethod = EmployeeServiceGrpc.getDeleteEmployeeMethod) == null) {
          EmployeeServiceGrpc.getDeleteEmployeeMethod = getDeleteEmployeeMethod =
              io.grpc.MethodDescriptor.<com.employee.rest.api.development.grpc.EmployeeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteEmployee"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.employee.rest.api.development.grpc.EmployeeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new EmployeeServiceMethodDescriptorSupplier("DeleteEmployee"))
              .build();
        }
      }
    }
    return getDeleteEmployeeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EmployeeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceStub>() {
        @java.lang.Override
        public EmployeeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceStub(channel, callOptions);
        }
      };
    return EmployeeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EmployeeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceBlockingStub>() {
        @java.lang.Override
        public EmployeeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceBlockingStub(channel, callOptions);
        }
      };
    return EmployeeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EmployeeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EmployeeServiceFutureStub>() {
        @java.lang.Override
        public EmployeeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EmployeeServiceFutureStub(channel, callOptions);
        }
      };
    return EmployeeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getEmployeeById(com.employee.rest.api.development.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetEmployeeByIdMethod(), responseObserver);
    }

    /**
     */
    default void getAllEmployees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.EmployeeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllEmployeesMethod(), responseObserver);
    }

    /**
     */
    default void createEmployee(com.employee.rest.api.development.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void updateEmployee(com.employee.rest.api.development.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateEmployeeMethod(), responseObserver);
    }

    /**
     */
    default void deleteEmployee(com.employee.rest.api.development.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEmployeeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service EmployeeService.
   */
  public static abstract class EmployeeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return EmployeeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<EmployeeServiceStub> {
    private EmployeeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceStub(channel, callOptions);
    }

    /**
     */
    public void getEmployeeById(com.employee.rest.api.development.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllEmployees(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.EmployeeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEmployee(com.employee.rest.api.development.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEmployee(com.employee.rest.api.development.grpc.Employee request,
        io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEmployee(com.employee.rest.api.development.grpc.EmployeeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<EmployeeServiceBlockingStub> {
    private EmployeeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.employee.rest.api.development.grpc.Employee getEmployeeById(com.employee.rest.api.development.grpc.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetEmployeeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.employee.rest.api.development.grpc.EmployeeResponse getAllEmployees(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllEmployeesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.employee.rest.api.development.grpc.Employee createEmployee(com.employee.rest.api.development.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.employee.rest.api.development.grpc.Employee updateEmployee(com.employee.rest.api.development.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateEmployeeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEmployee(com.employee.rest.api.development.grpc.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEmployeeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service EmployeeService.
   */
  public static final class EmployeeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<EmployeeServiceFutureStub> {
    private EmployeeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EmployeeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EmployeeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.employee.rest.api.development.grpc.Employee> getEmployeeById(
        com.employee.rest.api.development.grpc.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetEmployeeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.employee.rest.api.development.grpc.EmployeeResponse> getAllEmployees(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllEmployeesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.employee.rest.api.development.grpc.Employee> createEmployee(
        com.employee.rest.api.development.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.employee.rest.api.development.grpc.Employee> updateEmployee(
        com.employee.rest.api.development.grpc.Employee request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateEmployeeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEmployee(
        com.employee.rest.api.development.grpc.EmployeeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEmployeeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_EMPLOYEE_BY_ID = 0;
  private static final int METHODID_GET_ALL_EMPLOYEES = 1;
  private static final int METHODID_CREATE_EMPLOYEE = 2;
  private static final int METHODID_UPDATE_EMPLOYEE = 3;
  private static final int METHODID_DELETE_EMPLOYEE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_EMPLOYEE_BY_ID:
          serviceImpl.getEmployeeById((com.employee.rest.api.development.grpc.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee>) responseObserver);
          break;
        case METHODID_GET_ALL_EMPLOYEES:
          serviceImpl.getAllEmployees((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.EmployeeResponse>) responseObserver);
          break;
        case METHODID_CREATE_EMPLOYEE:
          serviceImpl.createEmployee((com.employee.rest.api.development.grpc.Employee) request,
              (io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee>) responseObserver);
          break;
        case METHODID_UPDATE_EMPLOYEE:
          serviceImpl.updateEmployee((com.employee.rest.api.development.grpc.Employee) request,
              (io.grpc.stub.StreamObserver<com.employee.rest.api.development.grpc.Employee>) responseObserver);
          break;
        case METHODID_DELETE_EMPLOYEE:
          serviceImpl.deleteEmployee((com.employee.rest.api.development.grpc.EmployeeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetEmployeeByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.employee.rest.api.development.grpc.EmployeeRequest,
              com.employee.rest.api.development.grpc.Employee>(
                service, METHODID_GET_EMPLOYEE_BY_ID)))
        .addMethod(
          getGetAllEmployeesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.employee.rest.api.development.grpc.EmployeeResponse>(
                service, METHODID_GET_ALL_EMPLOYEES)))
        .addMethod(
          getCreateEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.employee.rest.api.development.grpc.Employee,
              com.employee.rest.api.development.grpc.Employee>(
                service, METHODID_CREATE_EMPLOYEE)))
        .addMethod(
          getUpdateEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.employee.rest.api.development.grpc.Employee,
              com.employee.rest.api.development.grpc.Employee>(
                service, METHODID_UPDATE_EMPLOYEE)))
        .addMethod(
          getDeleteEmployeeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.employee.rest.api.development.grpc.EmployeeRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EMPLOYEE)))
        .build();
  }

  private static abstract class EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EmployeeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.employee.rest.api.development.grpc.EmployeeOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EmployeeService");
    }
  }

  private static final class EmployeeServiceFileDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier {
    EmployeeServiceFileDescriptorSupplier() {}
  }

  private static final class EmployeeServiceMethodDescriptorSupplier
      extends EmployeeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EmployeeServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EmployeeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EmployeeServiceFileDescriptorSupplier())
              .addMethod(getGetEmployeeByIdMethod())
              .addMethod(getGetAllEmployeesMethod())
              .addMethod(getCreateEmployeeMethod())
              .addMethod(getUpdateEmployeeMethod())
              .addMethod(getDeleteEmployeeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
