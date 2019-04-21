package Cardlytics;

/**
 * Take in 3 integer inputs, representing the sides of a triangle, and return
 * the triangle type (Scalene, isosceles, equilateral).
 */
public class Question1 {
    public static void main(String[] args) {
        Triangle q1 = new Triangle(6, 6, 6);
        System.out.println("What kind of triangle? " + q1.type.getName());
    }

}

enum TriangleType {
    EQUILATERAL("Equilateral"), ISOSCELES("Isosceles"), SCALENE("Scalene"), NA("NotTriangle");
    String name;

    TriangleType(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}

class Triangle {
    int sideA;
    int sideB;
    int sideC;
    TriangleType type;

    Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.type = getTriangleType();
    }

    private Boolean isTriangle() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return false;
        }
        if (sideA + sideB <= sideC) {
            return false;
        }
        if (sideA + sideC <= sideB) {
            return false;
        }
        if (sideB + sideC <= sideA) {
            return false;
        }

        return true;
    }

    private TriangleType getTriangleType() {
        if (!isTriangle()) {
            return TriangleType.NA;
        }

        if (sideA == sideB && sideA == sideC) {
            return TriangleType.EQUILATERAL;
        }

        if (sideA == sideB || sideA == sideC || sideB == sideC) {
            return TriangleType.ISOSCELES;
        }

        return TriangleType.SCALENE;
    }
}