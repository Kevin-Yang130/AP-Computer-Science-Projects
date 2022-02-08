/*
author: kevin Yang-Li
Version: 07/26/21
Purpose
 */

public class MusicTesterV2 {
    public static void main(String [] args) {
        Music [] array = new Music[10];
        array[0] = new Music("Beggin", 2012, "John Black");
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

        // sorted by title
        Music [] sortedbytitle = titlesort(array);
        bytitle(sortedbytitle,"Clouds");

        // sorted by artist
        Music [] sortedbyartist = artistsort(array);
        byartist(sortedbyartist,"Michael Jackson");


        // sort by year
        Music [] sortedbyyear = yearsort(array);
        byyear(sortedbyyear,2012);



    }

    //print method
    public static void print(Music [] array) {
        System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
        System.out.println("================================================================");
        for (Music c : array) {
            System.out.printf("%-26s %-23d %-25s %n", c.getTitle(), c.getYear(), c.getArtist());
        }
    }

    //sorted by title using insertion
    public static Music []  titlesort(Music [] array) {
        Music[] musarray = new Music[array.length];

        for (int i = 0; i < array.length; i++){
            String ctitle = array[i].getTitle();
            int newInd = 0;
            int ind = i;


            while (ind > 0 && newInd ==0){
                if (ctitle.compareTo(musarray[ind-1].getTitle()) > 0){
                    newInd = ind;
                }else{
                    musarray[ind] = musarray[ind-1];
                }
                ind--;
            }
            musarray[newInd] = array[i];
        }

        return musarray;
    }

    // binary search by title
    public static void bytitle (Music [] array, String target) {
        int lowend = -1;
        int highend = array.length;
        int medium;

        while (highend - lowend > 1) {
            medium = (highend + lowend)/2;
            if (array[medium].getTitle().compareTo(target) > 0)
                highend = medium;
            else
                lowend = medium;
        }

        if (lowend != -1 && array[lowend].getTitle().equals(target)) {
            System.out.println("");
            System.out.println("searching for the title: " + target);
            System.out.println("");
            System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
            System.out.println("================================================================");
            System.out.printf("%-26s %-23d %-25s %n", array[lowend].getTitle(), array[lowend].getYear(), array[lowend].getArtist());
        }else{
            System.out.println("the year given could not be found on the list...");
        }
    }


    // using binary search to find songs within a certain year
    public static Music [] yearsort(Music [] array) {
        Music [] musiclist = new Music[array.length];
        for (int i = 0; i < array.length; i++){
            int cyear = array[i].getYear();
            int newInd = 0;
            int ind = i;


            while (ind > 0 && newInd ==0){
                if (cyear > musiclist[ind-1].getYear()){
                    newInd = ind;
                }else{
                    musiclist[ind] = musiclist[ind-1];
                }
                ind--;
            }
            musiclist[newInd] = array[i];
        }
        return musiclist;
    }

    public static void byyear(Music [] array, int target) {
        int highend = array.length;
        int lowend = -1;
        int medium;


        while (highend - lowend > 1)
        {
            medium = (highend + lowend)/2;
            if (target < (array[medium].getYear()))
                highend = medium;
            else
                lowend = medium;

        }
        if (lowend >= 0 && target == (array[lowend].getYear())) {
            System.out.println("");
            System.out.println("searching for songs in the year: " + target);
            System.out.println("");
            System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
            System.out.println("================================================================");
            for ( int i = lowend; i > -1; i--) {
                if (array[i].getYear() == target) {
                    System.out.printf("%-26s %-23d %-25s %n", array[i].getTitle(), array[i].getYear(), array[i].getArtist());
                }
            }
        }else {
            System.out.println("");
            System.out.println("The given year could not be found in the list");
        }


    }

    public static Music [] artistsort(Music [] array) {
        Music [] musiclist = new Music[array.length];
        for (int i = 0; i < array.length; i++){
            String cstudio = array[i].getArtist();
            int newInd = 0;
            int ind = i;


            while (ind > 0 && newInd ==0){
                if (cstudio.compareTo(musiclist[ind-1].getArtist()) > 0){
                    newInd = ind;
                }else{
                    musiclist[ind] = musiclist[ind-1];
                }
                ind--;
            }
            musiclist[newInd] = array[i];
        }
        return musiclist;
    }

    public static void byartist (Music [] array, String target) {
        int lowend = -1;
        int highend = array.length;
        int medium;

        while (highend - lowend > 1) {
            medium = (highend + lowend)/2;
            if (array[medium].getArtist().compareTo(target) > 0) {
                highend = medium;

            }
            else {
                lowend = medium;

            }

        }

        if (lowend != -1 && array[lowend].getArtist().equals(target)) {
            System.out.println("");
            System.out.println("searching for songs by the artist: " + target);
            System.out.println("");
            System.out.printf("%s %25s %25s %n", "title", "Year", "Artist");
            System.out.println("================================================================");
            for ( int i = lowend; i > -1; i--) {
                if (array[i].getArtist().equals(target)) {
                    System.out.printf("%-26s %-23d %-25s %n", array[i].getTitle(), array[i].getYear(), array[i].getArtist());
                }
            }
        }else{
            System.out.println("");
            System.out.println("The given artist could not be found in the list...");
        }

    }


}
