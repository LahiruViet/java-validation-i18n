package com.example.demo.controller;

import com.example.demo.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @PostMapping("/user")
    public User createUser(@Valid @RequestBody User user){
        return user;
    }
}
