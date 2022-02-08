/**
 * Starter code for the Hurricane Tester
 * Author: Kevin Yang-Li
 * Date: 07/13/2021
 * Purpose: categorize hurricanes
 *
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class HurricaneTester

{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("C:/APCS Course Files/Challenge Program/src/HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        //count number of lines in text file
        while (inFile.hasNextLine())
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();


        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];

        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;

        }
        inFile.close();

        //convert the windspeed, determine categories, calculate sums
        for (int i = 0; i < windSpeeds.length; i++) {
            windSpeeds[i] *= 1.151;
        }


        int [] category = new int[numValues];
        for (int i = 0; i < numValues; i++){
            if (windSpeeds[i] <= 95){
                category[i] = 1;
            }else if (windSpeeds[i] <= 110){
                category[i] = 2;
            }else if (windSpeeds[i] <= 129){
                category[i] = 3;
            }else if (windSpeeds[i] <= 156){
                category[i] = 4;
            }else{
                category[i] = 5;
            }
        }

        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricanes = new ArrayList<Hurricane>(numValues);
        for (int i = 0; i < numValues; i++){
            hurricanes.add(i, new Hurricane(years[i], names[i], months[i], category[i], pressures[i], windSpeeds[i]));
        }

        //user prompted for range of years
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < years.length; i++)
        {
            if (years[i] < min)
                min = years[i];
            if (years[i] > max)
                max = years[i];
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please insert the lowest year in your range:");
        String lowYear = input.next();

        int lower = Integer.parseInt(lowYear);
        while (lower < min){
            System.out.println("Please insert a valid input:");
            lowYear = input.next();
            lower = Integer.parseInt(lowYear);
        }


        System.out.println("Please insert the highest  year in your range:");
        String highYear = input.next();
        int higher = Integer.parseInt(highYear);

        while (higher > max){
            System.out.println("Please insert a valid input:");
            highYear = input.next();
            higher = Integer.parseInt(highYear);
        }

        //print the data
        int rangemax = 0;
        int rangemin = 0;
        int hurricanenum = 0;
        for (int i = 0; i < years.length; i++){
            if (years[i] == lower){
                rangemin = i;
                break;
            }

        }
        for (int i = 0; i < years.length; i++){
            if (years[i] == higher) {
                rangemax = i;
            }
        }
        for (int i = rangemin; i < rangemax; i++){
            hurricanenum = i;
        }
        hurricanenum += 2;



        System.out.printf("%1s  %12s  %11s  %10s  %12s %n", "Year", "Name", "Category", "Pressure", "Wind Speed");
        System.out.println("==========================================================");

        double sumCat = 0;
        double sumwind = 0;
        double sumpress = 0;

        // total hurri counts how many hurricanes are supposed to be shown
        int totalhurri = 0;
        for (int i = rangemin; i < hurricanenum; i++){
            totalhurri++;
            System.out.printf("%-10d  %-13s  %-8d  %-7d  %10.2f %n", years[i], names[i], category[i], pressures[i], windSpeeds[i]);
            sumCat += category[i];
            sumwind += windSpeeds[i];
            sumpress += pressures[i];
        }
        sumCat /= totalhurri;
        sumwind /= totalhurri;
        sumpress /= totalhurri;


        //min for wind speed and category
        int mincat = 0;
        double minwind = 0;
        for (int i = rangemin; i < hurricanenum; i++) {
            int nextelement = i + 1;
            if (windSpeeds[i] <= windSpeeds[nextelement]) {
                minwind = windSpeeds[i];
                mincat =  category[i];
            }
        }
        // find the min pressure
        int minpres = pressures[0];
        for (int i = rangemin; i < hurricanenum; i++) {
            if (pressures[i] <= minpres) {
                minpres = pressures[i];
            }
        }
        // max wind speed and category
        int maxcat = 0;
        double maxwind = windSpeeds[0];
        for (int i = rangemin; i < hurricanenum; i++) {
            if (windSpeeds[i] > maxwind) {
                maxwind = windSpeeds[i];
                maxcat =  category[i];
            }
        }
        // find the max pressure
        int maxpres = pressures[0];
        for (int i = rangemin; i < hurricanenum; i++) {
            if (pressures[i] >= maxpres) {
                maxpres = pressures[i];
            }
        }



        System.out.println("==========================================================");
        System.out.println("");
        System.out.printf("%21s %6.1f %11.1f  %14.2f %n","Average: ",sumCat, sumpress,sumwind);
        System.out.printf("%21s %6d %10d  %14.2f %n","Minimum: ",mincat, minpres,minwind);
        System.out.printf("%21s %6d %10d   %14.2f %n","Maximum: ",maxcat, maxpres,maxwind);
        System.out.println("");
        System.out.println("==========================================================");

        // The summary of the categories
        int cat1 = 0;
        int cat2 = 0;
        int cat3 = 0;
        int cat4 = 0;
        int cat5 = 0;
        for (int i = rangemin; i < hurricanenum; i++){
            if(category[i] == 1) {
                cat1++;
            } else if (category[i] == 2) {
                cat2++;
            }else if (category[i] == 3) {
                cat3++;
            }else if (category[i] == 4) {
                cat4++;
            }else if (category[i] == 5) {
                cat5++;
            }
        }
        System.out.println("Summary of categories:");
        System.out.println( "Cat 1: " + cat1);
        System.out.println( "Cat 2: " + cat2);
        System.out.println( "Cat 3: " + cat3);
        System.out.println( "Cat 4: " + cat4);
        System.out.println( "Cat 5: " + cat5);



    }
}