package ru.nightmare.yite.entity;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "discussion")
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private String name;
    private UUID creator;
    private UUID community;
    private boolean opened;
    private String description;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}