/* lab 14
 * application class
 */

import javax.swing.*;
import java.awt.*;

public class DinerApp{
  
  /* main method to draw the entire object */
  public static void main(String[]args){
    JFrame x = new JFrame("Table"); // creates Jframe object
    x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close operation
    x.getContentPane().add(new TablePanel());// adds the TablePanel to the jframe
    x.pack();
    x.setVisible(true);
    



    


  }// end main
  
}// end class

  