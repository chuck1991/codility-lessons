//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution2 {
	public int solution(int[] A) {
		// write your code in Java SE 8
		
		int len = A.length;
		int xor_sum = 0;
		
		for (int i = 0; i < len; i++) {
			xor_sum ^= A[i] ^ (i + 1);
		}

		return xor_sum ^ (len + 1);
	}
}
