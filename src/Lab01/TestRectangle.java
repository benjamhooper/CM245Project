/*
* Rectangle 
* Takes width and height calculates the area    
* @author Benjamin Hooper
* @version 1.0
*/

package Lab01;

public class TestRectangle {

public static void main(String[] args){
    Rectangle rectangle1 = new Rectangle(4, 40);
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    
    System.out.println("---------------");
    System.out.println("- Rectangle 1 -");
    System.out.println("---------------");
    System.out.println("Width: " + rectangle1.width);
    System.out.println("Length: " + rectangle1.length);
    System.out.printf("Area: %3.3f\n", rectangle1.getArea());
    System.out.printf("Perimeter: %3.3f\n", rectangle1.getPerimeter());
    
    System.out.println("---------------");
    System.out.println("- Rectangle 2 -");
    System.out.println("---------------");
    System.out.println("Width: " + rectangle2.width);
    System.out.println("Length: " + rectangle2.length);
    System.out.printf("Area: %3.3f\n", rectangle2.getArea());
    System.out.printf("Perimeter: %3.3f\n", rectangle2.getPerimeter());
    
 }
}
