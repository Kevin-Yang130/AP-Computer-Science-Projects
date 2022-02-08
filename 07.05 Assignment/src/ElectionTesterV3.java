/*
Author: Kevin Yang-Li
version: 06/06/2021
purpose: display candidates for an election.
 */

import java.util.ArrayList;


public class ElectionTesterV3 {
    public static void main(String args[]) {
        Candidate[] list = {new Candidate("Kevin Yang",1000),new Candidate("Tony Stark",100),new Candidate("Brandon Black",532),new Candidate("Allan Pinkerton",345),new Candidate("Michelle Obama",534)};
        int total1 = add(list);
        table(list,total1);
        votec(123,"Chris Osorio",list);
        namec(list,"Daniel Black","YESSIR");
        vn(1,"OHno",list,"Tony Stark");
        table(list,total1);

        ArrayList fruits = new ArrayList();
        fruits.add(5);
        fruits.add("caca");
        fruits.add(9.11);
        System.out.println(fruits.get(2));



    }


    public void print(Candidate[] list) {
        for ( int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
            System.out.println(list[i].getVotes());
        }
    }

    public static int add(Candidate[] list) {
        int total = 0;
        for ( int i = 0; i < list.length; i++) {
            total += list[i].getVotes();
        }
        return total;
    }
    //change the name of the candidate
    public static void votec (int newv, String target, Candidate[] list){
        String name;
        for (Candidate c: list){
            name = c.getName();
            if (name.equals(target)){
                c.setVotes(newv);
            }
        }
    }

    //change the amount of votes
    public static void namec (Candidate[] list,String oldName, String newName){
        String name;
        for (Candidate c: list) {
            name = c.getName();
            if (name.equals(oldName)){
                c.setName(newName);
            }
        }
    }

    //change both the name and amount of votes
    public static void vn (int nvote,String newName, Candidate[] list,String target){
        String currentName = "";
        for (Candidate c: list){
            currentName = c.getName();
            if (currentName.equals(target)){
                c.setName(newName);
                c.setVotes(nvote);
            }
        }
    }


    public static void table(Candidate[] list, int total) {
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate" + "         Votes" + "       % of Total Votes");
        double votes = 0;
        double percent = 0;
        for ( int i = 0; i < list.length; i++) {
            votes = list[i].getVotes();
            percent = votes / total * 100;
            System.out.printf("%-17s  %-5d  %18.2f  %n", list[i].getName(), list[i].getVotes(),percent);
        }
    }
}