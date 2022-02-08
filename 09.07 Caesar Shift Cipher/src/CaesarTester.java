/*
author: Kevin Yang-Li
version: 08/27/21
purpose: encrypt and decrypt messages
 */

import java.util.Scanner;


public class CaesarTester {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("Choose what you would like to do: (1) Encryption or (2) Decryption -enter 'quit' to stop the program");
        String choice = input.next();

        int shift = 0;

        String msg = "";

        if (choice.equals("1")) {

            shift = Encryption.getinfo();
            System.out.println();
            msg = Encryption.messageEncryption();
            System.out.print(" Message Encrypted: ");
            System.out.println(msg);

        } else if (choice.equals("2")) {  // decryption option

            shift = Decryption.getinfo();
            System.out.println();
            msg = Decryption.messageDecryption();
            System.out.print(" Message Decrypted: ");
            System.out.println(msg);

        }

        while (!choice.equals("quit")) {
            System.out.println("Choose what you would like to do: (1) Encryption or (2) Decryption -enter 'quit' to stop the program");
            choice = input.next();

            //encryption option
            if (choice.equals("1")) {

                shift = Encryption.getinfo();
                System.out.println();
                msg = Encryption.messageEncryption();
                System.out.print("New Message: ");
                System.out.println(msg);

            } else if (choice.equals("2")) {  // decryption option

                shift = Decryption.getinfo();
                System.out.println();
                msg = Decryption.messageDecryption();
                System.out.print("New Message: ");
                System.out.println(msg);

            }
        }
    }
}
