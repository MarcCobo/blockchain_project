package com.example.blockchainApp.controllers;

import com.example.blockchainApp.models.User;
import com.example.blockchainApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/allUsers")
    @CrossOrigin
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("{id}")
    @CrossOrigin
    public User getUserById(@PathVariable long id) {
        return service.getUserById(id);
    }

    @GetMapping("/check_email")
    @CrossOrigin
    public String emailExists(String email){
        return service.emailExists(email);
    }
}
