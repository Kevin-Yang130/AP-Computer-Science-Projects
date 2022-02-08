public class ElectionTesterV1 {
    public static void main(String args[]) {
        Candidate[] list = {new Candidate("Kevin Yang",1000),new Candidate("Tony Stark",100),new Candidate("Brandon Black",532),new Candidate("Allan Pinkerton",345),new Candidate("Michelle Obama",534)};
        int total1 = add(list);
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


