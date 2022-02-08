/*
Author: Kevin Yang
Version: 10/06/2020
Purpose: This program should ask the user for their name, gender, and BMR.
 */

import java.util.Scanner;

public class TDEE {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //name
        System.out.print("Please insert your name (first last): ");
        String name = scan.next();
        String lastname = scan.nextLine();
        name += lastname;

        //gender
        System.out.print("Pleaser insert our gender (M/F): ");
        String gender = scan.next();

        //BMR
        System.out.print("Please enter your BMR: ");
        String bmr = scan.next();
        double bmr2 = Double.parseDouble(bmr);
        double af = 0;

        //Activity factor
        System.out.println("\n");
        System.out.println("Select your activity level: ");
        System.out.println(" [A] Resting (Sleeping, Reclining");
        System.out.println(" [B] Sedentary (minimal movement)");
        System.out.println(" [C] Light (Sitting, standing)");
        System.out.println(" [D] Moderate (light manual labor, Dancing, Riding bike)");
        System.out.println(" [E] Very active (team sports, hard manual labor)");
        System.out.println(" [F] Extremely active (Full-time Athlete, Heavy manual labor)");
        System.out.println("\n");

        System.out.print("Enter the letter corresponding to your activity level: ");
        String level = scan.next();
        // gender strings
        String male = "m";
        String female = "f";

        //option strings
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        String f = "f";

        if (level.equalsIgnoreCase(a)) {
             af = 1.0;
        } else if (level.equalsIgnoreCase(b)) {
             af = 1.3;
        } else if (level.equalsIgnoreCase(c) && gender.equals(male)) {
             af = 1.6;
        } else if (level.equalsIgnoreCase(c) && gender.equals(female)) {
             af = 1.5;
        } else if (level.equalsIgnoreCase(d) && gender.equalsIgnoreCase(male)) {
             af = 1.7;
        } else if (level.equalsIgnoreCase(d) && gender.equalsIgnoreCase(female)) {
             af = 1.6;
        } else if (level.equalsIgnoreCase(e) && gender.equals(male)) {
             af = 2.1;
        } else if (level.equalsIgnoreCase(e) && gender.equals(female)) {
             af = 1.9;
        } else if (level.equalsIgnoreCase(f) && gender.equals(male)) {
             af = 2.4;
        } else if (level.equalsIgnoreCase(f) && gender.equals(female)) {
             af = 2.2;
        } else {
            System.out.println("Invalid, non-menu item was entered.");
        }
        System.out.println("\n\n\n");
        System.out.println("Your results: ");
        System.out.println("Name: " + name + "\t\t\t" + "Gender: " + gender);
        System.out.println("BMR: " + bmr2 + " calories" + "\t\t" + "Activity Factor: " + af + " calories");
        System.out.println("TDEE: " + af * bmr2 + " calories");
    }
}
