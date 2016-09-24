/** lab 23
  * square class to draw a square
  */

package shapes;

import java.awt.*;

public class Square extends Shape{
  
  /** takes a graphics object and displays it based on the color, size and location */
  public void display(Graphics g){
    g.setColor(col);
    g.fillRect(x, y, width, height);
  }//end method  
  
}