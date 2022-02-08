/*
    Purpose: Print the value of each side of both triangles as well as the value of the hypotenuse for both triangles.
    Author: Kevin Yang-li
    Version: 09/06/2020
 */
import java.lang.*;

public class PyTheoremm {
    public static void main(String[ ] args)
    {
        int triangleNum = 0;
        ++triangleNum;
        int sideOne = (int) (Math.random() * 18) + 5;
        int sideTwo = (int) (Math.random() * 18) + 5;
        double hypotenuse = Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2));
        System.out.println("Triangle: " + triangleNum + "\t\t" + "Side 1: " + sideOne + "\t\t" + "Side 2: " + sideTwo + "\t\t" + "Hypotenuse: " + hypotenuse);

        ++triangleNum;
        sideOne = (int) (Math.random() * 18) + 5;
        sideTwo = (int) (Math.random() * 18) + 5;
        hypotenuse = Math.sqrt(Math.pow(sideOne,2) + Math.pow(sideTwo,2));
        System.out.println("Triangle: " + triangleNum + "\t\t" + "Side 1: " + sideOne + "\t\t" + "Side 2: " + sideTwo + "\t\t" + "Hypotenuse: " + hypotenuse);

       if (6 / 8 == 0.0) {
           System.out.println(6 / 8);
       }


    }
}
