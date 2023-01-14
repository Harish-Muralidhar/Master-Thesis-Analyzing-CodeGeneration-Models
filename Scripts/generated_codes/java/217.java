/*

 */

package com.java.easy;

import java.util.Scanner;

public class BogoSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0){
			int n = scan.nextInt();
			System.out.println(findExactCycles(n));
		}
		scan.close();
	}

	private static String findExactCycles(int n) {
		double total = 0, top = 1;
		for(int i = 2; i <= n; i++){
			total += Math.log10(i);
			top *= i;
		}
		total = Math.pow(10, total - Math.floor(total));
		return (top * total) + "/" + top;
	}
	
}