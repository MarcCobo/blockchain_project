package com.example.blockchainApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_responses")
public class UserResponse {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "question_id")
    private Question question;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "response_id")
    private Response response;

    public UserResponse(long id, Question question, User user, Response response) {
        this.id = id;
        this.question = question;
        this.user = user;
        this.response = response;
    }

    public UserResponse(Question question, User user, Response response) {
        this.question = question;
        this.user = user;
        this.response = response;
    }

    public UserResponse() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }


    @Override
    public String toString() {
        return "UserResponse{" +
                "id=" + id +
                ", question=" + question +
                ", user=" + user +
                ", response=" + response +
                '}';
    }
}
