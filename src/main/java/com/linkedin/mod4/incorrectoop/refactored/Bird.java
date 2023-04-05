package com.linkedin.mod4.incorrectoop.refactored;

public class Bird implements Flyer {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }
}

