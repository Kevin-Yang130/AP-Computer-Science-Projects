/**
 * This is a class that tests the Deck class.
 *  Kevin yang
 *  09/27/21
 */
import java.util.ArrayList;

public class DeckTester
{
   /**
    * The main method in this class checks the Deck operations for consistency.
    * @param args is not usemyDeck.
    */
   public static void main(String[] args)
   {
      /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
      /* Uncomment blocks of code to test the Deck class */

//      String[] myRanks = {"Ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten","Jack","queen", "king"};
//      String[] mySuits = {"heart", "spades", "diamonds", "clubs"};
//      int[] myPointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
//
//      Deck myDeck = new Deck(myRanks, mySuits, myPointValues);
//
//      System.out.println("**** Original Deck Methods ****");
//      System.out.println("  toString: \n" + myDeck.toString());
//      System.out.println("  isEmpty: " + myDeck.isEmpty());
//      System.out.println("  size: " + myDeck.size());
//      System.out.println();
//      System.out.println();
//
//      System.out.println("**** Deal a Card ****");
//      System.out.println("  deal: " + myDeck.deal());
//      System.out.println();
//      System.out.println();
//
//      System.out.println("**** Deck Methods After 1 Card Dealt ****");
//      System.out.println("  toString:\n" );
//      System.out.println("  isEmpty: " );
//      System.out.println("  size: " );
//      System.out.println();
//      System.out.println();
//
//      System.out.println("**** Deal Remaining 5 Cards ****");
//
//      System.out.println();
//      System.out.println();
//
//      System.out.println("**** Deck Methods After All Cards Dealt ****");
//      System.out.println("  toString:\n" );
//      System.out.println("  isEmpty: " );
//      System.out.println("  size: "  );
//      System.out.println();
//      System.out.println();
//
//      System.out.println("**** Deal a Card From Empty Deck ****");
//      System.out.println("  deal: " );
//      System.out.println();
//      System.out.println();

      ArrayList< Integer > a = new ArrayList< Integer >();
      int value;
      a.add(4);
      a.add(5);
      a.add(new Integer(6));
      value = a.size();
      System.out.println(value);
      //      int num = 0;
//      for (int i = 0; i < myPointValues.length;i++ ) {
//         for (int k = 0; k < mySuits.length;k++ ) {
//            System.out.println(myRanks[i] + mySuits[k]);
//            num++;
//         }
//      }
//      System.out.println(num);

      /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */

      // System.out.println("\n**** 52 Card Deck shuffle Tests ****");
      // String[] ranks52 = {"ace"};
      // String[] suits52 = {"spades"};
      // int[] pointValues52 = {1};

      // System.out.println("  The Starting Deck ");

      // System.out.println("  The Deck After Dealing a Card" );

      // System.out.println("  Shuffleing the Deck ");


   }
}
