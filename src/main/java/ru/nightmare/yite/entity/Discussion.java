package ru.nightmare.yite.entity;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "discussion")
public class Discussion {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}