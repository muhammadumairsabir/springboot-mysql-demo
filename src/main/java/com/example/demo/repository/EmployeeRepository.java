package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.Entity.Employee;

public  interface EmployeeRepository extends MongoRepository<Employee, String> {

}
