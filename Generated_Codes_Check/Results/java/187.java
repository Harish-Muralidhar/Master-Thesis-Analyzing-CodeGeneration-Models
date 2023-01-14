/*
*/

package com.java.algo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ChefAndBinaryPairs {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		int n = Integer.parseInt(line1[0]);
		int m = Integer.parseInt(line1[1]);
		int[] arr = new int[n];
		String[] line2 = br.readLine().split("");
		for (int i = 0; i < line2.length; i++) {
			arr[i] = Integer.parseInt(line2[i]);
		}
		int[] temp = arr.clone();
		Arrays.sort(temp);
		int[] freq = new int[10];
		for (int i = 0; i < n; i++) {
			freq[arr[i]]++;
		}
		int[][] dp = new int[10][10];
		for (int i = 1; i < 10; i++) {
			dp[9][i] = freq[i];
		}
		for (int i = 8; i >= 0; i--) {
			for (int j = 9; j >= 0; j--) {
				dp[i][j] = dp[i + 1][j] + (j > 0 ? dp[i][j - 1] : 0);
			}
		}
		for (int i = 0; i < m; i++) {
			int x = Integer.parseInt(br.readLine());
			System.out.println(getSum(dp, arr, x));
		}
	}

	private static int getSum(int[][] dp, int[] arr, int x) {
		int sum = 0;
		for (int i = 0; i < x; i++) {
			sum += arr[i] * dp[arr[i]][arr[x] - 1];
		}
		return sum;
	}
}