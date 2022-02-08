/*
Author: Kevin Yang-Li
date: 09/15/2021
purpose: create a subclass, in this case, mountain.
 */

public class Dessert extends Terrain {
    private int temp;
    public Dessert (int temp, int l, int w) {
        super(l,w);
        this.temp = temp;
    }

    public String getTemp() {
        return "Dessert temperature:  " + temp + " Celsius";
    }

}
