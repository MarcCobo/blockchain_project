package com.example.blockchainApp.services;

import com.example.blockchainApp.models.UserResponse;
import com.example.blockchainApp.repositories.UserResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserResponseService {

    @Autowired
    private UserResponseRepository repository;

    @Transactional
    public List<UserResponse> getAllUserResponses() {
        return repository.findAll();
    }

    @Transactional
    public UserResponse getAllUserResponseById(Long id){
        return repository.findById(id).get();
    }

    @Transactional
    public List<UserResponse> getAllUserResponseByQuestionId(Long questionId){
        return repository.findByQuestionId(questionId).iterator().next();
    }

    @Transactional
    public List<UserResponse> getAllUserResponseByResponseId(Long responseId){
        return repository.findByResponseId(responseId).iterator().next();
    }

    @Transactional
    public List<UserResponse> getAllUserResponseByUserId(Long userId){
        return repository.findByUserId(userId).iterator().next();
    }
}
