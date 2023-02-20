package ru.nightmare.yite.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "global_moderator")
public class GlobalModerator {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    private UUID user;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}