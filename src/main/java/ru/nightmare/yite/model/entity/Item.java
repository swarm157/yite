package ru.nightmare.yite.model.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "message", nullable = false)
    private UUID message;
    @Column(name = "original_name", nullable = false)
    private String originalName;
    @Column(name = "file_name", nullable = false)
    private String fileName;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}