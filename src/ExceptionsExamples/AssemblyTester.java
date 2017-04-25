
package ExceptionsExamples;


import java.io.FileNotFoundException;

public class AssemblyTester {
    public static void main(String[] args)
            //throws FileNotFoundException 
    {
         try {
            Assembly a = new Assembly();
            a.load("parts_data.txts");
            a.print(); 
         } catch (FileNotFoundException ex) {
             System.out.println("Exception: File not found.");
         }

    }
}
