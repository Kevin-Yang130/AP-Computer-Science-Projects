/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Kevin Yang-Li
 * @version 08/31/2020
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();


		System.out.println("Staring U.S dollars:" + startingUsDollars);
		System.out.println();


		//MEXICO
		double pesosSpent = 4380;          // Mexican Pesos spent
		double pesoExchangeRate = 21.90;     // 1 US dollar = 21.90 pesos
		double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // US dollars spent in Mexico
		double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;
		System.out.println("Mexico:");
		System.out.println("Pesos spent: " + pesosSpent );
		System.out.println("U.S dollars equivalent: " + dollarsSpentInMexico);
		System.out.println("U.S dollars remiming: " + dollarsAfterMexico);
		System.out.println();

		//JAPAN
		double yenSpent = 21166;          // yen spent
		double yenExchangeRate = 105.83 ;     // 1 US dollar = 105.83 	pesos
		double dollarsSpentInJapan = yenSpent / yenExchangeRate;      // US dollars spent in Mexico
		double dollarsAfterJapan = dollarsAfterMexico - dollarsSpentInJapan;
		System.out.println("Japan:" );
		System.out.println("Yen spent: " + yenSpent);
		System.out.println("U.S dollars equivalent: " + dollarsSpentInJapan);
		System.out.println("U.S dollars remiming: " + dollarsAfterJapan);
		System.out.println();


		//FRANCE
		double eurosSpent = 400;          // Mexican Pesos spent
		double eurosExchangeRate = 0.84;     // 1 US dollar = 0.84 pesos
		double dollarsSpentInFrance = eurosSpent / eurosExchangeRate;      // US dollars spent in Mexico
		double dollarsAfterFrance = dollarsAfterJapan - dollarsSpentInFrance;
		System.out.println("France: ");
		System.out.println("Euros spent: " + eurosSpent);
		System.out.println("U.S dollars equivalent: " + dollarsSpentInFrance );
		System.out.println("U.S dollars remiming: " + dollarsAfterFrance);
		System.out.println();

		System.out.println("===================================================");

		//Remaining dollars
		System.out.println("Remaining U.S Dollars: " + dollarsAfterFrance);
		System.out.println();
		System.out.println();
		System.out.println();




		// Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $" + budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();

		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int) (budget2 /costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $" + budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

