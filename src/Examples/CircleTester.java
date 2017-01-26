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
public class CircleTester {

    public static void print(Circle[] cList) {
        System.out.println("==================================");
        for (int k = 0; k < cList.length; k++) {
            System.out.print("The area of a circle with radius ");
            System.out.printf("%1.2f", cList[k].getRadius());
            System.out.print(" is ");
            System.out.printf("%1.2f", cList[k].calcArea());
            System.out.print(" and circumference ");
            System.out.printf("%1.2f\n", cList[k].calcCirumference());
        }

    }

    public static double sum(Circle[] cList) {
        double total = 0;
        for (int k = 0; k < cList.length; k++) {
            total = total + cList[k].calcArea();
        }
        return total;
    }

    public static double avg(Circle[] cList) {
        double sum = CircleTester.sum(cList);
        double avg = sum / cList.length;
        return avg;
    }

    public static double max(Circle[] cList) {
        double max = cList[0].calcArea();
        for (int k = 0; k < cList.length; k++) {
            if (cList[k].calcArea() > max) {
                max = cList[k].calcArea();
            }
        }
        return max;
    }

    public static Circle maxCircle(Circle[] cList) {
        Circle max = cList[0];
        for (int k = 0; k < cList.length; k++) {
            if (cList[k].calcArea() > max.calcArea()) {
                max = cList[k];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Circle[] list; //null
        list = new Circle[3]; // Circle Array 3 elements (Null, null, null)
        list[0] = new Circle(5); // Then referneces array
        list[1] = list[0]; //2 references 
        Circle c = new Circle(7);
        list[2] = c;
        //CircleTester.print(list);
        list[0].setRadius(3);
        //CircleTester.print(list);
        c.setRadius(20);
        //CircleTester.print(list);
        c = null;
        print(list);
        double avg = CircleTester.avg(list);
        System.out.printf("Avg area is: %1.2f\n", avg);
        System.out.printf("MAX area is: %1.2f\n", CircleTester.max(list));
        Circle maxC = CircleTester.maxCircle(list);
        System.out.print("The area of max circle with radius ");
        System.out.printf("%1.2f", maxC.getRadius());
        System.out.print(" is ");
        System.out.printf("%1.2f", maxC.calcArea());
        System.out.print(" and circumference ");
        System.out.printf("%1.2f\n", maxC.calcCirumference());

//        System.out.print("Enter a value for radius>");
//        Scanner in = new Scanner(System.in);
//        double radius = in.nextDouble();
//        
//        //calculate the area of the circle
//        Circle c = new Circle(radius);
//        //double area = Math.PI * Math.pow(radius,2);
//        
//        //output the result to the terminal
//        System.out.print("The area of a circle with radius ");
//        System.out.printf("%1.2f", c.getradius());
//        System.out.print(" is ");
//        System.out.printf("%1.2f", c.calcArea());
//        System.out.print(" and circumference ");
//        System.out.printf("%1.2f\n", c.calcCirumference());
    }
}
