import java.util.ArrayList;

public class Trytest {
    public static void main(String args[]) {
        String c = "hello";
        String s = "hgel";
        System.out.println(c + s);
    }

    public int countOccurrences (ArrayList arr, String str)
    {
        int num = 0;
        for(String s: arr) {
            if(s.equals(str)) {
                num++;
            }
        }
        if (num > 0) {
            return num;
        } else {
            return -1;
        }

    }
//    public Widget(String id, String pd, double price){
//        String productID = "";
//        productID = id + "_" + pd;
//        this.price = price;
//    }
//    }
//
public boolean canReplace(Product p){
    if (p.getPrice() > this.price && p.getProductID.compareTo(this.productID) > 0) {
        return true;
    } else {
        return false;
    }
}
public ArrayList addGroc(Grocery[] groc) {
    /*to be implemented in part A*/
    ArrayList<Grocery> shoppingList = new ArrayList<>();

    for(Grocery c: groc) {
        if(c.getQtyOnHand < REORDER) {
            shoppingList.add(c);
        }
    }
    return shoppingList;
}
    public int totalQty(ArrayList shoppingList, String c){
        int quan = 0;
        for(Grocery c: ShoppingList) {
            if(c.getCategory.equals(c)) {
                quan += c.getQtyOnHand();
            }
        }
        return quan;
    }
    public Widget(String id, String pd, double price){
        super(price);
        productID = id + "_" + pd;
        this.price = price;
    }

    public boolean isColumnError(int col){
        int errors = 0;
        for(int row = 0; row < panel.length; row++) {
            if(panel[row][col] != onValue || panel[row][col] != offValue ) {
                errors++;
            }
        }
        if(errors > 0) {
            return true;
        } else {
            return false;
        }
    }
    // yeah.... :)
    public void updateColumn(){
        for(int col = 0; col < panel[0].length; col++) {
            if (isColumnError(col) == true) {
                if(col - 1 == panel) {
                    for(int coll = 0; col < panel[0].length; col++) {
                        for(int row = 0; row < panel.length; col++) {
                            panel[row][col] = panel[row][0];
                        }
                    }
                } else {
                    for(int coll = 0; col < panel[0].length; col++) {
                        for(int row = 0; row < panel.length; col++) {
                            panel[row][col] = panel[row][col + 1];
                        }
                    }
                }
            }
        }
    }
}
