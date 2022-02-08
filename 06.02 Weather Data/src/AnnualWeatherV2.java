/*
Author: Kevin Yang-Li
version: 12/29/2020
Purpose: Show temperature and precipitation of a specific city.
 */

import java.util.Scanner;
public class AnnualWeatherV2
{

    // method to calculate the average of temperature
    public static double Avgtemp(double[] temperature) {
        double avgLength = temperature.length;
        double average = 0;
        for (int i = 0; i < avgLength; i++) {
            average = average + temperature[i];
        }
        double finalAverage = Math.round((average/avgLength) * 100)/10.0;

        return finalAverage;
    }


    // method to calculate total precipitation array
    public static double Totalprep(double[] precipitation){
        double totalPreci = 0;
        int preLength = precipitation.length;
        for (int i = 0; i < preLength; i++) {
            totalPreci = totalPreci + precipitation[i];
        }
        totalPreci = Math.round((totalPreci) * 10)/10.0;
        return totalPreci;
    }

    // method to print results (formatting output will be done in 6.02)
    public static void Print(String[] month, String tempLabel, String precipLabel,String city, String state, double[] temperature, double[] precipitation,double averageTemp,double totalPrecip) {
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city + ", " + state);
        System.out.println( "Month     Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for (int index = 0; index < temperature.length; index++) {
            System.out.printf("%s%15.1f%20.1f%n", month[index],temperature[index],precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.printf("Average: %.1f%20s%.1f ",averageTemp, "Annual: ",totalPrecip);
    }


    // F to C
    public static void Celconversion(double[] temperature) {
        for (int index = 0; index < temperature.length; index++) {
            temperature[index] = Math.round((temperature[index] - 32) * (5.0/9) * 10)/ 10.0;
        }

    }

    // inchs to cm
    public static void PrepInCent(double[] precipitation) {
        for (int index = 0; index < precipitation.length; index++) {
            precipitation[index] = Math.round((precipitation[index] * 2.54) * 10) /  10.0;
        }
    }

    public static void main(String args[])
    {
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Apalachicola";
        String state = "FL";

        String [] month = {"Jan.", "Feb." , "Mar." , "Apr.", "May.", "Jun.", "Jul.","Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double [] temperature ={52.7,	55.3, 60.7,	66.8, 74.1,	80.0, 81.9,	81.7, 79.1, 70.2, 62.0,	55.2};
        double [] precipitation ={4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};

        // before using the set below,please delete the 2 arrays above.
        // another set location: Tallahassee, FL
        /*
        double [] temperature = {51.8, 54.8, 61.1, 66.4, 74.4, 80.4, 82.4, 82.1, 78.9, 69.1, 60.4, 53.7};
        double [] precipitation = {5.4,	4.6,6.5,3.6,5.0,6.9,8.0,7.0,5.0,3.3,3.9	,4.1};
       */
        String prepscale = "";


        //scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Choose the temperature Scale: ( F = fahrenheit, C = Celsius ): " );
        Scanner secondInput = new Scanner(System.in);
        String temp = input.next();
        System.out.print("Choose the precipitation Scale: ( i = inches, c = centimeters): " );
        String prepresponse = secondInput.next();


        //celsius if-statement
        if (temp.equalsIgnoreCase("C") && prepresponse.equalsIgnoreCase("C")) {
            Celconversion(temperature);
            PrepInCent(precipitation);
            double averageTemp = Avgtemp(temperature);
            double totalPrecip = Totalprep(precipitation);
            String tempLabel = "C";
            String precipLabel = "cm.";
            Print(month,tempLabel, precipLabel,city, state,temperature,precipitation,averageTemp,totalPrecip);
        } else if(temp.equalsIgnoreCase("C") && prepresponse.equalsIgnoreCase("i")) {
            Celconversion(temperature);
            double averageTemp = Avgtemp(temperature);
            double totalPrecip = Totalprep(precipitation);
            String tempLabel = "C";
            String precipLabel = "in.";
            Print(month,tempLabel, precipLabel,city, state,temperature,precipitation,averageTemp,totalPrecip);
        } else if(temp.equalsIgnoreCase("F") && prepresponse.equalsIgnoreCase("C")) {
            PrepInCent(precipitation);
            double averageTemp = Avgtemp(temperature);
            double totalPrecip = Totalprep(precipitation);
            String tempLabel = "F";
            String precipLabel = "cm.";
            Print(month,tempLabel, precipLabel,city, state,temperature,precipitation,averageTemp,totalPrecip);
        } else if(temp.equalsIgnoreCase("F") && prepresponse.equalsIgnoreCase("i")) {
            String tempLabel = "F";
            String precipLabel = "in.";
            double averageTemp = Avgtemp(temperature);
            double totalPrecip = Totalprep(precipitation);
            Print(month,tempLabel, precipLabel,city, state,temperature,precipitation,averageTemp,totalPrecip);

    }




        //conditions & method call to convert temp, if needed - to be completed in 6.02

        //conditions & method call to convert prec, if needed - to be completed in 6.02

        //method call to calculate the average temperature

        //method call to calculate the total precipitation

        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)






    }//end main
}//end class