/* Lab 13
 * compares words to see if they are anagrams
 */

import java.util.Scanner;

public class AnagramApp{
  
  public static void main(String[] args){
    
    String strinput = readInput("Enter first word"); // gets first word
    String strinput2 = readInput("Enter second word"); // second word
    String list = getLetters(strinput); // processes first word
    String list2 = getLetters(strinput2); // processes second word
    if (list.equals(list2)){
      System.out.println(strinput + " is an anagram of "+ strinput2);// print if they are anagrams
    }else{
      System.out.println(strinput + " is not an anagram of " + strinput2); // if not anagrams
    }
  }// end main
  
  /** uses a for loop to get a list of letters in a word in alphabetical order */
  public static String getLetters(String st){
    String s = st.toLowerCase(); // set to lower case
    String letters = ""; // create empty string
    for (char c = 'a'; c <= 'z'; c ++){
      for (int i = 0; i < s.length(); i ++){
        if (s.charAt(i) == c){
          //char letter[] = {c}; // gets the chars
          //String str = new String(letter); // makes them a string
          letters += c; // adds them to the letters list
        }
      }
    }
    System.out.println(letters + " are the letters of " + st + " in order");// prints letter list
    return letters; //send the list back to the main method
  }//end method 
  
  public static String readInput(String prompt){
    System.out.println(prompt);
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();
  }//end scanner method
  
}//end class