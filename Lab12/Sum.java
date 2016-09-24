/* lab 12
 * program to gets sum of all even integers between 2 and input value
 */

import java.util.Scanner;

public class Sum{
  
  public static void main(String[] args){
    int max; // initialises variables
    int evenInt = 2;
    int sum = 0;
    max = maxNum(); // takes input value
    if ( max>=2 ){ 
    while ( evenInt <= max ){ // while 
      sum += evenInt; // adds to sum
      evenInt += 2; // increases to next even number
    }
    System.out.println( "Sum of even numbers between 2 and "+max+ " inclusive is: "+sum ); // prints out result
    }else{
      System.out.println( "Input value must not be less than 2" ); // error message
    }
  }//end method
  
  /** recieves user input for the calculation */
  public static int maxNum(){
    Scanner sc = new Scanner(System.in);
    return sc.nextInt(); // returns input
  }// end method
 
    
}//end class
      
    