/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExamples;

/**
 *
 * @author zzschmid
 */
public class CustomerTester {
    public static void main(String[] args) {
        Customer c1 = new Customer("Sam","785-670-1111");
        PreferredCustomer p1 = new PreferredCustomer("Sarah",
                "785-670-2222",0.05);
        StandardCustomer s1 = new StandardCustomer();
        s1.setName("Joe");
        s1.setPhone("785-670-3333");
        
        System.out.println(c1);
        System.out.println(p1);
        System.out.println(s1);
        
        
        
    }
    
}
