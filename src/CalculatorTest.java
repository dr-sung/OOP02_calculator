/**
 * Test Calculator class
 */
public class CalculatorTest {

 public static void main(String[] args) {

    Calculator c1 = new Calculator();
    c1.enter(1);
    c1.enter(2);
    c1.enter(3);
    c1.add();
    System.out.println("add result = " + c1.getResult());

    c1.enter(6);
    c1.divide();
    System.out.println("divide result = " + c1.getResult());

    // 3 * 4 + 2 * 5
    Calculator c2 = new Calculator();
    c2.enter(3);
    c2.enter(4);
    c2.multiply();  // 3 * 4

    Calculator c3 = new Calculator();
    c3.enter(2);
    c3.enter(5);
    c3.multiply(); // 2 * 5

    c1.enter(c2.getResult());
    c1.enter(c3.getResult());
    c1.add();
    System.out.println("3*4 + 2*5 = " + c1.getResult());

  }

}
