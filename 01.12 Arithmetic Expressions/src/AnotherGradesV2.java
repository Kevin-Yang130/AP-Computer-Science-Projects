/**
 * Purpose: This program will calculate the total points and average grade each time a new score is added to the total.
 * @Author: Kevin Yang_li
 * Version: 08/27/2020
 */
public class AnotherGradesV2 {
    public static void main(String[] args) {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 10.0;  //average grade

        // FIRST TEST
        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        // SECOND TEST
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        //THIRD TEST
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        // FOURTH TEST
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        // MY GRADES OF CHOICE

        numTests++;
        testGrade = 99;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        numTests++;
        testGrade = 97;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        numTests++;
        testGrade = 98;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        numTests++;
        testGrade = 99;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

        numTests++;
        testGrade = 96;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.println("Test # " + numTests + "\t\t" + " Test Grade: " + testGrade + "\t\t" + " Total Points: " + totalPoints + "\t\t" + " Average Score: " + average);

    }

}
