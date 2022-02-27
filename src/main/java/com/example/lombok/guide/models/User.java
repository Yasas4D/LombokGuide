package com.example.lombok.guide.models;

import java.util.Objects;

public class User {

    private Long userId;
    private String userName;
    private String email;
    private final String section;

    public User(String section) {
        this.section = section;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() { return section; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(userName, user.userName) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.getUserId() == null ? 43 : this.getUserId().hashCode());
        result = (result * PRIME) + (this.getUserName() == null ? 43 : this.getUserName().hashCode());
        result = (result * PRIME) + (this.getEmail() == null ? 43 : this.getEmail().hashCode());
        result = (result * PRIME) + (this.getSection() == null ? 43 : this.getSection().hashCode());
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
