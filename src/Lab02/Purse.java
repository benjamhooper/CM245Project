/**
 * @author Benjamin Hooper
 */
package Lab02;

import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;


public class Purse {

    private Coin[] list;
    private static final int MAX_Coin = 10;
    private int cnt = 0;

    public Purse() {
        list = new Coin[MAX_Coin];
    }

    public void add(Coin c) {
        if (cnt < MAX_Coin) {
            list[cnt] = c;
            cnt++;
        }
    }
    public void load() throws FileNotFoundException {
        Scanner in = new Scanner(new File("coins.data"));
        while (in.hasNext()) {
            String rec = in.nextLine();

            String[] fields = rec.split(",");

            String coinName = fields[0].trim();
            
            double coinValue = Integer.parseInt(fields[1].trim());
            
            Coin c = new Coin();
            c.getName(coinName);
            c.getValue(coinValue);
            
            add(c);
        }
    }

    public void print() {
        for (int k = 0; k < cnt; k++) {
            System.out.println("Name = "
                    + list[k].getName()
                    + "Num = " + list[k].getValue());
        }
    }
  }
    /*
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
