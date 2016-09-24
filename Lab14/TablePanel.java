/* lab 14
 * table panel class
 * creates 6 diner objects and draws them
 */

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel{
  
  Diner d1;// initialises diner objects
  Diner d2;
  Diner d3;
  Diner d4;
  Diner d5;
  Diner d6;
  
  /* constructor for 6 diners */
  public TablePanel(){
    
    d1 = new Diner(125,25,"Murray",Color.cyan,"1"); // constructs diner location
    d2 = new Diner(193,85,"Anne",Color.green,"2");
    d3 = new Diner(193,138,"Roger",Color.cyan,"3");
    d4 = new Diner(125,205,"Bella",Color.green,"4");
    d5 = new Diner(57,138,"Colin",Color.cyan,"5");
    d6 = new Diner(57,85,"Josie",Color.green,"6");
    
    setPreferredSize(new Dimension(300,300)); // sets panel size
    setBackground(Color.yellow);      // sets background color               
  }
  
  /* paint component method */
  public void paintComponent(Graphics g){
    super.paintComponent(g); 
    d1.draw(g);// draws diners
    d2.draw(g);
    d3.draw(g);
    d4.draw(g);
    d5.draw(g);
    d6.draw(g);
    g.setColor(Color.orange);
    g.fillRect(110,80,80,120); // draws rectangle
    
  }// end paint component
  
}//end class