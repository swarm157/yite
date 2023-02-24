package ru.nightmare.yite.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "community")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Community {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name = "accessibility", nullable = false)
    private Boolean accessibility;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "pinned_post", nullable = true)
    private UUID pinnedPost;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "rules", nullable = false)
    private String rules;

    @Column(name = "name", nullable = false)
    private UUID owner;
    public UUID getId() {return id; }

    public void setId(UUID id) {
        this.id = id;
    }

}