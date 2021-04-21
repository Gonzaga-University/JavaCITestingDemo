package edu.gonzaga;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    double expectedAreaUnit;
    double expectedArea3x4;
    double expectedAreaFloat;
    Rectangle rectUnit;
    Rectangle rect3x4;
    Rectangle rectFloat;

    @BeforeEach
    void setUp() {
        expectedAreaUnit = 1;
        expectedArea3x4 = 12;
        expectedAreaFloat = 7.6 * 3.2;
        rectUnit = new Rectangle();
        rect3x4 = new Rectangle(3, 4);
        rectFloat = new Rectangle(7.6, 3.2);
    }

    @Test
    void testDefaultArea() {
        assertEquals(expectedAreaUnit, rectUnit.area());
    }

    @Test
    void test3x4Area() {
        assertEquals(expectedArea3x4, rect3x4.area());
    }

    @Test
    void testFloatArea() {
        assertEquals(expectedAreaFloat, rectFloat.area());
    }

    @Test
    void test3x4Perimeter() {
        double expectedPerimeter = 14;
        double foundPerimeter = rect3x4.perimeter();
        assertEquals(expectedPerimeter, foundPerimeter);
    }

    @Test
    void testSetHeight() {
        double expectedHeight = 15;
        Rectangle rect = new Rectangle();

        rect.setHeight(expectedHeight);         // Act

        double endHeight = rect.getHeight();
        assertEquals(expectedHeight, endHeight);
    }
}