package ru.nightmare.yite.entity;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "question.html")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}