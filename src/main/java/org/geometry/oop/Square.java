package org.geometry.oop;

public class Square implements Shape {
    private Point topLeft;
    private double side;

    public Square(Point topLeft, double side) {
        this.topLeft = topLeft;
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
    @Override
    public double perimeter() {
        return side * 4;
    }
}
