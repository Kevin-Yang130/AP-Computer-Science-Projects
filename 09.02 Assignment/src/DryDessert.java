/*
Author: Kevin Yang-Li
date: 09/15/2021
purpose: create a subclass.
 */

public class DryDessert extends Dessert {
    int dryness;

    public DryDessert(int dryness,int temp, int l, int w) {
        super(temp,l,w);
        this.dryness = dryness;
    }


    public String getDryness() {
        return "Dessert dryness: " + dryness;
    }
}
