package ru.nightmare.yite.model.data.entity;



import lombok.*;
import org.hibernate.annotations.Persister;
import org.hibernate.persister.entity.EntityPersister;


import javax.imageio.ImageIO;
import javax.persistence.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToMany(mappedBy = "user")
    @Persister(impl = EntityPersister.class)
    private Set<Member> memberOf;
    @ManyToMany(mappedBy = "user")
    @Persister(impl = EntityPersister.class)
    private Set<Friend> friends;
    @ManyToMany(mappedBy = "user")
    @Persister(impl = EntityPersister.class)
    private Set<Post> posts;
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
    public void setAvatar(BufferedImage icon) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        ImageIO.write(icon, "png", os);
        avatar = os.toByteArray();
    }

    public Image getAvatar() {
        return new ImageIcon(avatar).getImage();
    }
}