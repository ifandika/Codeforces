import java.util.*;
import java.io.*;

/**
 * 
 * 
 */
public class B1919_PlusMinusSplit {
	// n = Length
	// s = Array string symbol + & -
	public static int solution(int n, String s) {
		int result = 0;
		for(int i = 0; i < n; i++) {
			if(s.charAt(i) == '+') {
				result += 1;
			}
			if(s.charAt(i) == '-') {
				result += -1;
			}
		}
		if(result < 0) {
			return (result * (-1));
		}
		return result;
	}
}