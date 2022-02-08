import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class tryu {
    public class A1
    {
        public int x;
        private int y;


    }

    public class A2 extends A1
    {
        public int a;
        private int b;
        int t = b;

    }

    public class A3 extends A2
    {
        private int q;

    }
    public static void main(String[] args)
    {
        SomeClass myObject = new SomeClass();

        int fred = SomeClass.SOME_VALUE;
        int barney = myObject.method1();
        int wilma = SomeClass.method2();
    }
}
