package ru.nightmare.yite.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "friend")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "user1", nullable = false)
    private UUID user1;
    @Column(name = "user2", nullable = false)
    private UUID user2;
    @Column(name = "accepted_by_user1", nullable = false)
    private Boolean acceptedByUser1;
    @Column(name = "accepted_by_user2", nullable = false)
    private Boolean acceptedByUser2;
    @Column(name = "hidden_by_user1", nullable = false)
    private Boolean hiddenByUser1;
    @Column(name = "hidden_by_user2", nullable = false)
    private Boolean hiddenByUser2;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}