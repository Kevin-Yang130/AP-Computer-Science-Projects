/*
Author: Kevin Yang-Li
date: 09/15/2021
purpose: create a subclass.
 */


public class Mountain extends Terrain {
     private int mountainNumber;

     public Mountain(int mountainNumber, int l, int w) {
         super(l,w);
         this.mountainNumber =  mountainNumber;
     }

     public String getMountainNum() {
         return "The number of mountains is: " + mountainNumber;
     }
}
