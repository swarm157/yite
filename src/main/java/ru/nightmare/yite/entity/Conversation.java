package ru.nightmare.yite.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "conversation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "accessibility", nullable = false)
    private Boolean accessibility;
    @Column(name = "pinned", nullable = true)
    private UUID pinned;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "rules", nullable = false)
    private String rules;
    @Column(name = "blocked", nullable = false)
    private Boolean blocked;
    @Column(name = "speed_limit", nullable = false)
    private Boolean speedLimit;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}