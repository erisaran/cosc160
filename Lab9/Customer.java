/** lab 9
  * 
  */


public class Customer {
  
  private String name;
  private boolean child;
  private boolean student;
  private boolean booked;
  
  /** constructor that gets name, whether or not the customer is a child and whether or not a student id was shown and stores the variables */
  public Customer (String n, int age, boolean shown) {
    name = n; // sets name
    child = ((age <= 16) && (age >= 5));
    student = shown; //sets if the student id was shown
  }//end constructor
  
  /** mutator method for booked */
  public void setBooked(boolean confirmed){
    booked = confirmed;
  }//end method
    
  /**default constructor */
  public Customer(){}
  
  /** accessor method for name */
  public String getName(){
    return name;
  }//end method
  
  /** accessor method for child */
  public boolean isChild(){
    return child;
  }//end method
  
  /** accessor method for student */
  public boolean isStudent(){
    return student;
  }//end method
  
  //** accessor method for booked */
  public boolean isBooked(){
    return booked;
  }//end method

  
}
  
  