/**
 * Lab 3, COMP160, 2014
 */

import java.util.Scanner;

public class Fish{
 
  public static void main(String [] args){
    String verse3 = "This one has a little star.";
    String verse4 = readVerse("Enter a verse");
    printVerse1(); 
    printVerse2();
    printVerse(verse3);
    //System.out.println(verse4);
    printVerse(verse4);
  }//end main
  
  /**declares a String variable called verse1 and displays it on the screen*/
  public static void printVerse1(){
    String verse1 = "One fish\nTwo fish\nRed fish\nBlue fish.\n";
    System.out.println(verse1);
  }//end printVerse1
  
  /**declares a String variable called verse2 and displays it on the screen*/
  public static void printVerse2(){
    String verse2 = "Black fish\nBlue fish\nOld fish\nNew fish.\n";
    System.out.println(verse2);
  }//end printVerse2
  
  /**uses a passed in parameter and prints it when the method is called */
  public static void printVerse(String verse){
    System.out.println(verse + "\n");
  }//end verse3
  
  /** Reads user input and passes it into the verse4 variable*/
  public static String readVerse(String message){
    Scanner scan = new Scanner(System.in);
    System.out.println(message);
    return scan.nextLine();
  }//end readVerse
  
}//end class
