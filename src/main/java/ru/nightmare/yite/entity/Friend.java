package ru.nightmare.yite.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "friend")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    private UUID user1;
    private UUID user2;
    private boolean acceptedByUser1;
    private boolean acceptedByUser2;
    private boolean hiddenByUser1;
    private boolean hiddenByUser2;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}