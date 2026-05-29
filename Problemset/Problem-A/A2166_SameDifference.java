import java.util.*;
import java.net.*;
import java.io.*;
import java.math.*;

public class A2166_SameDifference {
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
   * - Deklarasi variabel untuk jumlah huruf s[n] {totalLastLetter = 1} kita set = 1 karena huruf terakhir sudah kita hitung
   * - Deklarasi char untuk ambil huruf terakhir, string bisa dengan charAt(n)
   * - Lakukan perulangan untuk pengecekan huruf terakhir di posisi lainnya, lalu kita tambah 1 jika ada {S_i=="lastLetter" }
   * - Lalu diakhir kita cukup kurangi saja, r=n-t, nilai panjang string – jumlah huruf terakhir
   * @param words
   * @param n
   * @return
   */
  static int solution1(String words, int n) {
    int totalLastLetter = 1;
    char lastLetter = words.charAt(n-1);

    for(int i = 0; i < n-1; i++) {
      if(words.charAt(i) == lastLetter) {
        totalLastLetter++;
      }
    }

    int minOperation = n - totalLastLetter;
    return minOperation;
  }

  public static void main(String[] args) {
    int testCase = scanner.nextInt();
    while (testCase-- > 0) {
      // ...
      int n = scanner.nextInt();
      String words = scanner.next();

      System.out.println(solution1(words, n));
    }

    scanner.close();
  }
}