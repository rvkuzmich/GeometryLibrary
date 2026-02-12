package ru.kuzmich.figure.impl;

import ru.kuzmich.figure.Shape;

public class Square implements Shape {
    private double side;

    public Square(double side) {
        if (side <= 0) {
            throw new IllegalArgumentException("Square side must be positive");
        }
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public String getType() {
        return "Square";
    }
}
