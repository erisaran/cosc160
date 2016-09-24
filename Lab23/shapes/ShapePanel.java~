/** lab 21
  * Shape panel class
  */

package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapePanel extends JPanel{
  
  private Shape [] shapes = new Shape [20];
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private static int counter;
  private JButton start;
  private JButton stop;
  private Timer timer;
  private final int DELAY = 10;
  
  public static void main(String [] args){
    JFrame s = new JFrame("Lab 21"); // creates the JFrame instance
    s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets close operation
    s.getContentPane().add(new ShapePanel()); 
    s.pack();
    s.setVisible(true);
  }// end main
  
  /** constructor which creates button, label and panel objects and implements the control and drawing panel */
  public ShapePanel(){    
    
    addShape = new JButton("Add Shape"); // instantiates the buttons
    start = new JButton("Start");
    stop = new JButton("Stop");
    
    ButtonListener listener = new ButtonListener(); // creates a buttonlistener object
    addShape.addActionListener( listener );
    start.addActionListener(listener);
    stop.addActionListener(listener);
    
    timer = new Timer(DELAY, listener); // creates a timer object
    
    showNum = new JTextField("0  ");
    countLabel = new JLabel("Count: ");
    
    JPanel controlPanel = new JPanel(); // places the objects in the control panel
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add( addShape );
    controlPanel.add( countLabel );
    controlPanel.add( showNum );
    controlPanel.add( start );
    controlPanel.add( stop );
    
    
    DrawingPanel drawPanel = new DrawingPanel();
    
    add(controlPanel);
    add(drawPanel);
    
  }
  
  private class ButtonListener implements ActionListener{
    
    /** action performed method to change the text in the count label */
    public void actionPerformed( ActionEvent event ){
      if (event.getSource() == addShape){ // action for add shape button, creates a new shape object
        if (counter < shapes.length){
          shapes[counter] = new Shape();
          counter++;          
        }
        showNum.setText( "" + counter );
        
      }
      else if (event.getSource() == timer){ // action for timer even
        for (int i = 0;i< counter; i++){
          shapes[i].move();
        }
      }
      else if (event.getSource() == start){ //action for start button, starts timer
        timer.start();
      }
      else if (event.getSource() == stop){ // action for stop button, stops timer
        timer.stop();
      }
      repaint();
    }//end action method
  }//end class
  
  private class DrawingPanel extends JPanel{
    
    /** constructor which sets size and background color of the drawing panel*/
    public DrawingPanel(){
      setPreferredSize( new Dimension (400, 400));
      setBackground(Color.pink);
    }//end method
    
    /** calls the display method to draw each object in the shapes array */
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for (int i = 0; i< counter; i++){
        Shape x = shapes[i];
        x.display(g);
      }
      
    }// end paint component
    
  }//end class
  
}//end class


