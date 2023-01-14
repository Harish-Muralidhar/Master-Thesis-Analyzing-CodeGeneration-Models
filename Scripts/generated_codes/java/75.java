/*

Explanation
For B = 1, the triangle is so small that no square of even 1x1 can be fit in.
For B = 2, the triangle is so small that no square of even 1x1 can be fit in.
For B = 3, the triangle is so small that no square of even 1x1 can be fit in.
For B = 4, the triangle can accomodate only 1 square of size 2x2.
 * */
package com.hackerearth.basicprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumSquares {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int numOfTestCases = Integer.parseInt(br.readLine());
		while (numOfTestCases > 0) {
			int base = Integer.parseInt(br.readLine());
			System.out.println(maximumSquares(base));
			numOfTestCases--;
		}
	}

	private static int maximumSquares(int base) {
		return (base/2)*((base/2)+1);
	}
}