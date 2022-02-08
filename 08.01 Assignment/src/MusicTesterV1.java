/*
author: kevin Yang-Li
Version: 07/26/21
Purpose
 */

public class MusicTesterV1 {
    public static void main(String [] args) {
        Music [] array = new Music[10];
        array[0] = new Music("Beggin", 2012, "john Black");
        array[1] = new Music("Clouds", 2012, "Ariana Grande");
        array[2] = new Music("Turtle", 2016, "Michael Jackson");
        array[3] = new Music("Computer", 2017, "Michael Jackson");
        array[4] = new Music("Microphone", 2018, "Bruno Mars");
        array[5] = new Music("Beach", 2019, "Shrek");
        array[6] = new Music("Stop it", 2002, "Winny poo");
        array[7] = new Music("What are these names?", 2001, "Michael Jordan");
        array[8] = new Music("not real ones", 2003, "Kitty");
        array[9] = new Music("Lazy to research", 2004, "Doggo");

        print(array);

        //search by title
        bytitle(array,"Stop it");

        //search by year
        byyear(array, 2012);
        //search by artist
        byartist(array,"Michael Jackson");
    }

    //print method
    public static void print(Music [] array) {
        System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
        System.out.println("================================================================");
        for (Music c : array) {
            System.out.printf("%-26s %-23d %-25s %n", c.getTitle(), c.getYear(), c.getArtist());
        }
    }

    //seaches for a song title
    public static void bytitle(Music [] array, String target) {
        System.out.println("");
        System.out.println("Searching for the song: " + target);
        System.out.println("");
        System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
        System.out.println("================================================================");
        for (Music c: array) {
            if (c.getTitle().equals(target)) {

                System.out.printf("%-26s %-23d %-25s %n", c.getTitle(), c.getYear(), c.getArtist());
                break;
            }
        }
    }

    public static void byyear (Music [] array, int target ) {
        System.out.println("");
        System.out.println("Searching fors songs in the year: " + target);
        System.out.println("");
        System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
        System.out.println("================================================================");

        for (Music c: array) {
            if (c.getYear() == target) {
                System.out.printf("%-26s %-23d %-25s %n", c.getTitle(), c.getYear(), c.getArtist());
            }
        }
    }

    public static void byartist(Music [] array, String target) {
        System.out.println("");
        System.out.println("Searching for songs by the artist : " + target);
        System.out.println("");
        System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
        System.out.println("================================================================");
        for (Music c: array) {
            if (c.getArtist().equals(target)) {
                System.out.printf("%-26s %-23d %-25s %n", c.getTitle(), c.getYear(), c.getArtist());
            }
        }
    }

}
