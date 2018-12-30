package model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

public class Comment implements Serializable {
    private Long id;
    private User user;
    private String message;
    private LocalDateTime date;
    private Set<User> likes;
    private Set<User> dislikes;
    public Comment() {

    }

    public Comment(Long id, User user, String message, LocalDateTime date, Set<User> likes, Set<User> dislikes) {

        this.id = id;
        this.user = user;
        this.message = message;
        this.date = date;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Set<User> getLikes() {
        return likes;
    }

    public void setLikes(Set<User> likes) {
        this.likes = likes;
    }

    public Set<User> getDislikes() {
        return dislikes;
    }

    public void setDislikes(Set<User> dislikes) {
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", user=" + user +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                '}';
    }
}
