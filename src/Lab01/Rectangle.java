/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab01;

/**
 *
 * @author Ben
 */
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
