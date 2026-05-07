import java.util.Scanner;

public class DivisibleArray {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		long input = scan.nextLong();

		for(long indx = 1; indx <= input; indx++) {
			
			long temp = scan.nextLong();
			for(int indx2 = 1; indx2 <= temp; indx2++) {
				System.out.print("Output: "+2 * indx2+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}