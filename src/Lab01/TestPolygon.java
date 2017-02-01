package Lab01;

/**
 * @author Benjamin Hooper
 */
public class TestPolygon {

    public static void main(String[] args) {
       RegularPolygon polygon1 = new RegularPolygon(6, 4);
       RegularPolygon polygon2 = new RegularPolygon(10, 4);
       RegularPolygon polygon3 = new RegularPolygon(3, 2);
        System.out.println("Lab01 Benjamin Hooper");
        System.out.println("Printing Polygon 1 -------------");
        System.out.printf("Polygon: Area: %3.3f\n", polygon1.getArea());
        System.out.printf("Polygon: Perimeter: %3.3f\n", polygon1.getPerimeter());
        System.out.println("Polygon: Number of Sides: " + polygon1.getN());
        System.out.printf("Polygon: Side Length: %3.3f\n", polygon1.getSide());
        System.out.printf("Polygon: x-coordinate: %3.3f\n", polygon1.getX());
        System.out.printf("Polygon: y-coordinate: %3.3f\n", polygon1.getY());
        System.out.println("Printing Polygon 2 -------------");
        System.out.printf("Polygon: Area: %3.3f\n", polygon2.getArea());
        System.out.printf("Polygon: Perimeter: %3.3f\n", polygon2.getPerimeter());
        System.out.println("Polygon: Number of Sides: " + polygon2.getN());
        System.out.printf("Polygon: Side Length: %3.3f\n", polygon2.getSide());
        System.out.printf("Polygon: x-coordinate: %3.3f\n", polygon2.getX());
        System.out.printf("Polygon: y-coordinate: %3.3f\n", polygon2.getY());
        System.out.println("Printing Polygon 3 -------------");
        System.out.printf("Polygon: Area: %3.3f\n", polygon3.getArea());
        System.out.printf("Polygon: Perimeter: %3.3f\n", polygon3.getPerimeter());
        System.out.println("Polygon: Number of Sides: " + polygon3.getN());
        System.out.printf("Polygon: Side Length: %3.3f\n", polygon3.getSide());
        System.out.printf("Polygon: x-coordinate: %3.3f\n", polygon3.getX());
        System.out.printf("Polygon: y-coordinate: %3.3f\n", polygon3.getY()); 
        System.out.println("Exiting Program");
    }
}
