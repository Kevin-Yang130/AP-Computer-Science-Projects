/*
Author:Kevin Yang-Li
Version: 08/22/21
Purpose: Create a Rectangular Prism
 */


public class Square4 extends Rectangle4 {
    public Square4(int l, int w) {
        //a ramp has the same variables as a rectangular prism, but divided by 2. (1/2*lhw)
        super(l,w);
    }

    public String toString()
    {
        return "The dimensions of the Square are " + getLength() + " X " + getWidth();
    }
}
