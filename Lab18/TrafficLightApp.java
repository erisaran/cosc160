/** lab 18
  * Traffic light application class
  */

import javax.swing.*;
import java.awt.*;

public class TrafficLightApp{
  
  public static void main(String[]args){
    JFrame Light = new JFrame("Traffic Light"); // creates the JFrame instance
    Light.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets close operation
    Light.getContentPane().add(new TrafficLightPanel()); 
    Light.pack();
    Light.setVisible(true);
    
  }// end main
  
}// end class