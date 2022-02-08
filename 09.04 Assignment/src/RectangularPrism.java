/*
Author:Kevin Yang-Li
Version: 08/22/21
Purpose: Create a square
 */


public class RectangularPrism extends Cube4 {
    public RectangularPrism (int l, int w, int h) {
        super(l,w,h);
    }

    public String toString()
    {
        return "The dimensions of the Rectangular Prism are " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}
