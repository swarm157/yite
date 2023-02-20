package ru.nightmare.yite.entity;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "community")
public class Community {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private boolean accessibility;
    private String name;
    private UUID pinnedPost;
    private String description;
    private String rules;

    private UUID owner;
    public UUID getId() {return id; }

    public void setId(UUID id) {
        this.id = id;
    }

}