/**
 Pie.java
 Provided for Part 2, Lab5, COMP160 2014
 
 */

import javax.swing.*;
import java.awt.*;

public class Pie extends JFrame{
    
    /**creates  an instance of Pie called chart1*/
    public static void main(String[]args){
        Pie chart1 = new Pie(); 
        chart1.setSize(300,220);
        chart1.setVisible(true);
    }
    
    /**all drawing code goes in the paint method, which is called automatically*/
    public void paint (Graphics page){
        page.setColor(Color.white);
        page.fillRect(0,0,300,220);
        //your pie chart code goes here
        
        final int x = 75; 
        final int y = 40;
        final int w = 150;
        final int h = 150;
        final int l = 45;
        setTitle("Pie Chart");
        
        //first slice
        page.setColor (Color.cyan);
        page.fillArc (x,y,w,h,45,l);
        
        // 2nd
        page.setColor (Color.orange);
        page.fillArc (x,y,w,h,90,l);
        
        //3rd
        page.setColor (Color.blue);
        page.fillArc (x,y,w,h,135,l);
        
        //4th
        page.setColor (Color.red);
        page.fillArc (x,y,w,h,180,l);
        
        //5th
        page.setColor (Color.green);
        page.fillArc (x,y,w,h,225,l);
        
        //6th
        page.setColor (Color.yellow);
        page.fillArc (x,y,w,h,270,l);
        
        //7th
        page.setColor (Color.pink);
        page.fillArc (x,y,w,h,315,l);
        
        //off set
        page.setColor (Color.gray);
        page.fillArc (x+12, y-6,w,h,0,l);
        
        
        
        
    }
}
