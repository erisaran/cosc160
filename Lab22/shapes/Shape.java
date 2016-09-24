/* lab 21
 * building shapes
 */

package shapes;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Shape{
  
  private int x;
  private int y;
  private Color col;
  private int width;
  private int height;
  private int moveX = 1;
  private int moveY = 1;

  
  /** shapestructor to create a random circle */
  public Shape(){
    width = randomRange(10, 30);
    height = width;
    x = randomRange(0, 400 - width);
    y = randomRange(0, 400 - height);
    col = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
  }// end shapestructor
  
  /** Returns random integer between high and low parameters.*/
  public int randomRange(int low, int high){
    Random generator = new Random();
    return generator.nextInt(high-low+1) + low;
  }//end method
  
  /** takes a graphics object and displays it based on the color, size and location */
  public void display(Graphics g){
    g.setColor(col);
    g.fillOval(x, y, width, height);
  }//end method
  
  /** prevents the objects from exceeding the bounds of the window and changes their colour randomly each time they touch an edge */
  public void move(){    
    if (x > 400 - width || x < 0){
      moveX = -moveX;
      col = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
    }
    if (y > 400 - height || y < 0){
      moveY = -moveY;
      col = new Color(randomRange(0, 255), randomRange(0, 255), randomRange(0, 255));
    }
    if (width <= 20){
      x += moveX;
    }
    y += moveY;
    
  }//end method
  

}//end class