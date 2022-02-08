/*
    Author: Kevin Yang-li
    Version: 10/06/2020
    Purpose: Calculate the BMI of a person
 */
import java.util.Scanner;
public class BMI {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        //name
        System.out.print("Please enter your first name and last name (first last): ");
        String firstName = scan.next();
        String lastName = scan.nextLine();

        //height
        System.out.print("Please enter your height in feet and inches (e.g. 5 11): ");
        double fheight = scan.nextDouble();
        String iheight = scan.nextLine();
        double infeet = Double.parseDouble(iheight);
        double mheight = fheight * 0.3048;
        double miheight = infeet * 0.0254;
        double finalHeight = miheight + mheight;

        //weight
        System.out.print("Please enter your weight in pounds (e.g 175): ");
        double weightp = scan.nextDouble();
        double weightkg = weightp * 0.453592;

        //BMI
        double BMI = weightkg/(finalHeight * finalHeight);

        System.out.println("");
        System.out.println("Body mass index calculator");
        System.out.println("===========================");
        System.out.println("name: " + firstName + lastName);
        System.out.println("Height (m): " + (int)(10 * finalHeight)/10.0);
        System.out.println("Weight (kg): " + (int)(10 * weightkg)/10.0);
        System.out.println("BMI: " + (int)(10 * BMI)/10.0);

        if (BMI < 18.5) {
            String category = "Underweight";
            System.out.println("Category: " + category);

        } else if (BMI <= 24.9) {
            String category = "Normal or Healthy Weight";
            System.out.println("Category: " + category);

        } else if (BMI < 29.9) {
            String category = "Overweight";
            System.out.println("Category: " + category);

        } else if (BMI >= 29.9) {
            String category = "Obese";
            System.out.println("Category: " + category);
        }
     }
}