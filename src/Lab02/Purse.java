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
    
    public String maxValue(){
        String result = "";
        double currentMax = 0;
        for(int i = 0; i < cnt; i++){
            if(currentMax < list[i].getValue()){
                currentMax = list[i].getValue();
                result = list[i].getName() + " = " + currentMax; 
            }
        }
        return result;
    }
    public void remove(double rmValue) {
        for(int i = 0; i < cnt; i++){
        if (rmValue == list[i].getValue()) {
            list[i].setValue(0);
            list[i].setName("");
            cnt--;
            break;
        }
        
      }
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
            
            double coinValue = Double.parseDouble(fields[1].trim());
            
            Coin c = new Coin();
            c.setName(coinName);
            c.setValue(coinValue);
            
            add(c);
        }
    }

    public void print() {
        for (int k = 0; k < cnt; k++) {
            System.out.println("Name = "
                    + list[k].getName()
                    + " Num = " + list[k].getValue());
        }
    }
}
