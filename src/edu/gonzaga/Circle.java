package edu.gonzaga;

public class Circle implements Shape {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        setRadius(1);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    @Override
    public double area() {
        double myArea = Math.PI * Math.pow(radius, 2);
        return myArea;
    }

    @Override
    public double perimeter() {
        double myPerimeter = 2 * Math.PI * radius;
        return myPerimeter;
    }
}
