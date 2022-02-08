/*
Author: Kevin Yang-Li
Version: 09/15/2021
purpose: Test the terrains.
 */

public class GameTerrainTester {
    public static void main(String args[]) {
        Terrain ground = new Terrain( 20,20);
        Forest calforest = new Forest( 20,20,20);
        Mountain fuji = new Mountain(10,20,20);
        Dessert sahara = new Dessert(70,20,20);
        DryDessert antartica = new DryDessert(3, 5, 20,20);


        System.out.println(ground.getTerrainSize());
        System.out.println(calforest.getTreeNum());
        System.out.println(fuji.getMountainNum());
        System.out.println(sahara.getTemp());
        System.out.println(antartica.getDryness());

    }
}
