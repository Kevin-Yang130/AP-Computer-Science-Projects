/*
Author: Kevin Yang-Li
Version: 09/18/2021
Purpose: create a cereal
 */

public class Cereal4 {
    private String name;
    private double price;
    private int quantity;
    private int productNum;


    public Cereal4(double price, String name, int productNum, int quantity ) {
        this.price = price;
        this.name = name;
        this.quantity = quantity;
        this.productNum = productNum;
    }

    //getter methods
    public double getPrice() {
     return price;
    }

    public String getName() {
        return name;
    }

    public int getProductNum() {
        return productNum;
    }

    public int getQuantity() {
        return quantity;
    }

    //setter method

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String ToString() {
        return "";
    }


}
