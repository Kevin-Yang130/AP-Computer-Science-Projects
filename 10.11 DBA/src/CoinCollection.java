

import java.util.ArrayList;


public class CoinCollection{
    private ArrayList<Coin> coins; //collection of coins

    //precondition: parallel arrays of all the same length  //write the constructor of CoinCollection for part A
    public CoinCollection(int[] years, double[] values, String[] countries)  {
        for(int i = 0; i < years.length; i++) {
            coins.add(new Coin(years[i],values[i], countries[i]));
        }

    }

    public boolean isRare(int year) {
        boolean answer = true;
        int rare = 0;
        for (Coin s: coins) {
            if(s.getYear() < year) {
                rare++;
            }
        }

        if(rare == coins.size()) {
            return true;
        }
        else {
            return false;
        }
    }

    public class USCoinCollection extends CoinCollection {
        //precondition: parallel arrays of all the same length  //write the constructor of CoinCollection for part A
        public USCoinCollection(int[] years, double[] values, String[] countries)
        {
            super(years, values, countries);
        }
        
        //there may be other constructors methods not shown
    }

    //there may be other constructors methods not shown
}

