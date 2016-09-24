/** lab 21
  * Shape panel class
  */

package shapes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ShapePanel extends JPanel{
  
  private ArrayList<Shape> shapes = new ArrayList<Shape>();
  private JButton [] buttonArray = new JButton [9];
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
    
    buttonArray[0] = new JButton("Circle"); //adds buttons to the array
    buttonArray[1] = new JButton("Square");
    buttonArray[2] = new JButton("Oval");
    buttonArray[3] = new JButton("Smiley");
    buttonArray[4] = new JButton("Swirl");
    buttonArray[5] = new JButton("Tardis");
    buttonArray[6] = new JButton("Start");
    buttonArray[7] = new JButton("Stop");
    buttonArray[8] = new JButton("Remove");
    
    
    ButtonListener listener = new ButtonListener(); // creates a buttonlistener object
    
    timer = new Timer(DELAY, listener); // creates a timer object
    
    showNum = new JTextField("0    ");
    countLabel = new JLabel("Remove Which?: ");
    
    JPanel controlPanel = new JPanel(); // places the objects in the control panel
    controlPanel.setPreferredSize(new Dimension(100,400));
    
    for (JButton x : buttonArray){
      x.addActionListener( listener );
      controlPanel.add( x );
    }
    controlPanel.add( countLabel );
    controlPanel.add( showNum );    
    
    DrawingPanel drawPanel = new DrawingPanel();
    
    add(controlPanel);
    add(drawPanel);
    
  }
  
  private class ButtonListener implements ActionListener{
    
    /** action performed method to create an object based on the button that was pushed and change the text in the count label */
    public void actionPerformed( ActionEvent event ){
      
      if (event.getSource() == timer){ // action for timer even
        for (int i = 0;i< counter; i++){
          shapes.get(i).move();
        }
      }
      else { JButton button = (JButton) event.getSource();
        if (button.getText() == "Circle"){
          //if (counter < shapes.length){
          shapes.add(new Circle());
          counter++;          
          //}

        }else if (button.getText() == "Square"){
          //if (counter < shapes.length){
          shapes.add(new Square());
          counter++;          
          //}

        }else if (button.getText() == "Oval"){
          //if (counter < shapes.length){
          shapes.add(new Oval());
          counter++;          
          //}

        }else if (button.getText() == "Smiley"){
          //if (counter < shapes.length){
          shapes.add(new Smiley());
          counter++;          
          //}
          
        }else if (button.getText() == "Swirl"){
          //if (counter < shapes.length){
          shapes.add(new Swirl());
          counter++;          
          // }

        }else if (button.getText() == "Tardis"){
          // if (counter < shapes.length){
          shapes.add(new Tardis());
          counter++;          
          // }

        }else if (button.getText() == "Start"){ //action for start button, starts timer
          timer.start();
        }else if (button.getText() == "Stop"){ // action for stop button, stops timer
          timer.stop();
        }else if (button.getText() == "Remove"){ // removes a object at a specified value
          try{
            int textField = Integer.parseInt(showNum.getText());            
            shapes.remove(textField); // removes the shape at the specified index
            counter--; // lowers the counter to the new index range            
          } catch (NumberFormatException e){
            System.out.println("Error: Must be an integer");
          }//catch
          catch (IndexOutOfBoundsException e){
            System.out.println("Error: Must be within the index range");
          }//catch
          
        }
      }
      
      
      showNum.setText( "" + (counter -1)); // sets the text field to the last index in the array
      if (shapes.isEmpty()){
        showNum.setText("    ");}
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
        Shape x = shapes.get(i);
        x.display(g);
        x.showIndex(g,i);
      }
      
    }// end paint component
    
  }//end class
  
}//end class


