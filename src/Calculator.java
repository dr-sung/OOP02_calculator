/**
 * Basic concept of OOP; a simple calculator
 */
public class Calculator {

  private double lastNumber;
  private double secondLastNumber;
  private double result;
  
  public Calculator() {
      result = 0;
  }

  /*
   * Only last two numbers entered are stored
   */
  public void enter(double number) {
    secondLastNumber = lastNumber;
    lastNumber = number;
  }

  public void add() {
    result = lastNumber + secondLastNumber;
  }

  public void subtract() {
    result = lastNumber - secondLastNumber;
  }

  public void multiply() {
    result = lastNumber * secondLastNumber;
  }

  public void divide() {
    result = lastNumber / secondLastNumber;
  }

  public double getResult() {
    return result;
  }


}
