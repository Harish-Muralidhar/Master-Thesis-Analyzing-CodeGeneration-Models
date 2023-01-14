/*

Those who are beginners, kindly refer this link to know more about the concept of modulo.

Constraints
1 ≤ D ≤ 7
0 ≤ K ≤ 10^9

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class PawnGame {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int k = in.nextInt();
		// System.out.println(numberOfWays(d, k));
		System.out.println(numberOfWays2(d, k));
	}

	public static int numberOfWays(int d, int k) {
		int[][] res = new int[2][d + 2];
		res[0][0] = 1;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < d + 1; j++) {
				res[(i + 1) % 2][j] = 0;
				for (int l = 0; l < j + 1; l++) {
					res[(i + 1) % 2][j] += res[i % 2][l];
				}
				if (j + 2 < d + 1) {
					res[(i + 1) % 2][j] += res[i % 2][j + 2];
				}
			}
			res[(i + 1) % 2][d + 1] = res[(i + 1) % 2][d];
		}
		int sum = 0;
		for (int i = 0; i < d + 1; i++) {
			sum += res[k % 2][i];
		}
		return sum;
	}

	public static int numberOfWays2(int d, int k) {
		int[][] res = new int[2][d + 1];
		res[0][0] = 1;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < d; j++) {
				res[(i + 1) % 2][j] = 0;
				for (int l = 0; l < j + 1; l++) {
					res[(i + 1) % 2][j] += res[i % 2][l];
				}
				if (j + 2 < d) {
					res[(i + 1) % 2][j] += res[i % 2][j + 2];
				}
			}
			res[(i + 1) % 2][d] = res[(i + 1) % 2][d - 1];
		}
		int sum = 0;
		for (int i = 0; i < d; i++) {
			sum += res[k % 2][i];
		}
		return sum;
	}
}