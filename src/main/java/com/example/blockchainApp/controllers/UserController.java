package com.example.blockchainApp.controllers;

import com.example.blockchainApp.models.User;
import com.example.blockchainApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService service;

    private boolean validateUser(User user){
        return true;
    }

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        HttpStatus code = null;

        if (validateUser(user)){
            try{
                service.createUser(user);
                code = HttpStatus.CREATED;
            } catch (Exception exception) {
                code = HttpStatus.INTERNAL_SERVER_ERROR;
            }
        } else {
            code = HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<User>(user, code);
    }
}
