package com.crud.app.demo.service;

import java.util.Optional;

import com.crud.app.demo.model.Employee;

public interface EmployeeService {
    Employee add(Employee employee);
    Optional<Employee> get(Long id);
    Employee update(Employee order);
    void delete(Long id);
    Iterable<Employee> getAll();
    Employee generate();
}
