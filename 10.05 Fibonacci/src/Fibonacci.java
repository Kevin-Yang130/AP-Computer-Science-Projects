/*
Author: Kevin Yang-Li
Version: 09/13/2021
purpose: Allow the user to enter an integer value, and the project should calculate the Fibonacci number for that value
 */

public class Fibonacci {
    public int FibNumber (int n){
        //Recursion
        if (n <= 1){
            return n;
        }else{
            return FibNumber(n-1) + FibNumber(n-2);
        }
    }


}
