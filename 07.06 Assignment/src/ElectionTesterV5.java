/*
Author: Kevin Yang-Li
version: 06/06/2021
purpose: display candidates for an election.
 */

import java.util.ArrayList;


public class ElectionTesterV5 {
    public static void main(String args[]) {
        Candidate[] list = {new Candidate("Kevin Yang",1000),new Candidate("Tony Stark",100),new Candidate("Brandon Black",532),new Candidate("Allan Pinkerton",345),new Candidate("Michelle Obama",534)};
        int total1 = add(list);
        table(list,total1);
        votec(123,"Chris Osorio",list);
        namec(list,"Daniel Black","YESSIR");
        vn(1,"OHno",list,"Tony Stark");
        addcandidate(list,1, "lord Farquad",1000);
        namefinderadd(list,"Allan Pinkerton","shrek", 167);

        table(list,total1);
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
    public static void addcandidate(Candidate[] list, int position, String newcandidate, int newcandidatevotes) {
        for(int index = list.length - 1; index > position; index--) {
            list[index] = list[index - 1];
        }
        list[position] = new Candidate(newcandidate, newcandidatevotes);

    }

    public static void namefinderadd(Candidate[] list, String findname,String insertedcand ,int insertedvotes) {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < list.length; index++)
            if(list[index].getName().equals(findname))
                location = index;

        //move items down in the array - last item is lost
        for(int index = list.length - 1; index > location; index--)
            list[index] = list[index-1];

        list[location] = new Candidate(insertedcand, insertedvotes);

    }
}