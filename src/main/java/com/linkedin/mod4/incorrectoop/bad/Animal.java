package com.linkedin.mod4.incorrectoop.bad;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void fly();

    public abstract void swim();
}

