/** lab 15
  * program to show every instance of a target integer in an array
  */


import java.util.Random;

public class Array{
  
  private int [] x; //initialises the array data field
  
  /* array constructor method */
  public Array(int [] ar){
    x = ar;
    for (int z : x){
     System.out.print(z + " ");
    }
    System.out.println("Array is of length " + x.length);
    
  }// end constructor
  
  /*reads an integer and finds it position in the array */
  public void showTarget(int input){
    int check = 0;
    for (int count = 0;count < x.length; count ++){
      if ( x[count] == input ){
        System.out.println( "  There is a " + input + " at postion " + count );
        check ++;
      }
    }
    if (check == 0){
      System.out.println( "There are no " + input + "'s in this array");
    }
  }
  
  
}// end class