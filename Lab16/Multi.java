/* lab 16
 * 12x12 multiplication table
 */


public class Multi{
  
  public static void main(String [] args){
    
    int [] [] multiArray = new int [12] [12];
    for (int row = 1; row < 13; row ++){
      for (int col = 1; col < 13; col++){
        multiArray[row-1][col-1] = row * col;
      }
    }
      for ( int [] row : multiArray ){
        for (int each : row ){
        System.out.print( each + "\t");
      }System.out.println("");
      }
      
    
    
  }// end main
  
}// end class