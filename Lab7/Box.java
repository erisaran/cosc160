/** lab 7
  */

public class Box{
  
  private int height; //height
  private int width; //width
  private int length; //length
  
  /** constructor to set height,width and length */
  public Box(int h, int w, int l){
    height = h;
    width = w;
    length = l;
  }// end method  
  
  /** cubestructor */
  public Box(int d){
    height = d;
    width = d;
    length = d;
  }//end method
  
  /** default constructor */
  public Box(){}  
  
  /** sets height to input value */
  public void setHeight(int h){
    height = h;
  }//end method
  
  /** sets width to input value */
  public void setWidth(int w){
    width = w;
  }// end method
  
  /** sets length to input value */
  public void setLength(int l){
    length = l;
  }// end method
  
  /** return volume */
  public int getVolume(){
    return height * width * length;
  }//end method
  
  /**return surface area */
  public int getSurfaceArea(){
    return ((height * width) + (length * width) + (height * length))*2;
  }//end method
  
  //** displays all values */
  public String toString(){
    return ("Height is: " + height + ", Width is: " + width + ", Length is: " + length +", Volume is: " + getVolume() + ", Surface Area is: " + getSurfaceArea());
  }// end method

}// end class
  
  