package com.example.demo.controller;

import com.example.demo.Entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping(value = "/employees",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @PostMapping
    public void create(@RequestBody Employee employee) {
        log.info("Crete method called with data : {}", employee.toString());
        employeeRepository.save(employee);
    }

    @GetMapping
    public List<Employee> view() {
        log.info("Get Employees from DB method called");
        List<Employee> employees = employeeRepository.findAll();
        log.info("Employees list :{}", employees);
        return employees;
    }

}
