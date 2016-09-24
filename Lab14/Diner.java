/** lab 14
  * sets the locations for diners
  */

import javax.swing.*;
import java.awt.*;

public class Diner{
  
  private int x; // x coordinate
  private int y; // y coordinate
  private String name; // diner name
  private Color gender; // color of the diner
  private String seat; // seat position
  final private int diametre = 50; // standard circle diamter
  
  /** constructor to set the location, name and gender of a single diner */
  public Diner(int xCoord, int yCoord, String n, Color g, String s){
    x = xCoord; //sets x
    y = yCoord; // sets y
    name = n; // sets name
    gender = g; // sets gender color
    seat = s; //sets seat number
    
  }//end constructor
  
  /** draw method */
  public void draw(Graphics g){
    g.setColor(gender); // sets the gender specific color
    g.fillOval(x, y, diametre, diametre); // draws the circle
    g.setColor(Color.black);
    g.setFont(new Font("Courier", Font.PLAIN, 14)); 
    g.drawString(name, x , y + 30 ); // prints name
    g.setFont(new Font("Helvetica", Font.PLAIN, 16));
    g.drawString(seat, x + 20, y + 18); // prints seat number
  }// end draw method
  
}// end class
    