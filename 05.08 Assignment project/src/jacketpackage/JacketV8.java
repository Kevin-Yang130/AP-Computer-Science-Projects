package jacketpackage;/*
Author: Kevin Yang-Li
version: 12/01/2020
Purpose: Create many jackets.
 */


public class JacketV8 {
    public String actualColor;
    public char actualSize;
    public  String actualBrand;
    private String on;
    private String off;

    public JacketV8(String color,char size) {
        actualColor = color;
        actualSize = size;
    }

    //overload
    public JacketV8(String color,char size, String brand) {
        actualColor = color;
        actualSize = size;
        actualBrand = brand;
    }

    //methods
    public String putOn(String onn) {
        on = onn;
        System.out.println(on);
        return on;
    }

    public String takeOff(String offf) {
        off = offf;
        System.out.println(off);
        return off;
    }
    public static void main(String args[]) {

        JacketV8 jacket1 =  new JacketV8("black", 'L');
        JacketV8 jacket2 =  new JacketV8("blue", 'S',"Adidas");
        JacketV8 jacket3 =  new JacketV8("pink", 'M' , "Nike");


        jacket1.putOn("You put your Jacket on");
        jacket1.takeOff("You took your jacket off");


    }



}