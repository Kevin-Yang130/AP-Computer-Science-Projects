/*
Author: Kevin Yang-Li
Version: 09/19/2020
Purpose: An automated microphone store
 */

import java.util.Scanner;

public class Microphonesell {
    public static void main(String[] args) {

        // General information
        Scanner infoinput = new Scanner(System.in);
        System.out.println("Welcome to the Mico store! We hope you enjoy the experience");
        System.out.print("Before we get into the microphones, we would like to know who you are! What is your first name and last name? ");
        String name = infoinput.next();
        String last_name = infoinput.nextLine();
        System.out.print("Welcome " + name + "!! What is today's date? (mm/dd/yyyy) ");
        String date = infoinput.next();

        // microphone sell
        int total_price = 0;
        System.out.println("This is the microphone we have on sale: \t  Mico microphone: $25");
        System.out.print("There are 3 colors: 1.Red 2.Yellow 3.Blue  which color would you like? ");
        String color = infoinput.next();
        System.out.print("How many would you like to get?");
        String amount = infoinput.next();
        total_price = Integer.parseInt(amount) * 25;
        System.out.println("The total price for the purchase is " + total_price + "$");
        System.out.print("Please place your credit card number to complete the transaction: (xxxxx-xxx-xxxx)");
        //debit card number
        String debit_number =  infoinput.next();
        System.out.print("Please insert your PIN: (xxxx) ");
        //pin
        String pin = infoinput.next();
        System.out.println("transaction completed: " + total_price + "$" + " were charged from the debit card from your debit card");

        // receive
        System.out.println("-------------------------RECEIVE-------------------------");
        System.out.println("Name: " + name.substring(0,1) +  ". " + last_name );
        System.out.println("Order Number: " + name.substring(0,1) + last_name.substring(1,2) + debit_number.substring(6,9));
        System.out.println("Date: " + date.substring(0,2) + "-" + date.substring(3,5) + "-" + date.substring(6,10));
        System.out.println("Purchase: " + amount + " microphone/s");
        System.out.println("Color: " + color);
        System.out.println("Total price: $"+ total_price);
        System.out.println("Charged from: xxxxx-xxx-" + debit_number.substring(10,14));
        System.out.println("Thanks for coming to the Micostore!");
        System.out.println("---------------------------------------------------------");
    }

}
