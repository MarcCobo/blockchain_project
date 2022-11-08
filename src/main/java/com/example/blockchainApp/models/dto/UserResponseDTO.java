package com.example.blockchainApp.models.dto;

public class UserResponseDTO {

    private long id;
    private long question_id;
    private long user_id;
    private long response_id;

    public UserResponseDTO(long id, long question_id, long user_id, long response_id) {
        this.id = id;
        this.question_id = question_id;
        this.user_id = user_id;
        this.response_id = response_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(long question_id) {
        this.question_id = question_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public long getResponse_id() {
        return response_id;
    }

    public void setResponse_id(long response_id) {
        this.response_id = response_id;
    }

    @Override
    public String toString() {
        return "UserResponseDTO{" +
                "id=" + id +
                ", question_id=" + question_id +
                ", user_id=" + user_id +
                ", response_id=" + response_id +
                '}';
    }
}
