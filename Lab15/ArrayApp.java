/** lab 15
  * app for finding a int in an array
  */

import java.util.Random;
import java.util.Scanner;

public class ArrayApp{
  
  public static void main (String [] args){
    int one = readIn("Which number do you wish to find");
    Array a1 = new Array(makeArray());
    a1.showTarget(one);
    int two = readIn("Which number do you wish to find");
    Array a2 = new Array(makeArray());
    a2.showTarget(two);
    int three = readIn("Which number do you wish to find");
    Array a3 = new Array(makeArray());
    a3.showTarget(three);
  }// end main
  
  /* reads an integer from user input */
  public static int readIn(String prompt){
    Scanner sc = new Scanner(System.in);
    System.out.println(prompt);
    return sc.nextInt();
  }// end scanner
  
  public static int [] makeArray(){
    int length = arrayLength();
    int [] ar = new int [length];
    for (int a = 0; a < length; a ++){
      ar[a] = arrayNumber();
    }
    return ar;
  }
  
  /*generates a random length for the array between 5 and 10 */
  public static int arrayLength(){
    Random generator = new Random();
    return generator.nextInt(6) + 5;
  }// end method
  
  /* generates a random number between 0 and 4 */
  public static int arrayNumber(){
    Random generator = new Random();
    return generator.nextInt(5);
  }// end method
  
}// end class
  
