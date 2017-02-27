/**
 * @author Benjamin Hooper
 */

package Lab03;

public class Triangle 
        extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;
    
    Triangle(){
        side1 = side2 = side3 = 1.0;
    }
    
    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
    }
}
