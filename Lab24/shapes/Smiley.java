/** lab 23
  * smiley class to draw a set size smiley face
  */

package shapes;
import java.awt.*;

public class Smiley extends Shape{
  
  /** constructor to set height and width and recalculate x and y */
  public Smiley(){
    height = 30;
    width = 30;
    x = randomRange(0, 400 - width);
    y = randomRange(0, 400 - height);
    
  }// end constructor
  
  /** takes a graphics object and displays it based on the color, size and location */
  public void display(Graphics g){
    g.setColor(Color.yellow);
    g.fillOval(x, y, width, height);
    g.setColor(Color.black);
    g.drawOval(x, y, width, height);
    g.fillOval(x + 7, y + 8, 4, 4);
    g.fillOval(x + 20, y + 8, 4, 4);
    if (moveY < 0){g.drawArc(x+ 8, y + 10, 15, 13, 190, 160);}
    else if (moveY > 0){g.drawArc(x+ 8, y + 18, 15, 13, 10, 160);}
    
    
  }//end method
}//end class