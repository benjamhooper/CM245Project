package ExceptionsExamples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assembly {

    private Part[] list;  //parts list
    private static final int SIZE = 5;
    private int cnt = 0;

    public Assembly() {
        list = new Part[SIZE];
    }

    public void remove(String pName) {
        for (int k = 0; k < cnt; k++) {
            if (list[k].getName().equals(pName)) {
                cnt--;
                list[k] = list[cnt];
                list[cnt] = null;
            }
        }

    }

    public void add(Part p) {
        if (cnt < SIZE) {
            list[cnt] = p;
            cnt++;
        }
    }

    public void load(String fName) throws FileNotFoundException {
        Scanner in = null;
        try {
            in = new Scanner(new File(fName));
            while (in.hasNext()) {  //while !EOF
                String rec = in.nextLine();
                String[] fields = rec.split(",");
                String partName = fields[1].trim();
                int partNumber = Integer.parseInt(fields[0].trim());
                Part p = new Part();
                p.setName(partName);
                p.setNum(partNumber);
                add(p);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Executing catch."); 
            throw ex;
        } finally {
            System.out.println("Executing finally");
            if (in != null) {
                in.close();
            }
        }
    }

    public void print() {
        for (int k = 0; k < cnt; k++) {
            System.out.println("Name = "
                    + list[k].getName()
                    + "  Num = " + list[k].getNum());
        }
    }
}
