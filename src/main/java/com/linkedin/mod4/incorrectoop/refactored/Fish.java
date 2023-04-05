package com.linkedin.mod4.incorrectoop.refactored;

public class Fish implements Swimmer {
    private String name;

    public Fish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println("I am swimming.");
    }
}

