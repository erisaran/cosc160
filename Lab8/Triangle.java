/** lab 8
  * part 1, COMP 160
  * program to take the 3 points of a triangle and return the perimetre and hypotenuse
  */

import java.text.DecimalFormat;

public class Triangle{
  
  private String triName; //name
  private int x1c; // x coordinate for the first point
  private int y1c; //y coordinate for the first point
  private int x2c;
  private int y2c;
  private int x3c;
  private int y3c;
  private double dist1; //distance of the first leg
  private double dist2; //distance of the second leg
  
  
  /** triangle constructor */
  public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, String name){
    x1c = x1; // sets first x point
    x2c = x2;
    x3c = x3;
    y1c = y1; // sets first y point
    y2c = y2;
    y3c = y3;
    triName = name; //sets name
  }//end constructor
  
  /** hypotenuse constructor */
  public Triangle(double d1, double d2,String name){
    dist1 = d1; //sets the first distance
    dist2 = d2;
    triName = name; //sets the name
  }//end constructor
    
  /** default constructor */
  public Triangle(){} 
  
  
  
  /** returns the perimetre */
  public double getPerimetre(){

    double s1 = Math.sqrt( Math.pow((x1c-x2c),2) + Math.pow((y1c-y2c),2) ); // distance of first side
    double s2 = Math.sqrt( Math.pow((x1c-x3c),2) + Math.pow((y1c-y3c),2) ); //distance of second side
    double s3 = Math.sqrt( Math.pow((x2c-x3c),2) + Math.pow((y2c-y3c),2) ); //distance of thrid side
    return (s1 + s2 + s3); //returns perimetre
    
  }//end method
  
  /** returns a string displaying perimetre */
  public String toString(){
    DecimalFormat d1 = new DecimalFormat();
    d1.setMaximumFractionDigits(2);
    return ("Perimetre of "+ triName+ " is: "+ (d1.format(getPerimetre())));
    
  }//end method  
  
  
  
  
  /** calculates and returns the hypotenuse */
  public double getHypotenuse(){
    return Math.sqrt(Math.pow(dist1,2)+Math.pow(dist2,2));
    
  }//end method
  
  /** returns hypotentuse */
  public String hypot(){
    DecimalFormat d1 = new DecimalFormat();
    d1.setMaximumFractionDigits(2);
    return ("The hypotenuse of "+ triName+ " is: "+ (d1.format(getHypotenuse()))); 
    
  }//end method
  
  
  
}//end class