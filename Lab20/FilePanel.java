/** FilePanel.java
  * Lab 20, COMP160,  2014
  * 
  * a JPanel which creates 2 instances of Rectangle objects, 
  * stores them in an array, and draws them 
  */

import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class FilePanel extends JPanel{
  private Rectangle[] drawObjects = new Rectangle [10];
  private int count;
  private boolean isFill;
  private Color isColor;
  private int x;
  private int y;
  private int width;
  private int height;
  
  /**constructor instantiates 6 Rectangle objects*/
  public FilePanel(){  
    //drawObjects[count] = new Rectangle(true,Color.red, 0, 0,30,30);
    String fileName = "LongBadData.txt";
    try {
      Scanner fileScan = new Scanner(new File( fileName )); // makes a scanner for the file     
      while (fileScan.hasNextLine() & count < drawObjects.length){
        String inputLine = fileScan.nextLine(); // temporarily stores a line of numbers
        if (inputLine.matches("\\d+ \\d+ \\d+ \\d+ \\d+ \\d+")){ // only takes lines that have 6 numbers
          Scanner lineScan = new Scanner(inputLine); // takes the line of numbers and assigns them to a variable
          
        for (int i = 0;i<6;i++){
          int fill = lineScan.nextInt(); // reads next token as int
          
          if (i == 0){ // for the first value to determine fill
            if (fill == 1){
              isFill = true;
            }else if (fill == 0){
              isFill = false;
            }
          }
          if (i == 1){ // takes second value to detemine color
            if (fill == 1){ 
              isColor = Color.red;
            }else if (fill == 2){
              isColor = Color.blue;
            }else if (fill == 3){
              isColor = Color.green;
            }
          }
          if (i == 2){ // takes third value to determine x value
            x = fill;
          }
          if (i == 3){ // takes fourth value to determine y
            y = fill;
          }
          if (i == 4){ // fifth for width
            width = fill;
          }
          if (i == 5){ // sixth for height
            height = fill;
          }
          
        }
        drawObjects[count] = new Rectangle(isFill,isColor, x, y, width, height); // calls constructor on the rectangle objects
        count++; // increases count to shift down array
        }
      }// end while
    } catch (FileNotFoundException e){
      System.out.println("File not found. Check file name and location.");
      System.exit(1);// stops program
    }// end catch
    //count++;
    //drawObjects[count] = new Rectangle(false,Color.blue, 50, 50,30,30);
    //count++;
    setPreferredSize(new Dimension(300,300));
    setBackground(Color.yellow);
  }
  
  /**each Rectangle will draw itself*/
  public void paintComponent(Graphics g){
    super.paintComponent(g);
    for(int i = 0; i < count; i++){
      drawObjects[i].draw(g);
    } 
  }
}
