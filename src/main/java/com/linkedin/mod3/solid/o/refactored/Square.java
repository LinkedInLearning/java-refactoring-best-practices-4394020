package com.linkedin.mod3.solid.o.refactored;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
        return side * side;
    }
}

