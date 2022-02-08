/*
Author: Kevin Yang-Li
Version: 09/12/2004
Purpose: Allow the user to enter an integer value, and the project should calculate the Fibonacci number for that value
 */

import java.util.Scanner;

public class FibonnacciTester {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type the number that you would like to go in the Fibonacci Number Sequence: ");
        int num = input.nextInt();

        //ensures that the user inputs a positive number
        while (num <= 0){
            System.out.println("Your number must be positive. Enter a valid number");
            num = input.nextInt();
        }

        // an object fibs is created in order to access the FibNumber method
        Fibonacci fibs = new Fibonacci();
        int result = fibs.FibNumber(num);


        System.out.println("The Number is: " + result);
        // if the user wants to input another number
        System.out.println("Would you like to input another number?  (yes/no)");
        String decision = input.next();

        // Iterate until the user does not want to
        while (decision.equals("yes")){
            System.out.println("Please type the number that you would like to go in the Fibonacci Number Sequence: ");
            num = input.nextInt();

            while (num <= 0){
                System.out.println("Your number must be positive. Enter a valid number");
                num = input.nextInt();
            }

            result = fibs.FibNumber(num);
            System.out.println("The Number is: " + result);
            System.out.println("Would you like to input another number?  (yes/no)");
            decision = input.next();

        }
    }

}
