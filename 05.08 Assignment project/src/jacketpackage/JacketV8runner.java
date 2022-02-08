package jacketpackage;

import jacketpackage.JacketV8;

public class JacketV8runner {
    public static void main(String args[]) {
        JacketV8 jacket1 =  new JacketV8("black", 'L');
        JacketV8 jacket2 =  new JacketV8("blue", 'S',"Adidas");
        JacketV8 jacket3 =  new JacketV8("pink", 'M' , "Nike");

        System.out.println();
        System.out.println("Jacket \t\tcolor   size \tbrand");
        System.out.println("================================");

        // first jacket does not have a brand, so it prints null.
        System.out.println("Jacket 1:\t" + jacket1.actualColor + "\t" + jacket1.actualSize + "\t\t" + jacket1.actualBrand);
        System.out.println("Jacket 2:\t" + jacket2.actualColor + "\t" + jacket2.actualSize + "\t\t" + jacket2.actualBrand);
        System.out.println("Jacket 3:\t" + jacket3.actualColor + "\t" + jacket3.actualSize + "\t\t" + jacket3.actualBrand);


    }
}
