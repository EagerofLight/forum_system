package space.kordegi.forum_sys.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author kordegi
 * @date 2024.03.06 8:55
 * @Description
 */

public class Comment {
    private Integer Id;
    private Integer userId;
    private String body;
    private Integer parentCommentId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Integer likes;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Integer parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Comment(Integer id, Integer userId, String body, Integer parentCommentId, LocalDateTime createdAt, LocalDateTime updatedAt, Integer likes) {
        Id = id;
        this.userId = userId;
        this.body = body;
        this.parentCommentId = parentCommentId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.likes = likes;
    }
}
