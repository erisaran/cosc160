/** lab 25
  * app class
  */

package TempConverter;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class TempApp{
  
  /**main method - sets up JFrame*/
  public static void main(String [] args){
    JFrame frame = new JFrame("Temperature Converter");
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(new TempPanel());    
    frame.pack();
    frame.setVisible(true);
  }//end main
  
}//end class