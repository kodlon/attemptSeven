package me.vinuvicho.attemptSeven.entity.user;

public class User {
    private final Integer userId;
    private final String userName;

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

    public User(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }
}

