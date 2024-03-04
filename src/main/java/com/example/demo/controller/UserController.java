package com.example.demo.controller;

import com.example.demo.Entity.User;
import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping(value = "/users",
        consumes = MediaType.APPLICATION_JSON_VALUE,
        produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private final UserRepository petRepository;

    @PostMapping
    public void create(@RequestBody User user) {
        log.info("Crete method called with data : {}", user.toString());
        petRepository.save(user);
    }

    @GetMapping
    public List<User> view() {
        log.info("View method called");
        List<User> users = petRepository.findAll();
        log.info("User list :{}", users);
        return users;
    }

}