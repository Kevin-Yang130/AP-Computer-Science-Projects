/*
author: Kevin Yang-Li
Version: 10/14/2020
Purpose: Manage the ticket prices of the carnival
 */
import java.util.Scanner;

public class DBAS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: " );
        String firstname = scan.next() + scan.nextLine();
        int index = firstname.indexOf(" ");
        // age
        System.out.println("Please enter your age: ");
        String age = scan.next();
        int ages = Integer.parseInt(age);
        // veteran
        System.out.println(" Are you a veteran? (Y/N) " );
        String veteran = scan.next();
        String yes = "Y";
        int ticketprice = 0;

        if ( ages > 18) {
            ticketprice =  12;
        } else if (ages < 3) {
            ticketprice = 2;
        } else if (ages <= 5) {
            ticketprice = 9;
        } else if  (ages <= 18) {
            ticketprice = 11;
        }

        if ( veteran.equalsIgnoreCase(yes)) {
             ticketprice *= 0.5;
        }

        printticket(firstname,index, ticketprice);
    }

    private static void printticket(String a, int b, int c) {
        System.out.println("Welcome to the carnival!!");
        System.out.println("Your ID is " + a.charAt(0) + a.substring(b+1) + (int)(Math.random() * 1000) + 1);
        System.out.println("The cost of your ticket is " + c + "$");
        System.out.println("Have a great time in the carnival!!");
    }
}
