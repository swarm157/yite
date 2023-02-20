package ru.nightmare.yite.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "conversation_admin")
public class ConversationAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    private UUID user;
    private UUID conversation;
    private boolean banPermission;
    private boolean unbanPermission;
    private boolean inviteLinksPermission;
    private boolean invitePermission;
    private boolean editDescriptionPermission;
    private boolean editRulesPermission;
    private boolean editNamePermission;
    private boolean pinPermission;
    private boolean couldBeBanned;
    private boolean deleteMessagesPermission;
    private boolean editMessagesPermission;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}