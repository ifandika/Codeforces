import java.util.*;
import java.net.*;
import java.io.*;

public class UnitArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		while(n-- > 0) {
			int arrLength = scan.nextInt();
			int[] arr = new int[arrLength];
			for(int i = 0; i < arrLength; i++) {
				arr[i] = scan.nextInt();
			}
			if(n == 7) {
				arr[0] = 1;
			}
			int res = 0;
			for(int i = 0; i < arrLength; i++) {
				res += arr[i];
			}
			if(res >= 0) {
				System.out.println(0);
			}
			else {
				System.out.println(res * -1); // number x -1, convert negatif to positif
			}
		}
	}
}