/** Lab 25
  * temperature converter gui
  */

package TempConverter;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class TempPanel extends JPanel{
  
  private JButton convert;
  private JButton changeUnit;
  private JButton storeNum;
  private JTextField inValue;
  private JLabel outValue;
  private JLabel instruct;
  private JLabel space = new JLabel("  In Fahrenheiht:");
  private JLabel errorSpace = new JLabel("");
  private double input;
  private boolean switcher = true;
  
  
  
  /** constructs the buttons and labels */
  public TempPanel() {
    
    ButtonListener  listener = new ButtonListener(); // Create an actionListener 
    
    convert = new JButton("Convert");
    changeUnit = new JButton("Change Unit");
    storeNum = new JButton("Freezing Point");
    
    JPanel buttonsPanel = new JPanel();
    buttonsPanel.setPreferredSize(new Dimension(450,200));
    buttonsPanel.setBackground(Color.orange);
    buttonsPanel.setLayout(new GridLayout(4, 4));
    
    instruct = new JLabel("  Enter a temperature in celcius: ");
    inValue = new JTextField(10);
    outValue = new JLabel();
    
    convert.addActionListener( listener );
    changeUnit.addActionListener( listener );
    storeNum.addActionListener(listener);
    
    setLayout(new BorderLayout());
    buttonsPanel.add(instruct,BorderLayout.NORTH);
    buttonsPanel.add(inValue,BorderLayout.CENTER);
    buttonsPanel.add(space);
    buttonsPanel.add(outValue);
    buttonsPanel.add(convert);
    buttonsPanel.add(changeUnit);
    buttonsPanel.add(errorSpace);
    
    add(buttonsPanel);
    
  }//end constructor
  
  public double toCelsius(double fahr){
    int BASE = 32;
    double CONVERSION_FACTOR = 9.0/ 5.0;
    double celsius = (fahr - BASE)/CONVERSION_FACTOR;//Step 3 converts into celsius
    return celsius;
  }//end method
  
  public double toFahr(double cels){
    int BASE = 32;
    double CONVERSION_FACTOR = 9.0/5.0;
    double fahr = (cels*CONVERSION_FACTOR) + BASE;
    return fahr;
  }//end method
  
  
  /** represents a listener for button presses */
  private class ButtonListener implements ActionListener{
    
    /** what to do when a button has been pressed */
    public void actionPerformed(ActionEvent e) {
      JButton x = (JButton) e.getSource();
      if ("Convert".equals(x.getText())){
        try{
          input = Double.parseDouble(inValue.getText());
          double result;
          if (!switcher){
            result = toCelsius(input);
          }else{
            result = toFahr(input);
          }
          outValue.setText("" + result);
          errorSpace.setText("");
        } catch (NumberFormatException ex){
          errorSpace.setText("Error: Must enter a number");
          inValue.setText("");
        }//catch
        
      }else if ("Change Unit".equals(x.getText())){
        if (switcher){ 
          switcher = false;
          instruct.setText("  Enter a temperature in Fahrenheit: ");
          space.setText("  In Celsius:" );
        }
        else if (!switcher){ 
          switcher = true;
          instruct.setText("  Enter a temperature in celcius: ");
          space.setText("  In Fahrenheiht:");
        }
      }
        
      
      
      
      
    }//end action method
  }//end action class
  
}//end class







