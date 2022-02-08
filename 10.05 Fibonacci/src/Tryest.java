public class Tryest {
    public static void main(String args[]) {
        System.out.println(recur(10));
    }
    public static int recur(int n)
    {
        if(n < 3)
        {
            return 2;
        }
        else
        {
            return recur(n / 3) + 1;
        }
    }
}
