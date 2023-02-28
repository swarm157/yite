package ru.nightmare.yite.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "text", nullable = false)
    private String text;
    @Column(name = "user", nullable = false)
    private UUID user;
    @Column(name = "hidden", nullable = false)
    private Boolean hidden;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "message")
    Set<Item> items;
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}