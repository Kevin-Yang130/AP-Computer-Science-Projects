/*
Author: Kevin Yang-Li
Version: 09/04/21
Purpose: Find the prime numbers of a certain list
 */

import java.util.Scanner;

public class PrimeTester {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the minimun of the range: ");
        int lower = input.nextInt();

        System.out.println("Please input the maximmun of the range: ");
        int higher = input.nextInt();

        Prime num = new Prime(higher,lower);

    }

}
