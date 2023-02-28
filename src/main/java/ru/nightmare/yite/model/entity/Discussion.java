package ru.nightmare.yite.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "discussion")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "creator", nullable = false)
    private UUID creator;
    @Column(name = "community", nullable = true)
    private UUID community;
    @Column(name = "opened", nullable = false)
    private Boolean opened;
    @Column(name = "description", nullable = false)
    private String description;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "discussion")
    private Set<Question> questions;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}