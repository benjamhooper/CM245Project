/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author Ben
 */
import java.util.Scanner;
public class OrderCalculator {
    public static void main(String[] args){
        System.out.print("Enter a value for radius>");
        Scanner in = new Scanner(System.in);
        double radius = in.nextDouble();
        
        //calculate the area of the circle
        Circle c = new Circle(radius);
        //double area = Math.PI * Math.pow(radius,2);
        
        //output the result to the terminal
        System.out.print("The area of a circle with radius ");
        System.out.printf("%1.2f", c.getradius());
        System.out.print(" is ");
        System.out.printf("%1.2f\n", c.calcArea());
    }
}
