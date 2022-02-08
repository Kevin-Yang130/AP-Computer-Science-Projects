/**
 * Annual Weather description:
 *
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{

    // method to calculate the average of temperature
    public static double Avgtemp(double[] temperature) {
        double avgLength = temperature.length;
        double average = 0;
        for (int i = 0; i < avgLength; i++) {
            average = average + temperature[i];
        }
        double finalAverage = average/avgLength;

        return finalAverage;
    }


    // method to calculate total precipitation array
    public static double Totalprep(double[] precipitation){
        double totalPreci = 0;
        int preLength = precipitation.length;
        for (int i = 0; i < preLength; i++) {
            totalPreci = totalPreci + precipitation[i];
        }
        return totalPreci;
    }

    // method to print results (formatting output will be done in 6.02)
    public static void Print(String[] month, String tempLabel, String precipLabel,String city, String state, double[] temperature, double[] precipitation,double averageTemp,double totalPrecip) {
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city + ", " + state);
        System.out.println("Month     Temperature (" + tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for (int index = 0; index < temperature.length; index++) {
            System.out.println(month[index]  + "\t\t\t" + temperature[index] + "\t\t\t" + precipitation[index] );
        }
        System.out.println("***************************************************");
        System.out.println("Average: " + averageTemp + "\t" +  "Annual: " + totalPrecip);
    }
    //Output: display table of weather data including average and total
    //System.out.println();
    //System.out.println("           Weather Data");
    //System.out.println("      Location: " + city +", " + state);
    //System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
    //System.out.println();
    //System.out.println("***************************************************");
    //for( int index = 0; index < temperature.length; index++)
    //{

    //}
    //System.out.println("Average: " + "    Total: ");



    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02

    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02



    public static void main(String args[])
    {
        //Declare and initialize variables
        Scanner in = new Scanner(System.in);  //will be used in 6.02
        String city = "Apalachicola";
        String state = "FL";

        String [] month = {"Jan.", "Feb." , "Mar." , "Apr.", "May.", "Jun.", "Jul.","Aug.", "Sep.", "Oct.", "Nov.", "Dec."};
        double [] temperature ={52.7,	55.3, 60.7,	66.8, 74.1,	80.0, 81.9,	81.7, 79.1, 70.2, 62.0,	55.2};
        double [] precipitation ={4.9, 3.8, 5.0, 3.0, 2.6, 4.3, 7.3, 7.3, 7.1, 4.2, 3.6, 3.5};

        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in

        double averageTemp = Avgtemp(temperature);
        double totalPrecip = Totalprep(precipitation);


        Print(month,tempLabel, precipLabel,city, state,temperature,precipitation,averageTemp,totalPrecip);
        //input to decide F/C and in/cm - to be completed in 6.02

        //conditions & method call to convert temp, if needed - to be completed in 6.02

        //conditions & method call to convert prec, if needed - to be completed in 6.02

        //method call to calculate the average temperature

        //method call to calculate the total precipitation

        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)






    }//end main
}//end class