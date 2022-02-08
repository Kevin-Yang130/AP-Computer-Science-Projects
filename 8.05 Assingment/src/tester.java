public class tester {
    public static void main(String [] args) {
        int[][] array = { {1,2,3,4},{5,6,7,8},{9,10,11,12}};
        for (int out = 0; out < array.length; out++)
        {
            for (int in = 0; in < array[0].length; in++)
            {
                System.out.println( array[out][in++] );
            }
        }

        double[][] gpas = {{4.2, 3.0, 7.2, 1.8},{2.2, 3.5, 3.0, 6.4},{4.3, 3.9, 3.2, 2.9}} ;
        System.out.println(gpas[2].length);

        String[][] friends = { {"Jamal", "Suzy"}, {"Xander", "Sloan"}, {"Thomas", "Aaron"} };
        String name = friends[2][1];
        System.out.println(name + " is at location, [2,1]");

        String[][] names = {{"Abby", "Bobby", "Charles", "David"}, {"Eric", "Faith", "Gina", "Hope"}, {"Ines", "Juan", "Karl", "Lily"}};
        for(int b = 1; b < names[0].length-1; b++){
            for(int a = 1; a < names.length; a++){
                System.out.print(names[a][b] + " ");
            }
        }

        int[][] numbers = { {3,1,5,2},{1,8,2,4},{1,2,4,4}};

        int val = 0;
        int col = numbers[0].length - 2;
        for (int row = 0; row < numbers.length; row++)
        {
            val += numbers[row][col];
        }
        
    }

}
