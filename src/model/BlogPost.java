package model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class BlogPost {
    private Long id;
    private String title;
    private String post;
    private User author;
    private LocalDateTime date;
    private Set<Tag> tags;
    private Set<Comment> comments;
    private Set<User> likes;
    private Set<User> dislikes;

    @Override
    public String toString() {
        return "BlogPost{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", post='" + post + '\'' +
                ", author=" + author +
                ", date=" + date +
                ", tags=" + tags +
                ", comments=" + comments +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Set<Tag> getTags() {
        return tags;
    }

    public void setTags(Set<Tag> tags) {
        this.tags = tags;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
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

    public BlogPost() {

    }

    public BlogPost(Long id, String title, String post, User author, LocalDateTime date, Set<Tag> tags, Set<Comment> comments, Set<User> likes, Set<User> dislikes) {

        this.id = id;
        this.title = title;
        this.post = post;
        this.author = author;
        this.date = date;
        this.tags = tags;
        this.comments = comments;
        this.likes = likes;
        this.dislikes = dislikes;
    }
}


