/** lab 11
  * Song application to input and process songs
  */


public class SongApp{
  
  public static void main(String[]args){
    Song s = new Song("While my guitar gently weeps"); //instantiates a variable with a string 
    s.process(); //calls the process method
    Song s2 = new Song("Let it be");
    s2.process();
    Song s3 = new Song("Penny Lane");
    s3.process();
    
  }//end main
  
}//end class
