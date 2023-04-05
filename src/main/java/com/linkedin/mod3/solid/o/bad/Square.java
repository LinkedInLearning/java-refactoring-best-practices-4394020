package com.linkedin.mod3.solid.o.bad;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public void setWidth(double width) {
        this.width = width;
        this.height = width;
    }

    public void setHeight(double height) {
        this.width = height;
        this.height = height;
    }
}

