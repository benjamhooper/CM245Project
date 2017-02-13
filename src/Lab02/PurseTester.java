/**
 * @author Benjamin Hooper
 */

package Lab02;

public class PurseTester {

    public static void main(String[] args) {
        Purse purse1 = new Purse();
        Coin newCoin = new Coin("QUARTER");
        purse1.add(newCoin);

        newCoin = new Coin("DIME");
        purse1.add(newCoin);

        purse1.add(new Coin("NICKEL"));
        purse1.add(new Coin("NICKEL"));
        purse1.add(new Coin("DIME"));
        purse1.add(new Coin("PENNY"));

        purse1.print();
        double centAmmount = purse1.getTotal();
        double dollarAmmount = centAmmount / 100;
        System.out.println("total ammount in dollars: $" + dollarAmmount);
    }
}
