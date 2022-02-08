/**
 * This class defines a Rectangle object using
 * length and width.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Rectangle2
{
    // instance variables
    private int length;
    private int width;

    // Constructor for objects of class Rectangle
    public Rectangle2(int length, int w)
    {
        // initialize instance variables
        this.length = length;
        width = w;
    }
    public Rectangle2(int l)
    {
        // initialize instance variables
        length = l;

    }

    // Return name of Class
    public String getName()
    {
    	return "Rectangle";
    }

    // return the height
    public int getLength()
    {
        return length;
    }

    // return the width
    public int getWidth()
    {
        return width;
    }
}

