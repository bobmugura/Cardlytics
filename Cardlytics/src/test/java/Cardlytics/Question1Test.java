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
        assertEquals(q1.type, TriangleType.EQUILATERAL);
        assertEquals(q1.type.getName(), TriangleType.EQUILATERAL.getName());
    }

    @Test
    public void isoscelesTriangleTest() {
        Triangle q1 = new Triangle(22, 22, 10);
        assertEquals(q1.type, TriangleType.ISOSCELES);
        assertEquals(q1.type.getName(), TriangleType.ISOSCELES.getName());
    }

    @Test
    public void scaleneTriangleTest() {
        Triangle q1 = new Triangle(13, 8, 10);
        assertEquals(q1.type, TriangleType.SCALENE);
        assertEquals(q1.type.getName(), TriangleType.SCALENE.getName());
    }

    @Test
    public void nonTriangleTest() {
        Triangle q1 = new Triangle(10, 2, 6);
        assertEquals(q1.type, TriangleType.NA);
        assertEquals(q1.type.getName(), TriangleType.NA.getName());

        q1 = new Triangle(-3, 4, 10);
        assertEquals(q1.type, TriangleType.NA);
        assertEquals(q1.type.getName(), TriangleType.NA.getName());

        q1 = new Triangle(-3, -4, 10);
        assertEquals(q1.type, TriangleType.NA);
        assertEquals(q1.type.getName(), TriangleType.NA.getName());

        q1 = new Triangle(3, 4, -10);
        assertEquals(q1.type, TriangleType.NA);
        assertEquals(q1.type.getName(), TriangleType.NA.getName());
    }
}
