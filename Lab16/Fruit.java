/* lab 16
 * two dimensional arrays
 */

import java.util.Scanner;

public class Fruit{
  
  public static void main(String [] args){
    String [] fruits = new String [3]; // initialises a string array
    for ( int x = 0; x < fruits.length; x ++ ){
      fruits[x] = readIn("Enter a type of fruit"); // adds a user input to a spot in the array
    }
    for ( String z : fruits ){
      String ask = "Guess what fruit i am? " + z.substring(0,2) + " " + z.length() + " letters"; // asks the user to guess and gives them a hint
      System.out.println( ask );
      guess(z,ask); // sends the fruit in the array, the request and hint to a loop which has the user guess
    }
    
  }//end main
  
  public static boolean guess(String z,String ask){    
    while (true){
      String x = readIn( "Guess what fruit"); // reads the user's guess
      if ( x.equals(z) ){
        System.out.println( "Correct"); 
        return true;
      }else{
        System.out.println( "Try again " + ask );
        
      }
    }
  }//end method
  
  public static String readIn(String prompt){
    Scanner sc = new Scanner(System.in);
    System.out.println(prompt);
    return sc.nextLine();
  }// end scanner
  
}// end class