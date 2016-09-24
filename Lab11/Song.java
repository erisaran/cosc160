/** lab 11
  * takes a song and processes it
  */


public class Song{
  
  private String songLine; //instatiates song line variable
  
  /** constructs the songLine */
  public Song(String line){
    songLine = line;
  }//end constructor
  
  /** returns the value in songLine */
  public String toString(){    
    return songLine ;
  }// end method
  
  /** processes the songLine */
  public void process(){
    System.out.println(toString()); // prints out the song line
    System.out.println("Length is: " + toString().length()); // prints out length
    System.out.println("Last character is: " + toString().charAt(toString().length() - 1)); // prints out last letter
    int x = toString().indexOf(' '); // finds first space
    int y = toString().indexOf(' ',x+1); //finds the end of the 2nd word
    if (y > -1){ //only if more than 2 words
      String first2 = toString().substring(0,y); //assigns first 2 words to a variable
      String remaining = toString().substring(y+1);    //assigns last 2 words
      System.out.println(first2); //prints first 2
      System.out.println(remaining);
      System.out.println(remaining.charAt(0)); //finds first letter of the 3rd word
    }
    System.out.println(songLine.toUpperCase()); //changes to uppercase
    System.out.println(songLine.replace(' ','x')); // replaces spaces with x
    System.out.println(songLine.indexOf('b')); // finds the first b
    System.out.println(songLine); 
    
    
  }//end method
  
  
  
}//end class