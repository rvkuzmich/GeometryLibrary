package ru.kuzmich.figure.impl;

import ru.kuzmich.figure.Shape;

public class Rectangle implements Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Rectangle dimensions must be positive");
        }
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
