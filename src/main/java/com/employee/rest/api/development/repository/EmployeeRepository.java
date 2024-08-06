package com.employee.rest.api.development.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.rest.api.development.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee , Integer> {
}
 