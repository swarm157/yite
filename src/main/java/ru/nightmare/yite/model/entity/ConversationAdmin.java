package ru.nightmare.yite.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "conversation_admin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ConversationAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "user", nullable = false)
    private UUID user;
    @Column(name = "conversation", nullable = false)
    private UUID conversation;
    @Column(name = "ban_permission", nullable = false)
    private boolean banPermission;
    @Column(name = "unban_permission", nullable = false)
    private boolean unbanPermission;
    @Column(name = "invite_links_permission", nullable = false)
    private boolean inviteLinksPermission;
    @Column(name = "invite_permission", nullable = false)
    private Boolean invitePermission;
    @Column(name = "edit_description_permission", nullable = false)
    private Boolean editDescriptionPermission;
    @Column(name = "edit_rules_permission", nullable = false)
    private Boolean editRulesPermission;
    @Column(name = "edit_name_permission", nullable = false)
    private Boolean editNamePermission;
    @Column(name = "pin_permission", nullable = false)
    private Boolean pinPermission;
    @Column(name = "could_be_banned", nullable = false)
    private Boolean couldBeBanned;
    @Column(name = "delete_messages_permission", nullable = false)
    private Boolean deleteMessagesPermission;
    @Column(name = "edit_messages_permission", nullable = false)
    private Boolean editMessagesPermission;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}