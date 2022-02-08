/*
Author: Kevin Yang-Li
Version: 09/18/2021
Purpose: Arrange cereals
 */

public class CerealTester {
    public static void main(String args[]) {

        // creating a list of cereals
        Cereal4[] cereals = new Cereal4[10];
        cereals[0] = new Cereal4(11.99, "Clown cereal", 2, 10 );
        cereals[1] = new Cereal4(10.99, "Eraser cereal", 1, 1 );
        cereals[2]= new Cereal4(17.50, "Fruity cereal", 3, 9 );
        cereals[3] = new Cereal4(9.00, "Matthew cereal", 4, 8 );
        cereals[4] = new Cereal4(8.99, "Kevin cereal", 5, 5 );
        cereals[5] = new Cereal4(7.99, "Alayna cereal", 7, 12 );
        cereals[6] = new Cereal4(6.90,"Fool cereal", 6, 12 );
        cereals[7] = new Cereal4(8.99, "Joker cereal", 9, 14 );
        cereals[8] = new Cereal4(5.90, "Brandon cereal", 8, 17 );
        cereals[9] = new Cereal4(2.90, "Chris cereal", 10, 11 );


        //prints the list
        System.out.println("Original");
        print(cereals);

        //name sorted
        System.out.println("name sorted");
        Cereal4 [] namesorted = namesort(cereals, 1);
        print(namesorted);

        //quantity sorted
        System.out.println("quantity sorted");
        quantitysorted(cereals,1);
        print(cereals);

        //product number sorted
        System.out.println("Product number sorted");
        mergeProductNum(cereals, 0, cereals.length - 1);
        print(cereals);

        //price sorted
        System.out.println("Price sorted");
        Cereal4 [] pricesorted = pricesorted(cereals, 1);
        print(pricesorted);

    }

    public static void print(Cereal4 [] a) {
        System.out.printf("%5s %20s %20s %15s  %n", "Name", "Price", "Product Number", "Quantity");
        System.out.println("=====================================================================");
        for(Cereal4 s: a) {
            System.out.printf("%-20s %-15.2f  %-20d %-16d  %n", s.getName(), s.getPrice(), s.getProductNum(), s.getQuantity());
        }
        System.out.println("");
    }

    //insertion sort for name
    public static Cereal4 [] namesort(Cereal4 [] array, int order ) {
        Cereal4[] newarray = new Cereal4[array.length];

        if ( order == 1) { //descending order

            for (int i = 0; i < array.length; i++){
                String cname = array[i].getName();
                int newInd = 0;
                int ind = i;
                while (ind > 0 && newInd == 0){
                    if (cname.compareTo(newarray[ind-1].getName()) > 0){
                        newInd = ind;
                    }else{
                        newarray[ind] = newarray[ind-1];
                    }
                    ind--;
                }
                newarray[newInd] = array[i];
            }

        } else if( order == 0) { //ascending order

            for (int i = 0; i < array.length; i++){
                String cname = array[i].getName();
                int newInd = 0;
                int ind = i;
                while (ind > 0 && newInd ==0){
                    if (cname.compareTo(newarray[ind-1].getName()) < 0){
                        newInd = ind;
                    }else{
                        newarray[ind] = newarray[ind-1];
                    }
                    ind--;
                }
                newarray[newInd] = array[i];
            }

        } else {

            System.out.println("That is not a valid option");

        }

        return newarray;
    }

    //selection sort for the quantity
    public static void quantitysorted(Cereal4 [] array, int order) {
        int newIndex;
        int maxposition;
        if (order == 1) {
            for ( int i = array.length - 1 ; i > 0 ; i-- )
            {
                maxposition = 0;

                for ( newIndex = 1 ; newIndex <= i ; newIndex++ )
                {
                    if ( array[ newIndex].getQuantity() < array[ maxposition ].getQuantity() )
                        maxposition = newIndex;
                }

                String name = array[i].getName();
                array[i].setName(array[maxposition].getName());
                array[maxposition].setName(name);
                int quan = array[i].getQuantity();
                array[i].setQuantity(array[maxposition].getQuantity());
                array[maxposition].setQuantity(quan);
                int prodnum = array[i].getProductNum();
                array[i].setProductNum(array[maxposition].getProductNum());
                array[maxposition].setProductNum(prodnum);
                double price = array[i].getPrice();
                array[i].setPrice(array[maxposition].getPrice());
                array[maxposition].setPrice(prodnum);

            }
        } else if ( order == 0) {
            for ( int i = array.length - 1 ; i > 0 ; i-- )
            {
                maxposition = 0;

                for ( newIndex = 1 ; newIndex <= i ; newIndex++ )
                {
                    if ( array[ newIndex ].getQuantity() > array[ maxposition ].getQuantity() )
                        maxposition = newIndex;
                }

                String name = array[i].getName();
                array[i].setName(array[maxposition].getName());
                array[maxposition].setName(name);
                int quan = array[i].getQuantity();
                array[i].setQuantity(array[maxposition].getQuantity());
                array[maxposition].setQuantity(quan);
                int prodnum = array[i].getProductNum();
                array[i].setProductNum(array[maxposition].getProductNum());
                array[maxposition].setProductNum(prodnum);
                double price = array[i].getPrice();
                array[i].setPrice(array[maxposition].getPrice());
                array[maxposition].setPrice(prodnum);

            }
        }
    }
    public static void mergeProductNum(Cereal4[] cereals, int min, int max)
    {
        if (min >= max) {
            return;
        }

        int mid = (min + max)/2;
        //from min to mid
        mergeProductNum(cereals, min, mid);
        //from mid to max
        mergeProductNum(cereals, mid + 1, max);
        merge(cereals, min, mid, max);
    }

    public static void merge(Cereal4[] cereals, int min, int mid, int max)
    {
        Cereal4[] temp = new Cereal4[max - min + 1];
        int lower = min;
        int s = 0;
        int middle = mid + 1;
        while (lower <= mid || middle <= max)
        {
            if (lower > mid)
            {
                temp[s] = cereals[middle];
                middle++;
            }
            else if ( middle > max )
            {
                temp[s] = cereals[lower];
                lower++;
            }
            else if (cereals[lower].getProductNum() < cereals[middle].getProductNum())
            {
                temp[s] = cereals[lower];
                lower++;
            }
            else
            {
                temp[s] = cereals[middle];
                middle++;
            }
            s++;
        }
        for (int i = min ; i <= max ; i++) {
            cereals[i] = temp[i - min];
        }
    }


    // sorted by price
    public static Cereal4[] pricesorted(Cereal4 [] array, int order) {
        Cereal4[] newarray = new Cereal4[array.length];
        if (order == 1) { // desceding order
            for (int i = 0; i < array.length; i++){
                double price = array[i].getPrice();
                int newIndex = 0;
                int ind = i;
                while (ind > 0 && newIndex ==0){
                    if (price < newarray[ind-1].getPrice()){
                        newIndex = ind;
                    }else{
                        newarray[ind] = newarray[ind-1];
                    }
                    ind--;
                }
                newarray[newIndex] = array[i];
            }
        } else if (order == 0) {
            for (int i = 0; i < array.length; i++){
                double price = array[i].getPrice();
                int newIndex = 0;
                int index = i;


                while (index > 0 && newIndex ==0){
                    if (price > newarray[index-1].getPrice()){
                        newIndex = index;
                    }else{
                        newarray[index] = newarray[index-1];
                    }
                    index--;
                }
                newarray[newIndex] = array[i];
            }
        } else {
            System.out.println("That is not a valid option");
        }

        return newarray;


    }

}
