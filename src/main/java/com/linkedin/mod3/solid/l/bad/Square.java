package com.linkedin.mod3.solid.l.bad;

public class Square extends Rectangle {
    public Square(int size) {
        super(size, size);
    }

    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(int height) {
        this.width = height;
        this.height = height;
    }
}

