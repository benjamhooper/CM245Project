package AggregationWithArrayList;

import java.io.FileNotFoundException;

public class AssemblyTester {
    public static void main(String[] args)
            throws FileNotFoundException {
        Assembly a = new Assembly();
        a.load();
        a.print();
        a.remove("washer");
        a.print();

    }
} 
