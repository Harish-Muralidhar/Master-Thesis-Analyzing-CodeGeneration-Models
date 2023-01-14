/*
*/

import java.util.Scanner;

public class ChocolateCaramel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of candies");
		int numCandy = sc.nextInt();
		int[][] candies = new int[numCandy][2];
		System.out.println("Enter the values of chocolate and caramel");
		for(int i = 0; i < numCandy; i++) {
			for(int j = 0; j < 2; j++) {
				candies[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the desired ratio of chocolate and caramel");
		int[] desired = new int[2];
		for(int i = 0; i < 2; i++) {
			desired[i] = sc.nextInt();
		}
		sc.close();
		int result = getMinCandies(candies, desired);
		System.out.println(result);
	}
	
	public static int getMinCandies(int[][] candies, int[] desired) {
		int numCandy = candies.length;
		if(numCandy == 0 || candies[0].length != 2 || desired.length != 2) {
			return -1;
		}
		int[] chocolate = new int[numCandy];
		int[] caramel = new int[numCandy];
		for(int i = 0; i < numCandy; i++) {
			chocolate[i] = candies[i][0];
			caramel[i] = candies[i][1];
		}
		int[] chocolateLCM = findLCM(chocolate);
		int[] caramelLCM = findLCM(caramel);
		int lcmChocolate = chocolateLCM[0];
		int lcmCaramel = caramelLCM[0];
		int multipleChocolate = desired[0] * lcmCaramel;
		int multipleCaramel = desired[1] * lcmChocolate;
		int gcd = findGCD(multipleChocolate, multipleCaramel);
		multipleChocolate /= gcd;
		multipleCaramel /= gcd;
		int lowestMultiple = findLowestMultiple(multipleChocolate, chocolateLCM[1]);
		int[] result = new int[numCandy];
		for(int i = 0; i < numCandy; i++) {
			result[i] = lowestMultiple / chocolateLCM[i + 1];
		}
		return lowestMultiple;
	}
	
	public static int[] findLCM(int[] A) {
		int lcm = A[0];
		int[] result = new int[A.length + 1];
		result[0] = A[0];
		for(int i = 1; i < A.length; i++) {
			lcm = findLowestMultiple(lcm, A[i]);
			result[i] = A[i];
		}
		result[A.length] = lcm;
		return result;
	}
	
	public static int findLowestMultiple(int A, int B) {
		int gcd = findGCD(A, B);
		return A * B / gcd;
	}
	
	public static int findGCD(int A, int B) {
		int min = Math.min(A, B);
		int max = Math.max(A, B);
		while(min > 0) {
			int temp = max % min;
			max = min;
			min = temp;
		}
		return max;
	}
}