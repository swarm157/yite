package ru.nightmare.yite.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "group_admin")
public class GroupAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    private UUID user;
    private boolean discussionsCreatingPermission;
    private boolean discussionsDeletingPermission;
    private boolean postingPermission;
    private boolean postEditingPermission;
    private boolean postDeletingPermission;
    private boolean commentDeletingPermission;
    private boolean groupRenamePermission;
    private boolean banPermission;
    private boolean unbanPermission;
    private boolean editRulesPermission;
    private boolean editDescriptionPermission;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}