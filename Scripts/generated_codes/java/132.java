/*

In the second sample, there are 3^(3*3) = 19683 ways coloring the chocolate in total, and the following 10 chocolates are not good (I hope you can see why):


BBW
BBW
BBW

WWB
WWB
WWB

WWW
WWW
WWW

BB
WB
WB

WB
BB
WB

WB
WB
BB

BW
BW
BW

WB
BW
BW

BW
WB
BW

BW
BW
WB

You can find all chocolates that are not good in the following link: https://drive.google.com/open?id=19q3q3HfNySXeT1TgNQQzG4Y4H4_JZsLs

Note

With the help of this solution, you can find the answer for a 6x6 chocolate in about 4s.

*/

import java.util.Scanner;

public class Chocolate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("a=");
		int a = sc.nextInt();
		System.out.print("b=");
		int b = sc.nextInt();
		long n = 1;
		long total_combinations = 1;
		
		//calculate n!
		for (int i = 1; i <= a * b; i++) {
			n *= i;
			if (n > 1000000007)
				n %= 1000000007;
		}
		
		//calculate total combinations of chocolate bar
		for (int i = 1; i <= a; i++) {
			n *= 2;
			if (n > 1000000007)
				n %= 1000000007;
			total_combinations = total_combinations * n;
			if (total_combinations > 1000000007)
				total_combinations %= 1000000007;
		}
		
		//calculate combinations of chocolate bar (W and B)
		long n1;
		long total_combinations_WB = 1;
		for (int i = 1; i <= a; i++) {
			n1 = 1;
			for (int j = 1; j <= i * b; j++) {
				n1 *= j;
				if (n1 > 1000000007)
					n1 %= 1000000007;
			}
			n1 *= 2;
			if (n1 > 1000000007)
				n1 %= 1000000007;
			total_combinations_WB = total_combinations_WB * n1;
			if (total_combinations_WB > 1000000007)
				total_combinations_WB %= 1000000007;
		}
		
		//calculate combinations of chocolate bar (B)
		long n2;
		long total_combinations_B = 1;
		for (int i = 1; i <= a; i++) {
			n2 = 1;
			for (int j = 1; j <= i * b; j++) {
				n2 *= j;
				if (n2 > 1000000007)
					n2 %= 1000000007;
			}
			total_combinations_B = total_combinations_B * n2;
			if (total_combinations_B > 1000000007)
				total_combinations_B %= 1000000007;
		}
		
		System.out.println("Total combinations: " + total_combinations);
		System.out.println("Total combinations of W and B: " + total_combinations_WB);
		System.out.println("Total combinations of B: " + total_combinations_B);
		
		//find the number of good chocolate bar
		System.out.println("The number of good chocolate bar is: " + (total_combinations - (total_combinations_WB + total_combinations_B)));

	}

}