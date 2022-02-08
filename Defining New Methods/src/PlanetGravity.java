/*
Author: Kevin Yang-li
Version: 11/14/2020
Purpose:  determine the surface gravity (g) on a planet in our solar system.
 */



public class PlanetGravity {
    public static double surfaceGravity(double a, double b, double c) {
        return (a * b * Math.pow(10,23)) / Math.pow(c,2);
    }

    public static void showInfo(double a, double b, double c) {
        // rounding the data for a more neat display
        double roundmass = (int)(b * 100) / 100.0;
        double roundgrav = (int)(a * 100) / 100.0;
        System.out.println("\t\t\t Planetary Data");
        System.out.println("Planet \t Diameter(km) \t Mass(kg) \t g(m/s^2)");
        System.out.println("----------------------------------------------");
        System.out.println("Mercury\t\t" + c + "\t\t " + b + "E23"  + "\t\t  " + roundgrav );
    }

    public static void main(String args[]) {
    // In this case, I will use Mercury
        double gravconstant = 6.67 * Math.pow(10,-11);
        double mass = 3.30;
        double diameter = 4880;
        double radius =  (diameter / 2) * 1000;

        // calling the methods
        double gravitySurface = surfaceGravity(gravconstant, mass, radius);
        showInfo(gravitySurface,mass,diameter);
    }
}
