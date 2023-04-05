package com.linkedin.mod4.challenges.four;

public class User {

    private int id;
    private String username;
    private String password;

    // getters and setters

    public void save() {
        Database.saveUser(this);
    }

    public static User getById(int id) {
        return Database.getUserById(id);
    }

    // other methods for managing user data
}



