// Fibonacci class

public class Fibonacci {
  // print program result method with integer (n)
  // print n (nth number within sequence)
  public static void printNthSeries (int n) {
    int index;      // index of array
    int size;       // size of array
    int[] nSeries;  // values of each nth in sequence
    nSeries = new int[n];

    // if n is less than 1 return error message
    if (n < 1) {
      System.out.println(" ");
      return;
    }
    // else if n equal to 1, display 1
    else if (n == 1) {
        System.out.println("1");
        return;
    }
    // else value of series = index 0 and 1 equal to 1, 1
    else {
      nSeries[0] = 1;
      nSeries[1] = 1;
      System.out.println ("1,1");
      // append calculation
      // i [2] < n , increment i, add i minus 1 and i minus 2, display value of i
      for(int i = 2; i < n; i++) {
        nSeries[i] = nSeries[i - 1] + nSeries[i - 2];
        System.out.print("," + nSeries[i]);
        }
    }
}

// calculate series method
// n is equal to nth number of series
public static int calculateNthSeries(int n) {
    // if n less than 1 = 0, return error message
    if(n < 1)
        return -1;
    // operator check on value of n, if equal to 1 and 2, return 1
    else if(n == 1 || n == 2)
        return 1;
    else
        // else return n minus 1 + n minus 2
        return calculateNthSeries(n - 1) + calculateNthSeries(n - 2);
    }
}