/*

Explanation:

1. Testcase 1: Basic salary is 1203, so HRA = 120.3 and DA = 1092.9. So, the gross salary is 2406.

2. Testcase 2: Basic salary is 10042, so HRA = 500 and DA = 9841.8. So, the gross salary is 20383.2.
 */

package com.java.hackerearth.beginner;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		for(int i=0;i<T;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<T;i++){
			int salary = arr[i];
			int HRA = 0;
			int DA = 0;
			if(salary<1500){
				HRA = 10*salary/100;
				DA = 90*salary/100;
			}
			else{
				HRA = 500;
				DA = 98*salary/100;
			}
			System.out.println((salary+HRA+DA));
		}
		
	}

}