/*
Author: Kevin Yang-Li
version: 06/06/2021
purpose: display candidates for an election.
 */


import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;

public class ElectionTesterV6 {
    public static void main(String args[]) {
        ArrayList<Candidate> list = new ArrayList<Candidate>();
        list.add(new Candidate("Kevin Yang",1000));
        list.add(new Candidate("Chris Osorio",321));
        list.add(new Candidate("Daniel Black",546));
        list.add(new Candidate("Tony Stark",643));
        list.add(new Candidate("Winy poo",768));

        int total1 = add(list);
        votec(123,"Chris Osorio",list);
        namec(list,"Daniel Black","YESSIR");
        vn(1,"OHno",list,"Tony Stark");
        insertcan(list,2, "lord Farquad",10000);
        insertfindcan(list,"Winy poo","shrek", 167);
        table(list,total1);
    }


    public void print(ArrayList<Candidate> list) {
        for (Candidate c: list) {
            System.out.println(c.getName());
            System.out.println(c.getVotes());
        }
    }

    public static int add(ArrayList<Candidate> list) {
        int total = 0;
        for ( Candidate c: list) {
            total += c.getVotes();
        }
        return total;
    }

    //change the name of the candidate
    public static void votec (int newv, String target, ArrayList<Candidate> list){
        System.out.println("changing " + target +  "'s votes to " + newv + ".....");
        String name;
        for (Candidate c: list){
            name = c.getName();
            if (name.equals(target)){
                c.setVotes(newv);
            }
        }

    }

    //change the amount of votes
    public static void namec (ArrayList<Candidate> list,String oldName, String newName){
        System.out.println("changing " + oldName +  " to " + newName + ".....");
        String name;
        for (Candidate c: list) {
            name = c.getName();
            if (name.equals(oldName)){
                c.setName(newName);
            }
        }
    }

    //change both the name and amount of votes
    public static void vn (int nvote,String newName, ArrayList<Candidate> list,String target){
        System.out.println("changing " + target +  " to " + newName + " and his respective amount of votes.....");
        String currentName = "";
        for (Candidate c: list){
            currentName = c.getName();
            if (currentName.equals(target)){
                c.setName(newName);
                c.setVotes(nvote);
            }
        }
    }

    public static void table(ArrayList<Candidate> list, int total) {
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate" + "         Votes" + "       % of Total Votes");
        System.out.println("=======================================================");
        double votes = 0;
        double percent = 0;
        for ( Candidate c: list) {
            votes = c.getVotes();
            percent = votes / total * 100;
            System.out.printf("%-17s  %-5d  %18.2f  %n", c.getName(), c.getVotes(),percent);
        }
        System.out.println();
        System.out.println("The total number of votes:" + total);
    }
    public static void insertcan(ArrayList<Candidate> list, int pos, String insertedcan, int insertedvotes)
    {
        // insert item into ArrayList
        list.add(pos, new Candidate(insertedcan, insertedvotes));
    }

    public static void insertfindcan(ArrayList<Candidate> list, String findcan, String insertedcan, int insertedvotes)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < list.size(); index++)
            if(list.get(index).getName().equals(findcan))
                location = index;

        // insert item into ArrayList
        list.add(location, new Candidate(insertedcan, insertedvotes));
    }
}