/**
 * @author Benjamin Hooper
 */
package Lab04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cInput = true;

        System.out.println("Enter two numbers: ");
        do {
            try {
                int n1 = input.nextInt();
                int n2 = input.nextInt();

                System.out.println("Sum of these numbers are: " + (n1 + n2));

                cInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Wrong, Two integers are required.");
                System.out.println("Please enter two numbers: ");
                input.nextLine();
            }

        } while (cInput);
    }

}
