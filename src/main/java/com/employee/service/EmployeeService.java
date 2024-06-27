package com.employee.service;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Mono<Employee> create(Employee employee) {
        return repository.save(employee);
    }

    public Mono<Employee> getById(Long id) {
        return repository.findById(id);
    }

    public Flux<Employee> getAll() {
        return repository.findAll();
    }

    public Mono<Employee> update(Employee employee) {
        return repository.save(employee);
    }

    public Mono<Void> delete(Long id) {
        return repository.deleteById(id);
    }
}
