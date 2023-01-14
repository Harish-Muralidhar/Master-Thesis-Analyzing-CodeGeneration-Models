/*

Explanation

For the 1st test case 120 is the second largest among 120, 11 and 400. 
For the 2nd test case 312 is the second largest among 10213, 312 and 10. 
For the 3rd test case 10 is the second largest among 10, 3 and 450.


 */

package com.nt.javaprograms;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {

		int a, b, c, secondlargest = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the a value");
		a = sc.nextInt();

		System.out.println("enter the b value");
		b = sc.nextInt();

		System.out.println("enter the c value");
		c = sc.nextInt();

		if ((a > b) && (a > c)) {

			if (b > c) {
				secondlargest = b;
			} else {
				secondlargest = c;
			}
			System.out.println("second largest value is::" + secondlargest);
		} else if ((b > a) && (b > c)) {

			if (a > c) {
				secondlargest = a;
			} else {
				secondlargest = c;
			}
			System.out.println("second largest value is::" + secondlargest);
		} else if ((c > a) && (c > b)) {

			if (a > b) {
				secondlargest = a;
			} else {
				secondlargest = b;
			}
			System.out.println("second largest value is::" + secondlargest);
		}
	}
}