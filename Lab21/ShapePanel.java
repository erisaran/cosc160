/** lab 21
  * Shape panel class
  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ShapePanel extends JPanel{
  
  private Shape [] shapes = new Shape [20];
  private JButton addShape;
  private JTextField showNum;
  private JLabel countLabel;
  private static int counter;
  
  public static void main(String [] args){
    JFrame s = new JFrame("Lab 21"); // creates the JFrame instance
    s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //sets close operation
    s.getContentPane().add(new ShapePanel()); 
    s.pack();
    s.setVisible(true);
  }// end main
  
  public ShapePanel(){    
    
    addShape = new JButton("Add Shape");
    
    ButtonListener listener = new ButtonListener();
    addShape.addActionListener( listener );
    
    showNum = new JTextField("0  ");
    countLabel = new JLabel("Count: ");
    
    JPanel controlPanel = new JPanel();
    controlPanel.setPreferredSize(new Dimension(100,400));
    controlPanel.add( addShape );
    controlPanel.add( countLabel );
    controlPanel.add( showNum );    
    
    DrawingPanel drawPanel = new DrawingPanel();
        
    add(controlPanel);
    add(drawPanel);
    
  }
  
  private class ButtonListener implements ActionListener{
    
    /** action performed method to change the text in the count label */
    public void actionPerformed( ActionEvent event ){
      if (event.getSource() == addShape){
        if (counter < shapes.length){
          shapes[counter] = new Shape();
          counter++;          
        }
        
      }
      showNum.setText( "" + counter );
      repaint();
    }//end action method
  }//end class
  
  private class DrawingPanel extends JPanel{
    
    /** constructor */
    public DrawingPanel(){
      setPreferredSize( new Dimension (400, 400));
      setBackground(Color.pink);
    }//end method
    
    public void paintComponent(Graphics g){
      super.paintComponent(g);
      for (int i = 0; i< counter; i++){
        Shape x = shapes[i];
        x.display(g);
      }
        
    }// end paint component
    
  }//end class
  
}//end class


