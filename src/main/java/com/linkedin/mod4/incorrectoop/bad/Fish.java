package com.linkedin.mod4.incorrectoop.bad;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void fly() {
        // not applicable
    }

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }
}

