package com.linkedin.mod4.incorrectoop.bad;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am flying.");
    }

    @Override
    public void swim() {
        // not applicable
    }
}

