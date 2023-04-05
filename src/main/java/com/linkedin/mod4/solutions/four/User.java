package com.linkedin.mod4.solutions.four;

public class User {

    private int id;
    private String username;
    private String password;

    // getters and setters

    public void save(UserRepository repository) {
        repository.save(this);
    }

}

