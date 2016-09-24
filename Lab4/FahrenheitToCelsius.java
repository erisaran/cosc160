/**Lab 4 COMP160 2014
  * simple app to convert fahrenheit to celsius
 * Starting code*/

import java.util.Scanner;

public class FahrenheitToCelsius{
  public static void main(String[]args){
    convertFToC();
    convertFToC();
    convertFToC(); //Step 5 takes 3 values to print out conversion;
  }

  /**gets input from user representing fahrenheit and displays celsius equivalent*/
  public static void convertFToC(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Fahrenheit temperature");
    double fahrenheit = scan.nextDouble(); //Step 2 - assign next double input from Scanner object
    System.out.println(fahrenheit + " degrees Fahrenheit is " + toCelsius(fahrenheit)+ " degrees Celsius"); //Step 4 print out full statement
  }


  /**calculates and returns the celsius equivalent of a double input parameter called fahrenheit*/
  public static double toCelsius(double fahr){
    int BASE = 32;
    double CONVERSION_FACTOR = 9.0/ 5.0;
    double celsius = (fahr - BASE)/CONVERSION_FACTOR;//Step 3 converts into celsius
    return celsius;
  }
}