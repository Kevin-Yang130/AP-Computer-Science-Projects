/*
author : Kevin Yang-li
Version: 10/17/2020
purpose:  calculate the probability that a family with two children will consist of two boys, a boy and a girl, or two girls.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Familyreader2 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\APCS Course Files\\Module 01\\Mod 01 Assignments\\04.03 Family Structure\\src\\maleFemaleInFamily.txt");
        Scanner scan = new Scanner(file);
        String token = "";

        // countings
        int totalcombinations = 0;
        int justboys = 0;
        int justgirls = 0;
        int combination = 0;


        //possible outcomes
        String boys = "BB";
        String girls = "GG";
        String combined = "BG";
        String combinedd = "GB";


        while (scan.hasNext()) {
            token = scan.next();

            if (token.equals(boys)) {
                justboys++;
            } else if (token.equals(girls)) {
                justgirls++;
            } else if (token.equals(combined) || token.equals(combinedd)) {
                combination++;
            } else {
                System.out.println("A combination not identified is present in the list");
            }

            totalcombinations++;



        }
        System.out.println("Composition statistics for families with two children. \n");
        System.out.println("Total number of families: \n");
        System.out.println("Number of families with");
        System.out.println("2 boys: " + justboys + "\t\t\t" + "represents: " + (int)(((double)justboys / totalcombinations) * 10000) / 100.0 + "%");
        System.out.println("2 girls: " + justgirls + "\t\t\t" + "represents: " + (int)(((double)justgirls / totalcombinations) * 10000) / 100.0 + "%");
        System.out.println("1 boy 1 girl: " + combination + "\t\t" + "represents: " + (int)(((double)combination / totalcombinations) * 10000) / 100.0 + "%");

    }
}
