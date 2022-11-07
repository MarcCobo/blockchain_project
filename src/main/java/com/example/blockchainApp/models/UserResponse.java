package com.example.blockchainApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_responses")
public class UserResponse {

    long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;


}
