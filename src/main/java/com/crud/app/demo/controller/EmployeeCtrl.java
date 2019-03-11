package com.crud.app.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.crud.app.demo.model.Employee;
import com.crud.app.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeCtrl {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeCtrl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/generate")
    public Employee generate() {
        return employeeService.generate();
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable("id") Long id) {
        return employeeService.get(id).orElse(null);
    }

    @GetMapping
    public Iterable<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping
    public void save(@RequestBody Employee employee) {
        employeeService.add(employee);
    }

    @PutMapping
    public void update(@RequestBody Employee employee) {
        employeeService.update(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        employeeService.delete(id);
    }

}
