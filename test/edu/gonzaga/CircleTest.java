package edu.gonzaga;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getRadius() {
        double expectedRadius = 15.3;
        Circle cir = new Circle(expectedRadius);
        double foundRadius = cir.getRadius();

        assertEquals(expectedRadius, foundRadius);
    }

    @Test
    void setRadius() {
        double expectedRadius = 201;
        Circle cir = new Circle();
        cir.setRadius(expectedRadius);

        double foundRadius = cir.getRadius();
        assertEquals(expectedRadius, foundRadius);
    }

    @Test
    void area() {
        double radius = 19.9;
        double expectedArea = Math.PI * Math.pow(radius, 2);
        Circle cir = new Circle(radius);
        double foundArea = cir.area();
        assertEquals(expectedArea, foundArea, "Area found incorrect using Math library PI");
    }

    @Test
    void perimeter() {
        double radius = 19.9;
        double expectedPerimeter = 2 * Math.PI * radius;
        Circle cir = new Circle(radius);
        double foundPerimeter = cir.perimeter();
        assertEquals(expectedPerimeter, foundPerimeter, "Perimeter found incorrect using Math library PI");
    }
}