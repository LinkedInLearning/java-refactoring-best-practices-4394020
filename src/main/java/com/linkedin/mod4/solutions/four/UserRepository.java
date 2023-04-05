package com.linkedin.mod4.solutions.four;

public interface UserRepository {
    void save(User user);
    User getById(int id);

    // other methods for managing user data
}

