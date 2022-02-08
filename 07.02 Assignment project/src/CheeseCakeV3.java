/*
Author: Kevin Yang-Li
version: 06/22/2021
Purpose: Provide the records of Cheesecakes
 */

public class CheeseCakeV3 {

    private int cc;
    private int q;
    private String f;
    private double sugar;
    private int servings;
    private int vanilla;
    public CheeseCakeV3(String flavor,int quantity) {
        q = quantity;
        f = flavor;
    }

    //getter
    public int getTotalServings() {
        return servings;
    }
    public int getCheese() {
        return cc;
    }
    public int getAmount() {
        return q;
    }
    public double getSugar() {
        return sugar;
    }
    public int getVanilla(){
        return vanilla;
    }
    public String getFlavor() {
        return f;
    }


    public void calcTotalServings() {
        servings = q * 16;
    }
    public void calcCreamCheese() {
        cc = q * 32;
    }
    public void calcSugar() {
       sugar = q / 3.0;
    }
    public void calcVanilla() {
        vanilla = q;
    }






    public String toString() {
    return String.format(" %8s %-10d %s %-12s %3s %,5d %s %7s %7d %5s %-4.2f %s %4s %-6d %s %s ", "|", getAmount(), "|",  getFlavor(), "|", getCheese(), "oz", "|",getTotalServings(), "|",getSugar(),"cups", "|",getVanilla(),"tsps", "|");
    }




}
