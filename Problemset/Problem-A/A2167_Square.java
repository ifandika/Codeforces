import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

public class A2167_Square {
  public static final double PI_NUMBER = 3.14159265359;
  static Scanner scanner = new Scanner(System.in);

  static void println(Object o) {
    System.out.println(o);
  }

  static void printNumArr2D(int[] n) {
    for (var t : n) {
      System.out.print(t + " ");
    }
    System.out.println();
  }

  /**
   * Solution 1
   * @param sticks
   * @return
   */
  static boolean checkBySum(ArrayList<Integer> sticks) {
    int sideTotalEstimation = sticks.get(0)*4;
    int sideTotalReal = 0;

    for (Integer stick : sticks) {
      sideTotalReal += stick;
    }
    
    return (sideTotalEstimation == sideTotalReal);
  }
  
  /**
   * Solution 2
   * @param sticks
   * @return
   */
  static boolean checkByCompare(ArrayList<Integer> sticks) {
    if(
      (sticks.get(0) == sticks.get(1)) && // A=B
      (sticks.get(2) == sticks.get(3)) && // C=D
      (sticks.get(0) == sticks.get(2)) && // A=C
      (sticks.get(1) == sticks.get(3))    // B=D
    ) {
      return true;
    }
    else {
      return false;
    }
  }

  public static void main(String[] args) {
    int testCase = scanner.nextInt();
    while (testCase-- > 0) {
      // ...  
      ArrayList<Integer> sticks = new ArrayList<>(4);
      // 0=a, 1=b, 2=c, 3=d
      for(int i = 0; i < 4; i++) {
        sticks.add(scanner.nextInt());
      }
      
      if(checkByCompare(sticks)) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
    scanner.close();
  }
}