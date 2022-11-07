package com.example.blockchainApp.controllers;

import com.example.blockchainApp.models.UserResponse;
import com.example.blockchainApp.services.UserResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/response")
@CrossOrigin
public class UserResponseController {

    @Autowired
    UserResponseService service;

    @GetMapping("/get_all")
    public List<UserResponse> getAllUserResponse(){
        return service.getAllUserResponses();
    }

    @GetMapping("/{id}")
    public UserResponse getUserResponseById(@PathVariable long id){
        return service.getAllUserResponseById(id);
    }

    @GetMapping("/{question_id}")
    public List<UserResponse> getUserResponseByQuestionId(@PathVariable long id){
        return service.getAllUserResponseByQuestionId(id);
    }

    @GetMapping("/{question_id}")
    public List<UserResponse> getUserResponseByResponseId(@PathVariable long id){
        return service.getAllUserResponseByResponseId(id);
    }

    @GetMapping("/{question_id}")
    public List<UserResponse> getUserResponseByUserId(@PathVariable long id){
        return service.getAllUserResponseByUserId(id);
    }
}
