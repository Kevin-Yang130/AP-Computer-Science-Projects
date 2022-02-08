/*
Author: Kevin Yang-Li
date: 08/04/2021
purpose: calculate the trajectory of an apple
 */


public class AppleTester {
    public static void main(String [] args) {
        // speed in KPH
        int [] speed = {10,20,30,40,50,60};
        // angles in degrees
        int [] angle = {10,20,30,40,50,60};
        double [][] twoDimArray = new double [6][6];

        // created an apple to be thrown
        Apple a = new Apple(speed[0],angle[0]);

        // giving values to the 2D array

          for (int i  = 0; i < twoDimArray.length ; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++ ) {
                twoDimArray[i][j] = a.calcdistance(speed[i],angle[j]);
            }
        }

        print(speed, angle, twoDimArray);

    }


    public static void print( int [] speed, int [] angle, double [][] twoDimArray){
        Apple a = new Apple(speed[0],angle[0]);
        // menu
        System.out.println("                                     Projectile Distance (meters)");
        System.out.print("KPH");
        for(int i = 0; i < twoDimArray.length; i++)
            System.out.printf("%12d %s", angle[i],"deg");
        System.out.println();
        System.out.println("===================================================================================================");
        for (int i  = 0; i < twoDimArray.length ; i++) {
            System.out.printf("%d %s", angle[i]," ");
            for (int j = 0; j < twoDimArray[i].length; j++ ) {
                System.out.printf("%15.3f ",a.calcdistance(speed[i],angle[j]));

            }
            System.out.println("");
        }

    }


}
