/*
Author: Kevin Yang-Li
version: 06/22/2021
Purpose: Provide the records of Cheesecakes
 */

import java.util.ArrayList;

public class CheeseCakeTesterV3 {
    public static void main(String args[]) {
        int [] a = {6,3,2,15};
        int c = 0;
        int b = 1;
        if (a.length > 0) {
            c = a[0];

        }
        while (b < a.length) {
            if (a[b] < c){
                c = a[b];
            }
            b++;
        }
        System.out.println(b);
        System.out.println(c);


        int quantity0 = 5;
        String flavor0 = "Strawberry";


        int quantity1 = 6;
        String flavor1 = "Blueberry";


        int quantity2 = 4;
        String flavor2 = "Cherry";


        int quantity3 = 1;
        String flavor3 = "Jalapeno";

        int quantity4 = 2;
        String flavor4 = "Dill pickle";

        int quantity5 = 3;
        String flavor5 = "Fig";

        ArrayList<CheeseCakeV3> cakes = new ArrayList<CheeseCakeV3>();
        cakes.add(new CheeseCakeV3(flavor0,quantity0));
        cakes.add(new CheeseCakeV3(flavor1,quantity1));
        cakes.add(new CheeseCakeV3(flavor2,quantity2));
        cakes.add(new CheeseCakeV3(flavor3,quantity3));
        cakes.add(new CheeseCakeV3(flavor4,quantity4));
        cakes.add(new CheeseCakeV3(flavor5,quantity5));
        
        System.out.printf("%s %30s %10s %30s %28s %n","|", "Cheese Cake data","|", "Ingredient calculations", "|");
        System.out.printf("%s %5s %5s %5s %3s %6s %8s %8s %3s %3s %4s %4s %8s %8s %4s %n","|", "Index", "|", "Quantity", "|", "Flavor ", "|", "Cream Cheese", "|", "Servings", "|", "Sugar", "|", "Vanilla", "|");
        // for loop for the arraylist
        int i = 0;
        int vanillas;

        for(CheeseCakeV3 dataRecord : cakes)
        {
            dataRecord.calcSugar();
            dataRecord.calcCreamCheese();
            dataRecord.calcTotalServings();
            dataRecord.calcVanilla();
        }
        CheeseCakeV3 dataRecord;

        for(CheeseCakeV3 cake: cakes ) {

            System.out.println("|" + i + "\t" + cake);
            i++;
        }



    }
}
