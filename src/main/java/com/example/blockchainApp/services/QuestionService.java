package com.example.blockchainApp.services;

import com.example.blockchainApp.models.Question;
import com.example.blockchainApp.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository repository;

    @Transactional
    public List<Question> getAllQuestions() {
        return repository.findAll();
    }

    @Transactional
    public Question getQuestionsById(Long id){
        return repository.findById(id).get();
    }

    @Transactional
    public Question createQuestion(Question question){
        repository.save(question);
        return question;
    }

}
