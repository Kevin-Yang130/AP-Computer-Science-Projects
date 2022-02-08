
public class Word {

    public static void main(String args[]) {

        String target = "hello";
        int num = 3;
        String Array[] = {"hello","bye","see ya"};
        Word s = new Word();
        WordTester words =  new WordTester(target,num,Array);
        boolean have = words.isWithin();
        boolean number = words.sameNumber();
        System.out.println(have);
        System.out.println(number);

    }
}
