/*
* Rectangle 
* Takes width and height calculates the area    
* @author Benjamin Hooper
* @version 1.0
*/

package Lab01;

public class Rectangle {
    private double length;
    private double width;
    
    public Rectangle() {
        length = 0;
        width = 0;
    }
    public Rectangle(double length,double width){
            this.length = length;
            this.width = width;
    }
    public double calcArea() {
        return length * width;
    }
}
