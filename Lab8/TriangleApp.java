/** lab 8
  * part 1, COMP 160
  * app that outputs the perimetres of triangles
  */

  
public class TriangleApp{
  
  /** creates the triangle and measures the the perimetres */
  public static void main (String [] args){
    
    Triangle t1 = new Triangle(0,3,1,9,3,4,"Triangle A"); //instantiates a triangle with points (0,3),(1,9) and (3,4) called Triangle A
    Triangle t2 = new Triangle(4,2,6,7,9,4,"Triangle B"); //instantiates a triangle with points (4,2),(6,7) and (9,4) called Triangle B
    Triangle t3 = new Triangle(0,0,3,0,3,4,"Triangle C"); //instantiates a triangle with points (0,0),(3,0) and (3,4) called Triangle C
    Triangle h1 = new Triangle(3.4,4.7,"Triangle D"); // instatiates a traingle with the distance of the 2 legs
    
    System.out.println(t1.toString()); // displays perimetre
    System.out.println(t2.toString());
    System.out.println(t3.toString());
    System.out.println(h1.hypot()); // displays hypotenuse
  }// end main
  
}// end class
    