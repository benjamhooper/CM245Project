package Examples;

/**
 *
 * @author Ben
 */
public class Circle {
    //properties
    private double radius;
    
    public Circle() {
        radius = 0;
    }
    public Circle(double radius){
        this.radius = radius; 
    }
    public double getradius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double calcArea() {
         return Math.PI * Math.pow(radius,2);
    }
    public double calcCirumference() {
        return 2 * Math.PI * radius;
    }
}
