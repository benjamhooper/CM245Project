/*
* Rectangle 
* Takes width and height calculates the area    
* @author Benjamin Hooper
* @version 1.0
*/

package Lab01;

public class Rectangle {
    double length;
    double width;
    
    private Rectangle() {
        length = 1;
        width = 1;
    }
    public Rectangle(double length,double width){
            this.length = length;
            this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }
}
