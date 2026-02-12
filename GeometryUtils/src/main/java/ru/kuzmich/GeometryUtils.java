package ru.kuzmich;

import ru.kuzmich.figure.Shape;

public class GeometryUtils {

    public static double convertToUnit(double value, LengthUnit from, LengthUnit to) {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Units cannot be null");
        }
        return value * from.getFactor() / to.getFactor();
    }

    public static boolean areShapesEqual(Shape shape1, Shape shape2) {
        if (shape1 == null || shape2 == null) {
            return shape1 == shape2;
        }
        double epsilon = 0.0001;
        return Math.abs(shape1.calculateArea() - shape2.calculateArea()) < epsilon &&
               Math.abs(shape1.calculatePerimeter() - shape2.calculatePerimeter()) < epsilon;
    }
}
