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
        double divisionNumber1 = 25.0000;
        double divisionNumber2 = 9.0000;
   
        // Addition
        System.out.println("Addition");
        System.out.println(additionNumber1 + " + " + additionNumber2 + " = " + (additionNumber1 + additionNumber2));
        System.out.print(subtractionNumber2 + " + " +  subtractionNumber3 + " = ");
        System.out.println(subtractionNumber2 + subtractionNumber3);
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(subtractionNumber1 + " - " + additionNumber2 + " - " + additionNumber1 + " = " + (subtractionNumber1 - additionNumber2 - additionNumber1));
        System.out.println(subtractionNumber3 + " - " + subtractionNumber4 + " = " + (subtractionNumber3 - subtractionNumber4));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(additionNumber1 + " * " + additionNumber2 + " = "  + (additionNumber1 * additionNumber2)); 
        System.out.println(subtractionNumber3 + " * " + subtractionNumber4 + " * " + subtractionNumber4 + " = " + (subtractionNumber3 * subtractionNumber4 * subtractionNumber4));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(divisionNumber2 + " / " + divisionNumber1 + " = " + (divisionNumber2 / divisionNumber1));
        System.out.println(subtractionNumber2 + " / " + subtractionNumber4 + " = " + (subtractionNumber2 / subtractionNumber4));
        System.out.println();
        
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(subtractionNumber1 + " % " + additionNumber2 + " = " + (subtractionNumber1 % additionNumber2 ));
        System.out.println(subtractionNumber4 + " % " + subtractionNumber3 + " = " + (subtractionNumber4 % subtractionNumber3));
        System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("1.08 Additional int Equations");
        
        //variables 
        int inumber1 = 13;
        int inumber2 = 14;
        int inumber3 = 15;
        
        // 1st expression
        System.out.print(inumber1 + " + " + inumber2 + " - " + inumber2 + " = ");
        System.out.println(inumber1 + inumber2 - inumber2);
        
        // 2nd expression
        System.out.println(inumber3 + " % " + inumber1 + " + " + inumber2 + " = " + (inumber3 % inumber1 + inumber2));
        
        // 3rd expression
        System.out.print(inumber3 + " % " + inumber2 + " * " + inumber3 + " / " + inumber3 + " + " + inumber1 + " - " + inumber1 + " = ");
        System.out.println(inumber3 % inumber2 * inumber3 / inumber3 + inumber1 - inumber1);
        System.out.println();
        
        // 1.09 Additional double Equations
        System.out.println("1.09 Additional double Equations");
        
        //variables 
        double dnumber4 = 10.111111;
        double dnumber5 = 21.000;
        double dnumber6 = 5.00;
        
        // 1st expression
        System.out.print(dnumber4 + " + " + dnumber6 + " - " + dnumber6 + " = ");
        System.out.println(dnumber4 + dnumber6 - dnumber6);
        
        // 2nd expression
        System.out.println(dnumber5 + " / " + dnumber4 + " * " + dnumber4 + " = " + (dnumber5 / dnumber4 * dnumber4));
        
        // 3rd expression
        System.out.print(dnumber5 + " % " + dnumber6 + " * " + dnumber4  + " / " + dnumber4 + " + " + dnumber6 + " - " + dnumber6 + " = ");       
        System.out.println(dnumber5 % dnumber6 * dnumber4 / dnumber4 + dnumber6 - dnumber6);
               
    } // end of main method
}
