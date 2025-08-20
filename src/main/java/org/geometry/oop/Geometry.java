package org.geometry.oop;

public class Geometry {

    public static void main(String[] args) {
        Square square = new Square(new Point(2.5, 4.5), 3.0);
        System.out.println("Area of square is " + square.area());
        System.out.println("perimeter of square is " + square.perimeter());

        Rectangle rectangle = new Rectangle(new Point(10.0, 5.0), 5.0, 4.0);
        System.out.println("Area of rectangle is " + rectangle.area());
        System.out.println("perimeter of rectangle is " + rectangle.perimeter());

        Circle circle = new Circle(new Point(8.7, 4.0), 6.3);
        System.out.println("Area of circle is " + circle.area());
        System.out.println("perimeter of circle is " + circle.perimeter());

        Triangle triangle = new Triangle(6.3, 5.0, 4.0);
        System.out.println("Area of triangle is " + triangle.area());
        System.out.println("perimeter of triangle is " + triangle.perimeter());




    }
}
