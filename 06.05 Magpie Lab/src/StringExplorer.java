/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        // Assign a new value to sample. Use a phrase of your choosing.
        // Pad the beginning and end of the string literal with spaces.
        sample = "  I like to eat burgers with my friend  ";

        //  Add examples below for the following methods:
        //    trim()
        System.out.println("sample.trim() = " + sample.trim());
        //    length()
        System.out.println("sample.length() = "+ sample.length());
        //    indexOf with one and two parameters
        System.out.println("sample.indexOf(\"l\") = " + sample.indexOf("l"));
        System.out.println( "sample.indexOf(\"l\",1) = "+ sample.indexOf("l",1));
        //    substring() with one and two parameters
        System.out.println("sample.substring(2,4) = " + sample.substring(2,4));
        System.out.println("sample.substring(2) = " + sample.substring(2));
        //    compareTo()
        System.out.println("sample.compareTo(\"  I like to eat burgers with my friend  \") = " + sample.compareTo("  I like to eat burgers with my friend  "));
        //    any other String methods you'd like to try
        System.out.println( "sample.contains(\"burgers\") = " + sample.contains("burgers"));
        System.out.println("sample.charAt(4) = " + sample.charAt(4));
    }

}
