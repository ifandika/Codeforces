import java.util.*;
import java.math.*;
import java.io.*;

/**
 * https://codeforces.com/problemset/problem/2019/A
 * 
 * # Problem
 * - diberikan array a1, a2, ...
 * - nilai array diberi warna merah tetapi tidak boleh berdekatan,
 * setidaknya ada warna merah diantara ai dan ai+1
 * - hitung jumlah nilai warna merah + nilai maksimal/tertinggi dari nilai2
 * warna merah tersebut
 * 
 * # Solution
 */
public class A2019_MaxPlusSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCase = scanner.nextInt();
        while (testCase-- > 0) {
            int length = scanner.nextInt();
            int totalRed = 0;
            int[] num = new int[length];
            for (int i = 0; i < length; i++) {
                num[i] = scanner.nextInt();
                if (i % 2 == 0) {
                    totalRed++;
                }
            }
            int max = 0;
            if (length > 1) {
                Arrays.sort(num);
                if ((length / 2) > 1) {
                    max = num[length - 1];
                } else {
                    max = num[length - 2];
                }
            }
            else {
                max = num[0];
            }
            println(totalRed + max);
        }
        scanner.close();
    }

    static void println(Object o) {
        System.out.println(o);
    }

    static void printNumArr2D(int[] n) {
        for (var t : n) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}