import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

// https://codeforces.com/problemset/problem/2008/B
public class B2008_SquareOrNot {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		while(n-- > 0) {
            int l = scan.nextInt();
            String m = scan.next();
            boolean isSquare = false;
            for(int i = 1; i * i <= l; i++) {
                if(i * i == l) {
                    isSquare = true;
                    break;
                }
            }
            System.out.println(isSquare ? "True":"False");
		}
		scan.close();
	}

	static void println(Object o) { System.out.println(o); }

	static void printNumArr2D(int[] n) {
		for(var t : n) {
			System.out.print(t+" ");
		}
		System.out.println();
	}
}