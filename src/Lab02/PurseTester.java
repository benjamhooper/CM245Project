/**
 * @author Benjamin Hooper
 */

package Lab02;

import java.io.FileNotFoundException;

public class PurseTester {

    public static void main(String[] args) throws FileNotFoundException {
        Purse purse1 = new Purse();
        purse1.load();
        System.out.println("Max Coin: " + purse1.maxValue());
        purse1.remove(0.01);
        purse1.print();
        System.out.printf("\n");
        purse1.add(new Coin("DIME",0.10));
        purse1.add(new Coin("DIME",0.10));
        purse1.print();
        //
    }
}
