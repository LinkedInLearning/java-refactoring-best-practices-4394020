package com.linkedin.mod3.solid.l.refactored;

public class Square implements Shape {
    protected int size;

    public Square(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getArea() {
        return size * size;
    }
}

