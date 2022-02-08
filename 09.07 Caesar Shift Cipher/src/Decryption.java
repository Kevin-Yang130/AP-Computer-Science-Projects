/*
author: Kevin Yang-Li
version: 08/27/21
purpose: decrypt messages
 */


import java.util.Scanner;

public class Decryption {
    public static int shift;
    public static final String[] ALPHABET = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
            "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    public static String[] newalphabet;

    // creates a new alphabet to use for decryption based on the shift number
    public static String[] decryptionalpha(int s) {

        String[] encryptedAlpha = new String[ALPHABET.length];

        // cypher decryption
        for (int i = 0; i < ALPHABET.length; i++) {
            if (i + s < ALPHABET.length) {
                // 26 + (x-n)
                encryptedAlpha[i] = ALPHABET[shift + i];
            }else if (i + shift < ALPHABET.length) {
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
        newAlphabet = Decryption.decryptionalpha(shift);

        //original alphabet
        System.out.print("Original: ");
        for (int i = 0; i < Decryption.ALPHABET.length; i++){
            System.out.print(Decryption.ALPHABET[i]);
        }

        System.out.println();

        //decrypted alphabet
        System.out.print("Decrypted: ");
        for (int i = 0; i < newAlphabet.length; i++){
            System.out.print(newAlphabet[i]);
        }

        return shift;
    }

    // decryption of the message
    public static String messageDecryption(){

        Scanner input = new Scanner(System.in);
        System.out.println("What is your decrypted message?");
        String message = input.nextLine();

        String msg = "";

        for (int i = 0; i < message.length(); i++){
            String sub = message.substring(i, i+1);
            for (int j = 0; j < ALPHABET.length; j++){
                if (sub.equals(newalphabet[j])){
                    msg += ALPHABET[j];
                }
            }

        }

        return msg;

    }

}
