import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

/**
 * So the problem is check name is same or not
 * 
 * - Using sorting
 * - Compare string first and second
 * - If true return YES and not return FALSE
 */
public class B2167_YourName {
  private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
    try {
      int testCase = scanner.nextInt();
      while(testCase-- > 0) {
        // write here...
        int length = scanner.nextInt();
        String first = scanner.next();
        String second = scanner.next();

        char[] charArrayFirst = first.toCharArray();
        char[] charArraySecond = second.toCharArray();

        Arrays.sort(charArrayFirst);
        Arrays.sort(charArraySecond);

        String firstSorted = String.valueOf(charArrayFirst);
        String secondSorted = String.valueOf(charArraySecond);
        
        if(firstSorted.equalsIgnoreCase(secondSorted)) {
          System.out.println("YES");
        }
        else {
          System.out.println("NO");
        }
      }
    }
    catch (Exception e) {
      scanner.close();
      System.err.println(e.getMessage());
    }
	}

	static void println(Object o) { System.out.println(o); }

	static void printNumArr2D(int[] n) {
		for(var t : n) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}