/*
author: Kevin Yang-Li
version: 08/27/21
purpose: encrypt messages
 */

import java.util.Scanner;


public class Encryption {


    public static int shift;
    public static final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static String[] newalphabet;

    // creates a new alphabet to use for encryption based on the shift number
    public static String[] Encryptionalpha(int s) {
        shift = s;
        String[] encryptedAlpha = new String[ALPHABET.length];

        for (int i = 0; i < ALPHABET.length; i++) {
            if (i + s < ALPHABET.length) {
                // 26 + (x-n)
                encryptedAlpha[i] = ALPHABET[ i + shift];
            }else if (i + s < ALPHABET.length) {
                // (x-n)
                encryptedAlpha[i] = ALPHABET[i - shift];
            }else{
                int k = 0;
                for (i = i; i < ALPHABET.length; i++){
                    encryptedAlpha[i] = ALPHABET[k];
                    k++;
                }
            }
        }
        newalphabet = encryptedAlpha;
        return encryptedAlpha;
    }


    // Ask for the shift value and print the old and new alphabets
    public static int getinfo() {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your shift key value (0-25)?");
        final int shift = input.nextInt();

        System.out.println();

        String[] newAlphabet = new String[26];
        newAlphabet = Encryption.Encryptionalpha(shift);

        System.out.print("Original: ");
        for (int i = 0; i < Encryption.ALPHABET.length; i++){
            System.out.print(Encryption.ALPHABET[i]);
        }

        System.out.println();

        System.out.print("Encrypted: ");
        for (int i = 0; i < newAlphabet.length; i++){
            System.out.print(newAlphabet[i]);
        }

        return shift;
    }


    // encrypts the message
    public static String messageEncryption(){

        Scanner input = new Scanner(System.in);

        System.out.println("What message would you like encrypted?");
        String message = input.nextLine();

        String msg = "";

        for (int i = 0; i < message.length(); i++){
            String sub = message.substring(i, i+1);
            for (int j = 0; j < newalphabet.length; j++){
                if (sub.equals(ALPHABET[j])){
                    msg += newalphabet[j];
                }
            }
        }

        return msg;

    }

}
