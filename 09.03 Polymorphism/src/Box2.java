
/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 *
 * @author Poly Morphism
 * @version 06/13/17
 */

public class Box2 extends Rectangle2
{
    // instance variables
    private int height;

    // Constructor for objects of class Box
    public Box2(int a, int w, int h)
    {
        // call superclass

        // initialize instance variables
        height = h;
    }

    // Return name of Class
    /*
     public String getName()
    {
    	return "Box";
    }
    */

    // return the height
    public int getHeight()
    {
        return height;
    }
}

