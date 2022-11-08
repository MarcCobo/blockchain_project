package com.example.blockchainApp.services;

import com.example.blockchainApp.models.Question;
import com.example.blockchainApp.models.Response;
import com.example.blockchainApp.repositories.QuestionRepository;
import com.example.blockchainApp.repositories.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ResponseService {
    @Autowired
    ResponseRepository repository;

    @Transactional
    public List<Response> getAllResponses() {
        return repository.findAll();
    }

    @Transactional
    public Response getResponsesById(Long id){
        return repository.findById(id).get();
    }

    @Transactional
    public Response createResponse(Response response){
        repository.save(response);
        return response;
    }

    @Transactional
    public List<Response> getResponsesByQuestionId(Long questionId){
        return repository.findByQuestionId(questionId).iterator().next();
    }

}
