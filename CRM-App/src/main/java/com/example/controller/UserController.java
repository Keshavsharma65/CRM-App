package com.example.controller;

import com.example.entity.User;
import com.example.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private userService service;

    @PostMapping("/userregister")
    public User registerUser(@RequestBody User user) {
        return service.saveUser(user);
    }
}
