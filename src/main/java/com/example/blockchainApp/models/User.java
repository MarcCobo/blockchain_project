package com.example.blockchainApp.models;


import jakarta.persistence.*;

@Table(name = "users")
public class User {

    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String vertical;
    @Column
    private String question;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public User(long id, String vertical, String question) {
        this.id = id;
        this.vertical = vertical;
        this.question = question;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", vertical='" + vertical + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
