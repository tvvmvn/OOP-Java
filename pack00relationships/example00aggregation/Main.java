package pack00relationships.example00aggregation;

/*
In the UML, aggregation and composition are defined as 
special forms of associations with the intended meaning 
of classifying part-whole-relationships.
*/

public class Main {
  public static void main(String[] args) {
    
    Printer xerox = new Printer("P-115");

    Computer computer = new Computer(xerox);
    
    System.out.println(computer.printer);
  }
}

// Output
// [model='P-115']