/* lab 23
 * circle class used to create a circle object
 */

package shapes;

import java.awt.*;

public class Circle extends Shape{
  
  /** takes a graphics object and displays it based on the color, size and location */
  public void display(Graphics g){
    g.setColor(col);
    g.fillOval(x, y, width, height);
  }//end method
  
}//end class