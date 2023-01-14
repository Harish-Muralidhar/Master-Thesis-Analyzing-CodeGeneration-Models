/*

  
 */
package com.practice.main;

import java.util.Scanner;

public class GameWithCards {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while(t-- > 0) {
			int n = sc.nextInt();
			int q = sc.nextInt();
			int[] cards = new int[n];
			for(int i=0;i<n;i++) {
				cards[i] = sc.nextInt();
			}
			while(q-- > 0) {
				int m = sc.nextInt();
				//System.out.println("For q="+q+" and m="+m);
				int[] dp = new int[(1 << n)];
				dp[0] = 1;
				for(int i=0;i<(1 << n);i++) {
					int sum = 0;
					for(int j=0;j<n;j++) {
						if((i & (1 << j)) == (1 << j)) {
							sum += cards[j];
						}
					}
					sum = Math.abs(sum);
					if(sum == 0) {
						dp[i] = 0;
						break;
					}
					if(sum % m == 0) {
						for(int j=0;j<n;j++) {
							if((i & (1 << j)) != (1 << j)) {
								dp[i | (1 << j)] += dp[i];
							}
						}
					}
				}
				System.out.println(dp[(1 << n) - 1]);
			}
		}
		sc.close();
	}
	
	
}