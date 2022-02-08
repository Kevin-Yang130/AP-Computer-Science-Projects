

import java.util.ArrayList;

public class ElectionTesterV2 {
    public static void main(String args[]) {
        ArrayList<Candidate> list = new ArrayList<Candidate>();
        list.add(new Candidate("Kevin Yang",1000));
        list.add(new Candidate("Chris Osorio",321));
        list.add(new Candidate("Daniel Black",546));
        list.add(new Candidate("Tony Stark",643));
        list.add(new Candidate("Winy poo",768));

        int total1 = add(list);
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

    public static void table(ArrayList<Candidate> list, int total) {
        System.out.println("Election Results:");
        System.out.println();
        System.out.println("Candidate" + "        Votes" + "       % of Total Votes");
        double votes = 0;
        double percent = 0;
        for ( Candidate c: list) {
            votes = c.getVotes();
            percent = votes / total * 100;
            System.out.printf("%-17s  %-5d  %18.2f  %n", c.getName(), c.getVotes(),percent);
        }
    }
}
