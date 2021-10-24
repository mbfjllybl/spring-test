package io.github.mbfjllybl;

public class User {
    public String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void add() {
        System.out.println("hello spring");
    }

    public User(String username) {
        this.username = username;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                '}';
    }
}
