// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: employee.proto
// Protobuf Java Version: 4.27.3

package com.employee.rest.api.development.grpc;

public interface EmployeeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EmployeeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Employee employees = 1;</code>
   */
  java.util.List<com.employee.rest.api.development.grpc.Employee> 
      getEmployeesList();
  /**
   * <code>repeated .Employee employees = 1;</code>
   */
  com.employee.rest.api.development.grpc.Employee getEmployees(int index);
  /**
   * <code>repeated .Employee employees = 1;</code>
   */
  int getEmployeesCount();
  /**
   * <code>repeated .Employee employees = 1;</code>
   */
  java.util.List<? extends com.employee.rest.api.development.grpc.EmployeeOrBuilder> 
      getEmployeesOrBuilderList();
  /**
   * <code>repeated .Employee employees = 1;</code>
   */
  com.employee.rest.api.development.grpc.EmployeeOrBuilder getEmployeesOrBuilder(
      int index);
}