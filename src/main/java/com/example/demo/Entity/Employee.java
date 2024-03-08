package com.example.demo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("Employee")
public class Employee {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String companyName;
    private String postion;
    
}
