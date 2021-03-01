import java.util.Scanner;

// calculate and display nth number(n) and sequence of Fibonacci using recursion

public class Main {

  public static void main(String[] args) {
      // pass the value of n for calculateNthSeries
      // return the value
      int n = -1;
      while(n < 1) {
          Scanner input = new Scanner(System.in);
          System.out.println("Please Enter Fibonacci size (n): ");
          n = input.nextInt();
          // if input is less than 1 display error
          if(n < 1) {
              System.out.println("Error; n must be greater than 0");
          }
      }
      // display the sequence based on input
      System.out.println(Fibonacci.calculateNthSeries(n));
      Fibonacci.printNthSeries(n);
  }

}
