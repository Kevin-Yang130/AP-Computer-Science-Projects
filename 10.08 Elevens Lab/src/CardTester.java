/**
 * This is a class that tests the Card class.
 *
 *  Kevin Yang-Li
 *  09/27/21
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      /* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */

      // Establish new cards
      Card aceHearts = new Card("ace", "hearts", 1);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2
      Card aceHearts2 = new Card("2", "hearts", 2);
      System.out.println("  rank: " + aceHearts2.rank());
      System.out.println("  suit: " + aceHearts2.suit());
      System.out.println("  pointValue: " + aceHearts2.pointValue());
      System.out.println("  toString: " + aceHearts2.toString());
      System.out.println();

      // Test card 3
      Card aceHearts3 = new Card("3", "hearts", 3);
      System.out.println("  rank: " + aceHearts3.rank());
      System.out.println("  suit: " + aceHearts3.suit());
      System.out.println("  pointValue: " + aceHearts3.pointValue());
      System.out.println("  toString: " + aceHearts3.toString());
      System.out.println();

      // Test matches() method

   }
}
