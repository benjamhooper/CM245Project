/**
 * @author Benjamin Hooper
 */
package Lab02;

import java.util.*;

public class Purse {

public static int MAX_Coin = 10;

    public static void main(String args[]) {

        int i;
        for (i = 0; i < 10; i++) {
      Coin[]=Lab02.Coin[];
      Coin = new Coin[1]("DIME",double 0.10);
      Coin[2] = new Coin("NICKEL", double 0.05);
      Coin[3] = new Coin("PENNY", double 0.01);
      Coin[4] = new Coin("PENNY", double 0.01);
      Coin[5] = new Coin("QUARTER", double 0.25);
      Coin[6] = new Coin("DIME", double 0.10);
    }
     
}
    private double[] Coin;
    private int numberOfCoin;

    public double maxValue() {
        return 0.25;
    }

    public String maxCoin() {
        return ("QUARTER");
    }

    public void add(Coin aCoin) {
        if (getNumberOfCoin() < MAX_Coin) {
            Coin[getNumberOfCoin()] = aCoin;
            numberOfCoin++;
        }

    public double getNumberOfCoin() {
        return numberOfCoin;
    }

    public double sum() {
        return Coin[1] + Coin[2] + Coin[3] + Coin[4] + Coin[6] + Coin[7] + Coin[8];
    }

}
    /*
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList<Coin>();
    }

    public void add(Coin c) {
        coins.add(c);
    }

    public void remove(int r) {
        coins.remove(r);
    }

    public void print() {
        for (int k = 0; k < coins.size(); k++) {
            Coin c = coins.get(k);
            System.out.println("coin: " + c.getName() + " value: " + c.getValue());

        }
        System.out.println("Total Value: " + getTotal());
    }

    public double getTotal() {
        double totalValue = 0;
        for (int k = 0; k < coins.size(); k++) {
            Coin c = coins.get(k);
            totalValue = totalValue + c.getValue();
        }
        return totalValue;
    }
}
*/
