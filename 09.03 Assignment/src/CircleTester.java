
/*
Author: Kevin Yang-Li
Version: 0819/21
Purpose: test the different shapes.
 */


import java.util.ArrayList;

public class CircleTester {
    public static void main(String args[]) {
        ArrayList<Circle2> circles = new ArrayList();
        circles.add(new Circle2(1,1,1));
        circles.add(new Cylinder2(1,2,1,1));
        circles.add(new Oval2(1,3,1,2));
        circles.add(new OvalCylinder2(1,4,1,2,2));

        for ( Circle2 c: circles) {
            ShowCenter(c);
        }

    }

    public static void ShowCenter(Circle2 shape) {
        shape.getCenter();
        System.out.println("The center of the " + shape.getName() + "is: " + shape.getCenter());
    }
}
