/** lab 9
  * determines whether or not the customer is a child and or student
  */

import java.text.DecimalFormat;
import java.util.Scanner;

public class CustomerApp {
  

  
  public static void main (String [] args){
    
    
    
    //each Customer created with name, age, showed student ID card
    Customer customer1 = new Customer("Aaron Stott",17, true);
    Customer customer2 = new Customer("Betty Adams",17, false);
    Customer customer3 = new Customer("Corin Child",16, true);
    Customer customer4 = new Customer("Doris Stewart",25, true);
    Customer customer5 = new Customer("Edmond Cheyne",12, false);
    Customer customer6 = new Customer("Fiona Chaney",7, false);
    Customer customer7 = new Customer("Ged Still-Child",16, true);
    Customer customer8 = new Customer("Harry Adamson",20, false);
    confirmBooking(customer1);
    showBooked(customer1);
    confirmBooking(customer2);
    showBooked(customer2);
    confirmBooking(customer3);
    showBooked(customer3);
    confirmBooking(customer4);
    showBooked(customer4);
    confirmBooking(customer5);
    showBooked(customer5);
    confirmBooking(customer6);
    showBooked(customer6);
    confirmBooking(customer7);
    showBooked(customer7);
    confirmBooking(customer8);
    showBooked(customer8);
    listBooked(customer1);
    listBooked(customer2);
    listBooked(customer3);
    listBooked(customer4);
    listBooked(customer5);
    listBooked(customer6);
    listBooked(customer7);
    listBooked(customer8);
    
    
  }//end main
  
  /** outputs booking information for each customer */
  public static void confirmBooking(Customer customer){
    double ticketPrice = 56.00; //standard price
    double mealPrice = 30.00;
    double tCost; // variable to store cost
    double mCost;
    DecimalFormat d1 = new DecimalFormat(); // formats the numbers
    d1.setMaximumFractionDigits(2);
    d1.setMinimumFractionDigits(2);
    if ( customer.isChild() || customer.isStudent() ){ // checks wether they recieve half price
      tCost = ticketPrice / 2;
    }else{
      tCost = ticketPrice * 0.8;
    }
    if (customer.isChild()){
      mCost = mealPrice / 2;
    }else{
      mCost = mealPrice * 0.9;
    }
    System.out.println( customer.getName() + " Ticket Price:$" + d1.format(tCost) + " Meal Price:$" + d1.format(mCost) + " Total Price:$" + d1.format(tCost + mCost) );
    
  }//end method  
  
  
  /** Booking confirmation */
  public static String readInput(){
    Scanner sc = new Scanner(System.in);
    return sc.nextLine();

    }//end method
  
  /** takes a y or n from the user to confirm booking */
  public static void showBooked(Customer customer){
    System.out.println("Confirm Booking for " + customer.getName() + "(Y/N)");  
    String x = readInput();
    if (( x.compareTo("Y")==0) || ( x.compareTo("y")==0)){
      customer.setBooked(true);
    }else if (( x.compareTo("N")==0) || ( x.compareTo("n")==0)){
      customer.setBooked(false);
    }
    if (customer.isBooked()){
      System.out.println("Booked");
    }else{
      System.out.println("Not Booked");
    }
  }//end method 
  
  /**lists booked customers */ 
  public static void listBooked(Customer customer){
    if (customer.isBooked()){
      System.out.println( customer.getName() + " is booked");
    }else{
      System.out.println( customer.getName() + " is not booked");
    }
  }//end method
    
}//end class
