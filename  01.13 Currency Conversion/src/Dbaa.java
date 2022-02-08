/*
Author: Kevin Yang-Li
version: 09/09/2020
Purpose: To see how "2" is used with a value with different math operators
*/


public class Dbaa {
    public static void main(String[] args) {
        int value = 7 ;
        int numberTwo =  2;
        System.out.println("The original value is " + value);
        System.out.println("The whole number value when the number is divided by 2 is " + value / numberTwo);
        System.out.println("The remainder after the number is divided  by 2 is " + value % numberTwo);
        System.out.println("The decimal value when the number is divided by 2 is " + (double) value / numberTwo);
    }
}
