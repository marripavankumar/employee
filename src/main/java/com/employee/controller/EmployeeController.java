package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping
    public Mono<Employee> create(@RequestBody Employee employee) {
        return service.create(employee);
    }

    @GetMapping("/{id}")
    public Mono<Employee> getById(@PathVariable Long id) {
        return service.getById(id);
    }

    @GetMapping
    public Flux<Employee> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public Mono<Employee> update(@PathVariable Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return service.update(employee);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable Long id) {
        return service.delete(id);
    }
}

