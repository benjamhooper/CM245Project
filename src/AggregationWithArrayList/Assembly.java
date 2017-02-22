
package AggregationWithArrayList;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Assembly {
    //private Part[] list;  //parts list
    private ArrayList<Part> list;
    private static final int SIZE = 5; 
    private int cnt = 0;
    public Assembly() {
        //list = new Part[SIZE];
        list = new ArrayList<>();
    }
    public void remove(String pName) {
        /*
        for (int k=0; k<cnt; k++) {
            if (list[k].getName().equals(pName)) {
                cnt--;
                list[k] = list[cnt];
                list[cnt] = null;
            }
        }
        */
        Part p = new Part(1,pName);
        list.remove(p);
        
        
    }
    public void add(Part p) {
        list.add(p);
        /*
       if (cnt < SIZE) {
            list[cnt] = p;
            cnt++;
        }
*/
    }
    public void load() throws FileNotFoundException {
        
        Scanner in = new Scanner(new File("parts_data.txt"));
        while (in.hasNext()) {  //while !EOF
            //read record from input
            String rec = in.nextLine();
            //split record into fields
            String[] fields = rec.split(","); 
            //trim the name 
            String partName = fields[1].trim();
            //trim and parse the number
            int partNumber = Integer.parseInt(fields[0].trim());
            //create a Part object
            Part p = new Part();
            //set the name and number
            p.setName(partName);
            p.setNum(partNumber);
            //add it to the list
            add(p);
        }

    }
    public void print() {
        /*
        for (int k = 0; k < cnt; k++) {
            System.out.println("Name = " 
                    + list[k].getName() +
                    "  Num = " + list[k].getNum());
        }    
*/
        System.out.println("----------");
        for (int k = 0; k < list.size(); k++) {
            System.out.println("Name = " 
                    + list.get(k).getName() +
                    "  Num = " + list.get(k).getNum());
        } 
        
    }   
}
