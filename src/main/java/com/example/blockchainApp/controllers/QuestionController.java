package com.example.blockchainApp.controllers;

import com.example.blockchainApp.models.Question;
import com.example.blockchainApp.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
@CrossOrigin
public class QuestionController {

    @Autowired
    QuestionService service;

    @GetMapping("/get_all")
    public List<Question> getAllQuestions(){
        return service.getAllQuestions();
    }

    @GetMapping("{id}")
    public Question getQuestionById(@PathVariable long id){
        return service.getQuestionsById(id);
    }

    @GetMapping("create")
    public Question createQuestion(@RequestBody Question question){
        return service.createQuestion(question);
    }
}
