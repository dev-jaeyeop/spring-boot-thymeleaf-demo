package com.springboot.thymeleaf.service;

import com.springboot.thymeleaf.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    void save(Employee employee);

    List<Employee> findAll();

    Optional<Employee> findById(Long employeeId);

    void deleteById(Long employeeId);

}
