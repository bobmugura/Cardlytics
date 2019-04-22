package Cardlytics;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for Questions 1
 */
public class Question1Test {

    @Test
    public void equilateralTriangleTest() {
        Triangle q1 = new Triangle(6, 6, 6);
        assertEquals(TriangleType.EQUILATERAL, q1.type);
        assertEquals(TriangleType.EQUILATERAL.getName(), q1.type.getName());
    }

    @Test
    public void isoscelesTriangleTest() {
        Triangle q1 = new Triangle(22, 22, 10);
        assertEquals(TriangleType.ISOSCELES, q1.type);
        assertEquals(TriangleType.ISOSCELES.getName(), q1.type.getName());
    }

    @Test
    public void scaleneTriangleTest() {
        Triangle q1 = new Triangle(13, 8, 10);
        assertEquals(TriangleType.SCALENE, q1.type);
        assertEquals(TriangleType.SCALENE.getName(), q1.type.getName());
    }

    @Test
    public void nonTriangleTest() {
        Triangle q1 = new Triangle(10, 2, 6);
        assertEquals(TriangleType.NA, q1.type);
        assertEquals(TriangleType.NA.getName(), q1.type.getName());

        q1 = new Triangle(-3, 4, 10);
        assertEquals(TriangleType.NA, q1.type);
        assertEquals(TriangleType.NA.getName(), q1.type.getName());

        q1 = new Triangle(-3, -4, 10);
        assertEquals(TriangleType.NA, q1.type);
        assertEquals(TriangleType.NA.getName(), q1.type.getName());

        q1 = new Triangle(3, 4, -10);
        assertEquals(TriangleType.NA, q1.type);
        assertEquals(TriangleType.NA.getName(), q1.type.getName());
    }
}
