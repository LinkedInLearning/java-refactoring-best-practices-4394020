package com.linkedin.mod4.solutions.four;

public class DatabaseUserRepository implements UserRepository {

    public void save(User user) {
        // code to save user to database
    }

    public User getById(int id) {
        // code to get user by ID from database
        return new User();
    }

    // other methods for interacting with the database
}
