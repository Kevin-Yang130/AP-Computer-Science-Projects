/*
Author: Kevin Yang-Li
date: 09/15/2021
purpose: create a subclass.
 */

public class Forest extends  Terrain {
     private int treeNum;
     public Forest( int treeNum,int l, int w) {
         super(l,w);
         this.treeNum = treeNum;
     }

     public String getTreeNum() {
         return "The number of trees this forest has is: " + treeNum;
     }
}
