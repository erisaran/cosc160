/** lab 10
  * application to determine whether or not a year is a leap year
  */


public class LeapYear{
  
  /** main method which calls the other methods with years as a parameter */
  public static void main (String [] args){

    leapYear(2010); // calls the leapYear method with a year as the input parameter
    leapYear(2012);
    leapYear(1900);
    leapYear(2000);
    leapYear(1565);

  }//end main
  
  /** determines whether or not the year is a leap year */
  public static void leapYear(int year){
    if (year >= 1582){//checks if the year is after the Gregorian calendar was adopted
      
      if (year % 4 == 0){// checks if the year is divisible by 4
        
        if ((year % 100 == 0) && (year % 400 != 0)){// checks if it is divisible by 100 but not 400
          System.out.println(year + ": is not a leap year"); //outputs negative if year is divisible by 100 but not 400
        }else{
          System.out.println(year + ": is a leap year");// if all criteria are met outputs a positive result
        }
        
      }else{// if year is not divisible by 4
        System.out.println(year + ": is not a leap year");
      }
      
    }else{// if year is before 1582
      System.out.println(year + ": predates the Gregorian calendar"); // if year is too early presents the error message
    }
      

  }//end method


}//end class