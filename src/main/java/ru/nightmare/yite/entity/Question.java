package ru.nightmare.yite.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "question")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "user", nullable = false)
    private UUID user;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "text", nullable = false)
    private String text;
    @Column(name = "solved", nullable = false)
    private boolean solved;
    @Column(name = "closed", nullable = false)
    private boolean closed;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}