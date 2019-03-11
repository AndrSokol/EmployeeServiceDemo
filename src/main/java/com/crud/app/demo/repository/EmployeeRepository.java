package com.crud.app.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.crud.app.demo.model.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {}
