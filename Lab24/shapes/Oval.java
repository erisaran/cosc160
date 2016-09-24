/** lab 23
  * oval class to extend shape class
  */

package shapes;

import java.awt.*;

public class Oval extends Shape{
  
  /** constructor the set height and reset y */
  public Oval(){
    height = 4 * width;
    y = randomRange(0, 400 - height);
  }
  
  /** takes a graphics object and displays it based on the color, size and location */
  public void display(Graphics g){
    g.setColor(col);
    g.fillOval(x, y, width, height);
  }//end method
}//end class