import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

public class Template {
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

    }

    scanner.close();
  }
}