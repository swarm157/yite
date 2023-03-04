package ru.nightmare.yite.model.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.Set;
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

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private User owner;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<GroupAdmin> admins;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "ofWhat")
    private Set<Member> members;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "community")
    private Set<Discussion> discussions;
    public UUID getId() {return id; }

    public void setId(UUID id) {
        this.id = id;
    }

}