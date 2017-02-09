/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

/**
 *
 * @author zzschmid
 */
public class CustomerTester {

    public static void main(String[] args) {
        Customer c1 = new Customer("Sam", "785-670-1111");
        PreferredCustomer p1 = new PreferredCustomer("Sarah",
                "785-670-2222", 0.05);
        StandardCustomer s1 = new StandardCustomer();
        s1.setName("Joe");
        s1.setPhone("785-670-3333");

//        System.out.println(c1.toString());
//        System.out.println("--------------");
//        System.out.println(p1);
//        System.out.println("--------------");
//        System.out.println(s1);
        print(c1);
        print(p1);
        print(s1);
        printDiscount(c1);
        printDiscount(p1);
        printDiscount(s1);
    }

    public static void printDiscount(Customer c) {
            System.out.printf("%-20s %12s %.2f\n", c.getName(), c.getPhone(), c.getDiscount());
        }
        
    

    public static void print(Customer c) {
        if (c instanceof PreferredCustomer) {
            PreferredCustomer p = (PreferredCustomer) c;
            System.out.printf("%-20s %12s %.2f\n", p.getName(), p.getPhone(), p.getDiscount());
        } else {
            System.out.printf("%-20s %12s\n", c.getName(), c.getPhone());
            // 
            // polymorphism
            // System.out.println(c);
        }

    }
}
