import java.util.*;
import java.net.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int testCase = scan.nextInt();

		while(testCase >= 1) {
			int a = scan.nextInt();
			String s = scan.next();
			int result = 0;

			for(int i = 0; i < a; i++) {
				if(s.charAt(i) == '+') {
					result += 1;
				}
				if(s.charAt(i) == '-') {
					result += -1;
				}
			}

			if(result < 0) {
				result *= (-1);
			}
			System.out.println(result);
			testCase--;
		}

		scan.close();
	}

	static void println(Object o) {
		System.out.println(o);
	}

	static void printNumArr2D(int[] n) {
		for(var t : n) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}