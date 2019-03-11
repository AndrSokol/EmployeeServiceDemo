package com.crud.app.demo.service.impl;

import java.util.Arrays;
import java.util.Optional;
import java.util.UUID;

import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.app.demo.model.Employee;
import com.crud.app.demo.repository.EmployeeRepository;
import com.crud.app.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@Service
public class EmployeeServiceImpl  implements EmployeeService {

    EmployeeRepository repository;
    private static DataFactory dataFactory;

    @Autowired
    EmployeeServiceImpl(EmployeeRepository repository){
        this.repository = repository;
        dataFactory = new DataFactory();
    }

    @Override
    public Employee add(Employee order) {
        return repository.save(order);
    }

    @Override
    public Optional<Employee> get(Long id) {
        return repository.findById(id);
    }

    @Override
    public Employee update(Employee order) {
        return repository.save(order);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Iterable<Employee> getAll() {
        return repository.findAll();
    }

    @Override
    public Employee generate() {

        Employee employee = new Employee();
        employee.setFirstName(dataFactory.getFirstName());
        employee.setLastName(dataFactory.getLastName());
        employee.setStatus(dataFactory.getItem(Arrays.asList("ACTIVE","DELETE","NEW")));

        return employee;
    }
}
