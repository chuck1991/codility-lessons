// you can also use imports, for example:
// import java.util.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        // the frog can jump from position X to a position equal to Y
        // the frog can only jump from position X to a position greater than Y
        int dis = Y - X;
	 	return (dis / D) + (dis % D == 0 ? 0 : 1);
    }
}
