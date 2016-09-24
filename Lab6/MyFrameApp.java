/** q6
  * app class for MyFrame
  */

import java.awt.*; // imports the stuff to make colors

public class MyFrameApp{
  
  public static void main(String [] args){
    MyFrame m1 = new MyFrame(); // instantiates the first instance of myframe
    m1.setSize(300,150); // sets size
    m1.setVisible(true); // makes it visible
    m1.decorate(Color.blue, "Einstein",180); // changes color, title and y position
    
    MyFrame m2 = new MyFrame(); // instantiates the first instance of myframe
    m2.setSize(300,150); // sets size
    m2.setVisible(true); // makes it visible
    m2.decorate(Color.red, "Hello", 700); // changes color, title and y position
    
  }// end of main method
  
}//end of class
    
    