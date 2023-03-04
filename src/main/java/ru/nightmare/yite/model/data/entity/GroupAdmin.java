package ru.nightmare.yite.model.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "group_admin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroupAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(name = "user", nullable = false)
    private UUID user;
    @Column(name = "discussions_creating_permission", nullable = false)
    private Boolean discussionsCreatingPermission;
    @Column(name = "discussions_deleting_permission", nullable =false )
    private Boolean discussionsDeletingPermission;
    @Column(name = "posting_permission", nullable = false)
    private Boolean postingPermission;
    @Column(name = "post_editing_permission", nullable = false)
    private Boolean postEditingPermission;
    @Column(name = "post_deleting_permission", nullable = false)
    private Boolean postDeletingPermission;
    @Column(name = "comment_deleting_permission", nullable = false)
    private Boolean commentDeletingPermission;
    @Column(name = "group_rename_permission", nullable = false)
    private Boolean groupRenamePermission;
    @Column(name = "ban_permission", nullable = false)
    private Boolean banPermission;
    @Column(name = "unban_permission", nullable = false)
    private Boolean unbanPermission;
    @Column(name = "edit_rules_permission", nullable = false)
    private Boolean editRulesPermission;
    @Column(name = "edit_description_permission", nullable = false)
    private Boolean editDescriptionPermission;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}