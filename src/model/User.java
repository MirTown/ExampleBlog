package model;

import java.io.Serializable;
import java.util.Set;

public class User implements Serializable {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Set<User> subscriptions;
    private Set<User> followers;

    public User() {

    }

    public User(Long id, String name, String email, String password, Set<User> subscriptions, Set<User> followers) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.subscriptions = subscriptions;
        this.followers = followers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<User> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(Set<User> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public Set<User> getFollowers() {
        return followers;
    }

    public void setFollowers(Set<User> followers) {
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", subscriptions=" + subscriptions +
                ", followers=" + followers +
                '}';
    }
}
