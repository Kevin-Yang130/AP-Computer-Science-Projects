/*
Author:Kevin Yang-Li
Version: 08/22/21
Purpose: Create a Cube
 */

public class Cube4 extends Box4{
    public Cube4(int l, int w, int h) {
        super( l,  w,  h);


    }

    public String toString()
    {
        return "Cube - " + getHeight() + " X " + getLength() + " X " + getWidth();
    }

}
