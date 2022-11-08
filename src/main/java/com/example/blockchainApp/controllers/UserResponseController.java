package com.example.blockchainApp.controllers;

import com.example.blockchainApp.models.Question;
import com.example.blockchainApp.models.Response;
import com.example.blockchainApp.models.User;
import com.example.blockchainApp.models.UserResponse;
import com.example.blockchainApp.models.dto.UserResponseDTO;
import com.example.blockchainApp.services.QuestionService;
import com.example.blockchainApp.services.ResponseService;
import com.example.blockchainApp.services.UserResponseService;
import com.example.blockchainApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user_response")
@CrossOrigin
public class UserResponseController {

    @Autowired
    UserResponseService service;

    @Autowired
    UserService userService;

    @Autowired
    ResponseService responseService;

    @Autowired
    QuestionService questionService;

    @GetMapping("/get_all")
    public List<UserResponse> getAllUserResponse() {
        return service.getAllUserResponses();
    }

    @GetMapping("/{id}")
    public UserResponse getUserResponseById(@PathVariable long id) {
        return service.getAllUserResponseById(id);
    }

    @PostMapping("/create")
    public UserResponse createUserResponse(@RequestBody UserResponseDTO userResponse) {
        System.out.println(userResponse);
        Question question = questionService.getQuestionsById(userResponse.getQuestion_id());
        Response response = responseService.getResponsesById(userResponse.getResponse_id());
        User user = userService.getUserById(userResponse.getUser_id());
        return service.save(new UserResponse(question, user, response));
    }

    @PostMapping("/get_user_responses")
    public List<UserResponse> getUserResponseByUserId(@RequestBody long id) {
        return service.getAllUserResponseByUserId(id);
    }


}
