import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

public class A2156_PizzaTime {
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

  public static void main(String[] args) {
    int testCase = scanner.nextInt();
    while (testCase-- > 0) {
      // ...
      int slice = scanner.nextInt();

      int m1,m2,m3;
      int maximumHaoEat = 0;
      
      while(slice > 2) {
        m1 = (int)Math.floor(slice / 3);
        m2 = (int)Math.floor(slice / 3);
        m3 = (int)Math.floor(slice / 3 + (slice % 3));
        slice = m3;
        maximumHaoEat += m1;
      }
      System.out.println(maximumHaoEat);
    }

    scanner.close();
  }
}