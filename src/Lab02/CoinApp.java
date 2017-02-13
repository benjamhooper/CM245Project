/**
 * @author Benjamin Hooper
 */

package Lab02;

import java.util.*;
import java.io.*;

public class CoinApp
{
    public static void main(String[] args)
    throws FileNotFoundException
    {
        Purse p = new Purse();
        Scanner input = new Scanner(new File("coins.data"));
        while (input.hasNext())
        {
            String line = input.nextLine();
            String[] fields = line.split(",");
            String name = fields[0].trim();
            Coin c = new Coin(name);
            //System.out.println(line);
            //System.out.println(c.getValue());
            p.add(c);
        }
        p.print();

        double centAmmount = p.getTotal();
        double dollarAmmount = centAmmount / 100;
        System.out.println("total ammount in dollars: $" + dollarAmmount);
    }
}