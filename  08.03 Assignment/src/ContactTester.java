/*
author: kevin Yang-Li
Version: 08/01/21
Purpose: List and search for specific people within a list
 */

public class ContactTester {
    public static void main(String args []) {
        Contact [] contacList = new Contact[10];
        contacList[0] =new Contact("Carmen Yong", "Sister", "954-123-4321","May 13","carmen@gmail.com");
        contacList[1] =new Contact("David Yong", "Brother", "954-123-4321","Oct 25","david@gmail.com");
        contacList[2] =new Contact("Shrek Green", "Friend", "954-123-7890","Oct 13","shrek@gmail.com");
        contacList[3] =new Contact("Juan Rivera", "Friend", "974-666-5672","Jan 01","juan@gmail.com");
        contacList[4] =new Contact("Kevin Lin", "Cousin", "953-555-3214","Feb 23","kevin@gmail.com");
        contacList[5] =new Contact("Isabella Yong", "Aunt", "973-444-9181","Jul 01","isabella@gmail.com");
        contacList[6] =new Contact("Coniff Kristen", "Teacher", "984-333-2313","Jun 02","coniff@gmail.com");
        contacList[7] =new Contact("Winy poo", "Friend", "994-222-9832","Nov 30","winy@gmail.com");
        contacList[8] =new Contact("Shaun Wang", "Cousin", "924-111-9999","Mar 15","shaun@gmail.com");
        contacList[9] =new Contact("Sakeena Shoaib", "Friend", "994-989-9812","Aug 18","sakeena@gmail.com");

        print(contacList);

        //names are sorted
        Contact [] namesSorted = namesort(contacList);
        binaryName(namesSorted,"Shaun Wang");

        //relations sorted
        Contact [] relationsorted = relationsort(contacList);
        binaryrelation(relationsorted,"Friend");


        //sequential search for the phone number
        seqphone(contacList,"954-123-4321");

        //sequential search for a month
        seqbirthday(contacList,"Oct");

        //sequential search for the email
        seqemail(contacList,"coniff@gmail.com");


    }

    public static void print(Contact [] array) {
        System.out.printf("%s %24s %24s %16s %17s %n", "Name","Relation","Phone Number", "Birthday", "Email");
        System.out.println("====================================================================================================");
        for (Contact c: array) {
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", c.getName(),c.getRelation(),c.getPnumber(),c.getBithday(), c.getEmail());
        }
    }

    //sorts the array by the names
    public static Contact[] namesort(Contact[] array) {
        Contact[] musarray = new Contact[array.length];

        for (int i = 0; i < array.length; i++){
            String cname = array[i].getName();
            int newInd = 0;
            int ind = i;


            while (ind > 0 && newInd ==0){
                if (cname.compareTo(musarray[ind-1].getName()) > 0){
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

    // sorts the array using the relation
    public static Contact [] relationsort(Contact[] array){
        Contact[] musarray = new Contact[array.length];

        for (int i = 0; i < array.length; i++){
            String crelation = array[i].getRelation();
            int newInd = 0;
            int ind = i;


            while (ind > 0 && newInd ==0){
                if (crelation.compareTo(musarray[ind-1].getRelation()) > 0){
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

    public static void binaryName(Contact [] array, String target) {
        int lowend = -1;
        int highend = array.length;
        int medium;

        while (highend - lowend > 1) {
            medium = (highend + lowend)/2;
            if (array[medium].getName().compareTo(target) > 0)
                highend = medium;
            else
                lowend = medium;
        }

        if (lowend != -1 && array[lowend].getName().equals(target)) {
            System.out.println("");
            System.out.println("searching for the title: " + target);
            System.out.println("");
            System.out.printf("%s %24s %24s %16s %17s %n", "Name","Relation","Phone Number", "Birthday", "Email");
            System.out.println("====================================================================================================");
            System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", array[lowend].getName(),array[lowend].getRelation(),array[lowend].getPnumber(),array[lowend].getBithday(), array[lowend].getEmail());
        }else{
            System.out.println("");
            System.out.println("the year given could not be found on the list...");
        }
    }

    public static void binaryrelation(Contact [] array, String target) {
        int lowend = -1;
        int highend = array.length;
        int medium;

        while (highend - lowend > 1) {
            medium = (highend + lowend)/2;
            if (array[medium].getRelation().compareTo(target) > 0) {
                highend = medium;

            }
            else {
                lowend = medium;

            }

        }

        if (lowend != -1 && array[lowend].getRelation().equals(target)) {
            System.out.println("");
            System.out.println("searching for persons with the relation: " + target);
            System.out.println("");
            System.out.printf("%s %24s %24s %16s %17s %n", "Name","Relation","Phone Number", "Birthday", "Email");
            System.out.println("====================================================================================================");
            for ( int i = lowend; i > -1; i--) {
                if (array[i].getRelation().equals(target)) {
                    System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", array[i].getName(),array[i].getRelation(),array[i].getPnumber(),array[i].getBithday(), array[i].getEmail());
                }
            }
        }else{
            System.out.println("");
            System.out.println("The given relation could not be found in the list...");
        }
    }

    public static void seqbirthday(Contact[] array,String target) {
        System.out.println("");
        System.out.println("Searching for the people who were born in the month: " + target);
        System.out.println("");
        System.out.printf("%s %24s %24s %16s %17s %n", "Name","Relation","Phone Number", "Birthday", "Email");
        System.out.println("====================================================================================================");
        for (Contact c: array) {
            String month = c.getBithday().substring(0,3);
            if(month.compareTo(target) == 0) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", c.getName(),c.getRelation(),c.getPnumber(),c.getBithday(), c.getEmail());

            }
        }
    }

    public static void seqphone(Contact [] array, String target) {
        System.out.println("");
        System.out.println("Searching for the people who have the phone number: " + target);
        System.out.println("");
        System.out.printf("%s %24s %24s %16s %17s %n", "Name","Relation","Phone Number", "Birthday", "Email");
        System.out.println("====================================================================================================");
        for (Contact c: array) {
            if(c.getPnumber().compareTo(target) == 0) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", c.getName(),c.getRelation(),c.getPnumber(),c.getBithday(), c.getEmail());

            }
        }
    }

    public static void seqemail(Contact [] array, String target) {
        System.out.println("");
        System.out.println("Searching for the people with the email: " + target);
        System.out.println("");
        System.out.printf("%s %24s %24s %16s %17s %n", "Name","Relation","Phone Number", "Birthday", "Email");
        System.out.println("====================================================================================================");
        for (Contact c: array) {
            if(c.getEmail().compareTo(target) == 0) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s %n", c.getName(),c.getRelation(),c.getPnumber(),c.getBithday(), c.getEmail());

            }
        }
    }


}
