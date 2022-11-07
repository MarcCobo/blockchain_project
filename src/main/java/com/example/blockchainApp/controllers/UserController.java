package com.example.blockchainApp.controllers;

import com.example.blockchainApp.models.User;
import com.example.blockchainApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;

    @PostMapping("/create")
    public User createUser(@RequestBody User user) {
        return service.createUser(user);
    }

    @GetMapping("/all_users")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable long id) {
        return service.getUserById(id);
    }

    @GetMapping("/check_email")
    public String emailExists(@RequestParam(name = "email") String email){
        return service.emailExists(email);
    }
}
