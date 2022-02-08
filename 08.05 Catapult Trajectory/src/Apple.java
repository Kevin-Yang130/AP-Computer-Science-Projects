/*
    Author: Kevin Yang-Li
    date: 08/04/2021
    purpose: create an apple to be thrown by the catapult
 */

import java.lang.Math;


public class Apple {


    private int speed;
    private int angle;

    public Apple(int s, int a) {
        speed = s;
        angle =  a;
    }


    public  double calcdistance(int s, int a) {
        double range = 0;
        double g = 9.8;
        double speed = s * s * 0.277778;
        a *= 2;
        double radianangle = Math.toRadians(a);
        radianangle = Math.sin(radianangle);
        range = speed * radianangle / g;

        //rounds up to 3 decimal places
        range = (int)(range * 1000)/1000.0;
        return range;
    }
}
