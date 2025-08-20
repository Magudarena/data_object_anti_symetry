package org.geometry.oop;

public class Circle implements org.geometry.oop.Shape {
    private org.geometry.oop.Point center;
    private double radius;

    public Circle(org.geometry.oop.Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * radius * 2;
    }
}
