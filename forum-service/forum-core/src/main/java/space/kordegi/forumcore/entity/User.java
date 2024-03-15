package space.kordegi.forumcore.entity;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class User {
  private Integer id;
  private Integer state;
  private Integer topicsCount;
  private Integer commentsCount;
  private String name;
  private String email;
  private String location;
  private String bio;
  private String website;
  private String avatar;
  private String password;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;
  private LocalDateTime currentSignInAt;
  private LocalDateTime lastSignInAt;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public Integer getTopicsCount() {
    return topicsCount;
  }

  public void setTopicsCount(Integer topicsCount) {
    this.topicsCount = topicsCount;
  }

  public Integer getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(Integer commentsCount) {
    this.commentsCount = commentsCount;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
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

  public LocalDateTime getCurrentSignInAt() {
    return currentSignInAt;
  }

  public void setCurrentSignInAt(LocalDateTime currentSignInAt) {
    this.currentSignInAt = currentSignInAt;
  }

  public LocalDateTime getLastSignInAt() {
    return lastSignInAt;
  }

  public void setLastSignInAt(LocalDateTime lastSignInAt) {
    this.lastSignInAt = lastSignInAt;
  }

  public User(Integer id, Integer state, Integer topicsCount, Integer commentsCount, String name, String email, String location, String bio, String website, String avatar, String password, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime currentSignInAt, LocalDateTime lastSignInAt) {
    this.id = id;
    this.state = state;
    this.topicsCount = topicsCount;
    this.commentsCount = commentsCount;
    this.name = name;
    this.email = email;
    this.location = location;
    this.bio = bio;
    this.website = website;
    this.avatar = avatar;
    this.password = password;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.currentSignInAt = currentSignInAt;
    this.lastSignInAt = lastSignInAt;
  }
}
