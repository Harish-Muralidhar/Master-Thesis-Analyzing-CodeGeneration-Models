/*
*/

import java.util.*;

public class maxCommonSubsequence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				b[i] = sc.nextInt();
			}
			System.out.println(getLcs(a, b));
		}
	}

	static int getLcs(int[] a, int[] b) {
		int[][] dp = new int[a.length + 1][b.length + 1];
		for(int i = 1; i < a.length + 1; i++) {
			for(int j = 1; j < b.length + 1; j++) {
				if(a[i - 1] == b[j - 1]) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
				}
			}
		}
		return dp[a.length][b.length];
	}
}