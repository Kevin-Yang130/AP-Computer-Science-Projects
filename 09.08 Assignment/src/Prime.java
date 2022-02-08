/*
Author: Kevin Yang-Li
Version: 09/04/21
Purpose: Find the prime numbers of a certain list
 */

import java.util.ArrayList;

public class Prime {

    int max;
    int min;

     public Prime(int max, int min) {

         this.max = max;
         this.min = min;

         //list of prime numbers
         ArrayList<Integer> primes = new ArrayList();

         //total amount of prime numbers in a given range
         int numprimes = 0;

         // checks if a number is prime or not
         for(int m = this.min; m < this.max; m++) {
             boolean check = true;
             int i = 2;
             while( i <= m/2) {
                 if (m % i == 0) {
                     check = false;
                     break;
                 }
                 i++;
             }
             if(check == true) {
                 primes.add(m);
                 numprimes++;
             }
         }


         //print method
         print(numprimes, primes);
     }


     //prints the prime numbers and the total amount of prime numbers in the given range
     public static void print(int p, ArrayList<Integer> list) {
         for(Integer n: list) {
             System.out.println(n);
         }

         System.out.println("Number of prime numbers in the given range: " + p);
     }


}
