/** lab 7
  * box app
  */

public class BoxApp{
  
  /** sets and displays box measurements*/
  public static void main (String [] args){
    
    Box b1 = new Box(); //instantiates the first box object
    b1.setHeight(4); //sets height
    b1.setWidth(4); // sets width
    b1.setLength(6); //sets length
    
    System.out.println(b1.toString()); //displays mesurements
    
    Box b2 = new Box(3, 4, 5); // instantiates a box using the constructor method
    System.out.println(b2.toString()); // displays mesurements
    
    Box b3 = new Box(5); // instatiates a cube using the single parameter constructor
    System.out.println(b3); // displays mesurements
    
  }// end method
  
}//end class
  
  