import java.util.Random;


public class tryquiz {
    public static void main(String args[]) {
        for(int outer = 7; outer > 0; outer -= 2)
        {
            for(int inner = 0; inner < outer; inner++)
            {
                System.out.print("∗");
            }
            System.out.println();
        }
    }
}
