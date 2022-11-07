package com.example.blockchainApp.controllers;

import com.example.blockchainApp.models.Response;
import com.example.blockchainApp.services.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/response")
public class ResponseController {

    @Autowired
    ResponseService service;

    @GetMapping("/get_all")
    @CrossOrigin
    public List<Response> getAllResponses() {
        return service.getAllResponses();
    }

    @GetMapping("/{id}")
    @CrossOrigin
    public Response getResponsesById(@PathVariable long id) {
        return service.getResponsesById(id);
    }

    @PostMapping("/create")
    public Response createResponse(@RequestBody Response response) {
        return service.createResponse(response);
    }
}

