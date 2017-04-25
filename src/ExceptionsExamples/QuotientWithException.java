package ExceptionsExamples;

import java.util.Scanner;
import java.util.InputMismatchException;

public class QuotientWithException {

    public static int quotient(int number1, int number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        try {
            System.out.print("Enter two integers: ");
            int number1 = input.nextInt();
            int number2 = input.nextInt();

            int result = quotient(number1, number2);
            System.out.println(number1 + " / " + number2 + " is "
                    + result);
        } catch (ArithmeticException ex) {
             System.out.println(ex.getMessage());
             //System.out.println("Exception: an integer "
             //       + "cannot be divided by zero ");
        } catch (InputMismatchException ex) {
            System.out.println("Exception: please enter an integer value");
        }

        System.out.println("Execution continues ...");
    }
}
