/** Lab 18
  * Traffic light panel class
  * draws objects to the panel
  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLightPanel extends JPanel{
  
  private JButton red, amber, green; // initialises buttons
  private JLabel buttonPanelLabel;
  private JLabel lastPressed;
  private JPanel buttonPanel;
  
  /** constructor */
  public TrafficLightPanel(){
    red = new JButton("red"); // instantiates buttons
    amber = new JButton("amber");
    green = new JButton("green");
    
    ButtonListener listener = new ButtonListener(); // listener objects
    red.addActionListener( listener );
    amber.addActionListener( listener );
    green.addActionListener( listener );
    
    buttonPanelLabel = new JLabel("Button Panel");
    lastPressed = new JLabel("Last Pressed");
    
    buttonPanel = new JPanel();
    buttonPanel.setPreferredSize(new Dimension (80,290));// sets panel size
    buttonPanel.setBackground(Color.white);// sets background color 
    buttonPanel.add( buttonPanelLabel ); // adds labels and lights
    buttonPanel.add( red );
    buttonPanel.add( amber );
    buttonPanel.add( green );
    //buttonPanel.add( lastPressed );
    
    LightPanel light = new LightPanel();
    
    setPreferredSize(new Dimension (200, 300)); // sets the traffic light panel attributes
    setBackground( Color.blue );
    add( buttonPanel); // adds the button panel
    add( light );
    
  }//end constructor
  
  
  
  
  
  
  
  private class ButtonListener implements ActionListener{
    
    /** action performed method to change the text in the last pressed label */
    public void actionPerformed( ActionEvent event ){
      if (event.getSource() == red){
        lastPressed.setText("Red"); //sets text to red
        //buttonPanel.setBackground(Color.red); //sets background color to red
      }else if (event.getSource() == amber){
        lastPressed.setText("Amber");
        //buttonPanel.setBackground(Color.orange);
      }else{
        lastPressed.setText("Green");
        //buttonPanel.setBackground(Color.green);
      }
      repaint(); // refreshes the panel
      
    }//end method
    
  }//end Class
  
  private class LightPanel extends JPanel{
    
    /* paint component method */
    public void paintComponent(Graphics g){
      super.paintComponent( g ); 
      g.setColor(Color.black); // sets color to black
      g.fillOval( 20,30,40,40 ); //draws a circle
      //g.setColor(Color.orange);
      g.fillOval( 20,90,40,40 );
      //g.setColor(Color.green);
      g.fillOval( 20,150,40,40 );
      if ((lastPressed.getText()).equals("Red")) {
        g.setColor(Color.red); 
        g.fillOval( 20,30,40,40 );
      }else if ((lastPressed.getText()).equals("Amber")){
        g.setColor(Color.orange);
        g.fillOval( 20,90,40,40 );
      }else if ((lastPressed.getText()).equals("Green")){
        g.setColor(Color.green);
        g.fillOval( 20,150,40,40 );
      }
      
    }//end paint component
    
    /** constructor */
    public LightPanel(){
      setPreferredSize( new Dimension (80,290));
      setBackground( Color.cyan );
      
    }//end constructor
    
  }//end class
  
}//end class



