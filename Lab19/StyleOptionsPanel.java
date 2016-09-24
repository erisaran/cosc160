//********************************************************************
//  StyleOptionsPanel.java      adapted from Java Foundations
//
//  Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel
{
   private JLabel saying; // instantiates variables
   private JCheckBox bold, italic;
   private int style = Font.PLAIN;
   private String typeFace = "Helvetica";
   private JRadioButton courier, timesNewRoman, helvetica;

   //-----------------------------------------------------------------
   //  Sets up a panel with a label and some check boxes that
   //  control the style of the label's font.
   //-----------------------------------------------------------------
   public StyleOptionsPanel()
   {
      saying = new JLabel ("Say it with style!");
      saying.setFont (new Font (typeFace, style, 20));

      bold = new JCheckBox ("Bold"); //initialises the checkboxes
      bold.setBackground (Color.cyan);
      italic = new JCheckBox ("Italic");
      italic.setBackground (Color.cyan);
      

      
      ButtonGroup group = new ButtonGroup(); // group for radio buttons
      group.add(courier = new JRadioButton("Courier"));
      group.add(timesNewRoman = new JRadioButton("Times New Roman"));
      group.add(helvetica = new JRadioButton("Helvetica"));
      helvetica.setSelected(true);      

      StyleListener listener = new StyleListener();
      bold.addItemListener (listener);
      italic.addItemListener (listener);
      courier.addItemListener (listener);
      timesNewRoman.addItemListener (listener);
      helvetica.addItemListener (listener);
      
      setLayout(new GridLayout(6,1));
      add (saying);
      add (bold);
      add (italic);
      add (courier);
      add (timesNewRoman);
      add (helvetica);
      

      setBackground (Color.cyan);
      setPreferredSize (new Dimension(300, 150));
   }

   //*****************************************************************
   //  Represents the listener for both check boxes.
   //*****************************************************************
   private class StyleListener implements ItemListener
   {
      //--------------------------------------------------------------
      //  Updates the style of the label font style.
      //--------------------------------------------------------------
      public void itemStateChanged (ItemEvent event)
      {
         style = Font.PLAIN;

         if (bold.isSelected())
            style = Font.BOLD;

         if (italic.isSelected())
            style += Font.ITALIC;
         
         if (courier.isSelected()){
           saying.setFont (new Font ("Courier", style, 20));
         }else if (timesNewRoman.isSelected()){
           saying.setFont (new Font ("TimesNewRoman", style, 20));
         }else if (helvetica.isSelected()){
           saying.setFont (new Font ("Helvetica", style, 20));
         }else {
           saying.setFont (new Font (typeFace, style, 20));
         }
      }
   }
}
