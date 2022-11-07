package com.example.blockchainApp.models;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String vertical;
    @Column
    private String question;

    public Question() {
    }

    public Question(long id, String vertical, String question) {
        this.id = id;
        this.vertical = vertical;
        this.question = question;
    }

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

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", vertical='" + vertical + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
