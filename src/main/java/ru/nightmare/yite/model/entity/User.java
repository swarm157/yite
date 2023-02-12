package ru.nightmare.yite.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "registration_time", nullable = false)
    private Date registrationTime;
    @Column(name = "birthday", nullable = false)
    private Date birthday;
    @Column(name = "status", nullable = false)
    private String status;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "avatar", nullable = false)
    private byte[] avatar;

}