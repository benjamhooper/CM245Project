/**
 * @author Benjamin Hooper
 */
package Lab03;

public class Triangle
        extends GeometricObject {

    private double side1;
    private double side2;
    private double side3;

    Triangle() {
        side1 = side2 = side3 = 1.0;
    }

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double side1() {
        return side1;
    }

    public double side2() {
        return side2;
    }

    public double side3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}
