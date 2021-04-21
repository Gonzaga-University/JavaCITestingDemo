package edu.gonzaga;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    /**
     *  Constructor
     */
    public Rectangle() {
        setHeight(1);
        setWidth(1);
    }

    public Rectangle(double height, double width) {
        setHeight(height);
        setWidth(width);
    }

    @Override
    public double area() {
        return getHeight() * getWidth();
    }

    @Override
    public double perimeter() {
        double myPerimeter = 2 * getHeight() + 2 * getWidth();
        return myPerimeter;
    }
}
