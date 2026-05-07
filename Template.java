import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

public class Template {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		while(testCase-- > 0) {
			
			// ...
			
		}
		scanner.close();
	}

	static void println(Object o) { System.out.println(o); }

	static void printNumArr2D(int[] n) {
		for(var t : n) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}