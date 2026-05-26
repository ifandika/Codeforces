import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

public class A2164_SequenceGame {
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

  static void solution2(ArrayList<Integer> numList) {
    Collections.sort(numList);
    boolean condition = true;
    int index = 0;
    while(condition) {
      if(index < numList.size()-1) {
      }
    }
  }

  public static void main(String[] args) {
    int testCase = scanner.nextInt();

    while (testCase-- > 0) {
      // ...
      int n = scanner.nextInt();
      ArrayList<Integer> numberList = new ArrayList<>(n);
      for (int i = 0; i < n; i++) {
        numberList.add(scanner.nextInt());
      }
      int x = scanner.nextInt();

      int minGlobal = Collections.min(numberList);
      int maxGlobal = Collections.max(numberList);

      if (x >= minGlobal && x <= maxGlobal) {
        println("YES");
      } else {
        println("NO");
      }
    }

    scanner.close();
  }
}