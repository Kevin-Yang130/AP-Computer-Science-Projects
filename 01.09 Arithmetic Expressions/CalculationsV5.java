/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ Kevin Yang-Li
 * @ 08/23/2020
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // variables
        int additionNumber1 = 25;
        int additionNumber2 = 9;
        int subtractionNumber1 = 11;
        
        // doubles
        double subtractionNumber2 = 43.21;
        double subtractionNumber3 = 3.14;
        double subtractionNumber4 = 10.0;
   
        // Addition
        System.out.println("Addition");
        System.out.println(additionNumber1 + " + " + additionNumber2 + " = " + (additionNumber1 + additionNumber2));
        System.out.print(subtractionNumber2 + " + " +  subtractionNumber3 + " = ");
        System.out.println(subtractionNumber2 + subtractionNumber3);
        System.out.println(" ");
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(subtractionNumber1 + " - " + additionNumber2 + " - " + additionNumber1 + " = " + (subtractionNumber1 - additionNumber2 - additionNumber1));
        System.out.println(subtractionNumber3 + " - " + subtractionNumber4 + " = " + (subtractionNumber3 - subtractionNumber4));
        System.out.println(" ");
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(additionNumber1 + " * " + additionNumber2 + " = "  + (additionNumber1 * additionNumber2)); 
        System.out.println(subtractionNumber3 + " * " + subtractionNumber4 + " * " + subtractionNumber4 + " = " + (subtractionNumber3 * subtractionNumber4 * subtractionNumber4));
        System.out.println(" ");
        
        // Division
        System.out.println("Division");
        System.out.println(additionNumber2 + " / " + additionNumber1 + " = " + (additionNumber2 / additionNumber1));
        System.out.println(subtractionNumber2 + " / " + subtractionNumber4 + " = " + (subtractionNumber2 / subtractionNumber4));
        System.out.println(" ");
        
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(subtractionNumber1 + " % " + additionNumber2 + " = " + (subtractionNumber1 % additionNumber2 ));
        System.out.println(subtractionNumber4 + " % " + subtractionNumber3 + " = " + (subtractionNumber4 % subtractionNumber3));
        System.out.println(" ");
        
        // 1.08 Additional int Equations
        System.out.println("1.08 Additional int Equations");
        
        //variables 
        int number1 = 13;
        int number2 = 14;
        int number3 = 15;
        
        // 1st expression
        System.out.print(number1 + " + " + number2 + " = ");
        System.out.println(number1 + number2);
        
        // 2nd expression
        System.out.println(number3 + " % " + number1 + " = " + (number3 % number1));
        
        // 3rd expression
        System.out.println(number2 + " * " + number3 + " = " + (number2 * number3));
        
        // 1.09 Additional double Equations
        System.out.println("1.09 Additional double Equations");
//variables 
        double number4 = 10.111111;
        double number5 = 20.2422;
        double number6 = 5.32;
        
        // 1st expression
        System.out.print(number1 + " + " + number2 + " = ");
        System.out.println(number1 + number2);
        
        // 2nd expression
        System.out.println(number3 + " % " + number1 + " = " + (number3 % number1));
        
        // 3rd expression
        System.out.println(number2 + " * " + number3 + " = " + (number2 * number3));        
               
    } // end of main method
}

