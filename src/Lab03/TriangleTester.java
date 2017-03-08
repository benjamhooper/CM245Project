/**
 * @author Benjamin Hooper
 */
package Lab03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTester {

    public static void main(String[] args) {
    try{
        boolean run = true;
        while(run){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three side of the triangle: ");
        System.out.println("(Program will end if side is less than or equal to 0)");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (side1 <= 0){
        throw new IllegalArgumentException("Side cannot be negative.");
        } 
        if (side2 <= 0){
        throw new IllegalArgumentException("Side cannot be negative.");
        } 
        if (side3 <= 0){
        throw new IllegalArgumentException("Side cannot be negative.");
        } 
        System.out.print("Enter a color: ");
        String color = input.next();

        System.out.print("Is the triangle filled (true / false)? ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle.toString());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Triangle is" + (triangle.isFilled() ? "" : " not ")
                + " filled");
        }
    } catch (InputMismatchException | ArithmeticException ex){
        System.out.print("Invalid Input");
    }
  }
}