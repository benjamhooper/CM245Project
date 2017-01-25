/*
* Rectangle 
* Takes width and height calculates the area    
* @author Benjamin Hooper
* @version 1.0
*/
package Lab01;

import java.util.Scanner;

public class TestRectangle {

public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    double w,l;
    do{
    System.out.print("Enter Width> ");
    w = input.nextDouble();
    
    System.out.print("Enter Length> ");
    l = input.nextDouble();        
    
        Rectangle rectangle1 = new Rectangle(w,l);

        System.out.println("-------------");
        System.out.println("- Rectangle -");
        System.out.println("-------------");
        System.out.println("Width: " + rectangle1.width);
        System.out.println("Length: " + rectangle1.length);
        System.out.printf("Area: %3.3f\n", rectangle1.getArea());
        System.out.printf("Perimeter: %3.3f\n", rectangle1.getPerimeter());
    }
    while(w >= 0 && l >= 0);
  }
}
