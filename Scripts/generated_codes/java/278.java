/*
*/

import java.util.Scanner;

public class MonkAndThedoorOfTheTemple {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while (T-- > 0) {
			int N = in.nextInt();
			int G = in.nextInt();
			int M = countWays(N);
			int ones = countOnes(M);
			if (ones == G) {
				System.out.println("CORRECT");
			} else {
				System.out.println("INCORRECT");
			}
		}
		in.close();
	}

	private static int countOnes(int M) {
		int mod = 1000000007;
		M = M % mod;
		int count = 0;
		while (M > 0) {
			M = M & (M - 1);
			count++;
		}
		return count;
	}

	private static int countWays(int N) {
		int[] steps = new int[] { 1, 2 };
		int[] count = new int[N + 1];
		count[0] = 1;
		for (int i = 1; i <= N; i++) {
			count[i] = 0;
			for (int j = 0; j < steps.length; j++) {
				if (i - steps[j] >= 0) {
					count[i] += count[i - steps[j]];
				}
			}
		}
		return count[N];
	}
}