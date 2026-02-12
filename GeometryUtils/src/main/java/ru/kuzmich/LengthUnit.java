package ru.kuzmich;

public enum LengthUnit {
    MILLIMETER(0.001, "mm"),
    CENTIMETER(0.01, "cm"),
    METER(1.0, "m"),
    KILOMETER(1000.0, "km"),
    INCH(0.0254, "in"),
    FOOT(0.3048, "feet"),
    YARD(0.9144, "yard"),
    MILE(1609.344, "mile");

    private final double factor;
    private final String symbol;

    LengthUnit(double factor, String symbol) {
        this.factor = factor;
        this.symbol = symbol;
    }

    public double getFactor() {
        return factor;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }
}
