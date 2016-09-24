/** 
 * Calculator.java
 * 
 * Lab 19, COMP160,  2014
 * 
 * A calculator class - for SIMPLE calculations like 5 + 20 =
 * Large inputs will overload int, should convert to long 
 */


public class Calculator {  
  
  private long currentInput;          //current input
  private long previousInput;         // previous input
  private long result;            // result of calculation
  private String lastOperator = "";  // keeps track of the last operator entered
  private boolean isNegative;
  
  
  /** New digit entered as integer value i - moves currentInput 1 decimal place to the left and adds i in "one's column" */
  public void inDigit(long i) {
    if (isNegative){
      currentInput = (currentInput *10) - i;
    }else{
      currentInput = (currentInput * 10) + i;
    }
  }
  
  
  /** Operator entered  + - or *   */
  public void inOperator(String op) {
    if (op.equals("-")){
      if (currentInput == 0){
        isNegative = true;
      }else{
        previousInput = currentInput;
        currentInput = 0;
        lastOperator = op;
        isNegative = false;
      }
    }else{
      previousInput = currentInput;      // save the new input as previous to get ready for next input
      currentInput = 0;
      lastOperator = op;                 // remember which operator was entered
      isNegative = false;
    }
        } 
  
  
   /** Equals operation sets result to previousInput + - or * currentInput (depending on lastOperator) */
  public void inEquals() {
    if (lastOperator.equals("+")) {
      result = previousInput + currentInput;
    } else if (lastOperator.equals("-")) {
      result = previousInput - currentInput;
    } else if (lastOperator.equals("*"))  {
      result = previousInput * currentInput;
    }
    if (previousInput == 0){
      result = currentInput;
    }
    lastOperator = "";       // reset last operator to "nothing"
    currentInput = result;
    
    
  }
  
  
  /** Clear operation */
  public void inClear() {
    currentInput = 0;
    previousInput = 0;
    result = 0;
    lastOperator = "";
  } 
  
  /** returns the current result */
  public String getResult() {  
    return Long.toString(result);  //converts int to String
  }
  
  /** returns the previous input value */
  public String getPreviousInput() {
    return Long.toString(previousInput);
  }
  /** returns the current input value */
  public String getCurrentInput() {
    return Long.toString(currentInput);
  }
  
  }  

