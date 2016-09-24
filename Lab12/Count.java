/* lab 12
 * counts vowels and consonants in a sentence
 */

import java.util.Scanner;

public class Count{
  
  public static void main(String[] args){
    int countV = 0; // initialises counters
    int countC = 0;
    int index = 0;
    String s; // initialises string
    s = (readInput().toLowerCase()); // calls scanner method
    while ( index < s.length() ){ // while the index is in range of the string length
      char x = s.charAt(index); // takes the individual letter at each point on the string
      if (x >= 'a' && x <= 'z'){ // if the letter is within the unicode character set
        if ( x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ){ // compares letter to vowels
          countV ++; // increases vowel count
        }else{ // if its not a vowel
          countC ++; // increases consonant count
        }//end else
      }// end if for is character and actual letter
      index ++; // moves loop to next word
      
    }// end while loop              
    System.out.println( "Sentence is: "+ s ); // prints out results
    System.out.println( "Vowel Count: " + countV );
    System.out.println( "Consonant Count: " + countC );
    
    
  }//end main
  
  /** reads in a sentence of user input */
  public static String readInput(){
    Scanner sc = new Scanner(System.in);
    return sc.nextLine(); // returns user input
  }// end method
  
  
  
}//end class