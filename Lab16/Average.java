/* lab 16
 * displays average of an array row
 */


public class Average{
  
  public static void main (String [] args){
    int [] [] table = {{1,2,3},{4,5,6},{7,8}}; // initialises the array
    for (int row = 0; row < table.length; row++){
      double total = 0; // tracks the sum of the row
      for (int z : table[row]){
        System.out.print( z + " "); // prints out each value in each row
        total += z; // adds each value to a row total
      }
      System.out.println( "\t Average" + total/table[row].length ); //prints out the average and declares a new line
    }
    
  }//end main
  
}//end class