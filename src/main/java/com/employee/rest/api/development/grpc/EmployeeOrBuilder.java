// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: employee.proto
// Protobuf Java Version: 4.27.3

package com.employee.rest.api.development.grpc;

public interface EmployeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Employee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string designation = 3;</code>
   * @return The designation.
   */
  java.lang.String getDesignation();
  /**
   * <code>string designation = 3;</code>
   * @return The bytes for designation.
   */
  com.google.protobuf.ByteString
      getDesignationBytes();

  /**
   * <code>double salary = 4;</code>
   * @return The salary.
   */
  double getSalary();

  /**
   * <code>string department = 5;</code>
   * @return The department.
   */
  java.lang.String getDepartment();
  /**
   * <code>string department = 5;</code>
   * @return The bytes for department.
   */
  com.google.protobuf.ByteString
      getDepartmentBytes();
}
