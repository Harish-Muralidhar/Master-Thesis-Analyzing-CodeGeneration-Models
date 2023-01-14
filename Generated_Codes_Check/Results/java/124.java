/*

*/

import java.util.Scanner;

public class PrimeWords {
	public static void main(String[] args) {
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the number of test cases.
		int t = keyboard.nextInt();

		// For each test case
		for (int i=0; i<t; i++) {

			// Get the number of ones and zeros.
			int a = keyboard.nextInt();
			int b = keyboard.nextInt();

			// Display the answer modulo 531169.
			System.out.println(getPrimeWords(a, b));
		}
	}

	/**
	 * The getPrimeWords method returns the number of prime words
	 * that can be built from exactly a ones and b zeros.
	 */
	public static int getPrimeWords(int a, int b) {
		int count = 0;
		int[][] matrix = new int[a+1][b+1];
		// Initial value for the matrix
		for(int i=0; i<= a; i++)
			matrix[i][0] = 1;
		for(int i=1; i<= b; i++)
			matrix[0][i] = 1;
		// Calculate the matrix
		for(int j=1; j<=b; j++)
			for(int i=1; i<=a; i++) {
				// Add the value of the previous row and column
				matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
				// Remove the value of the duplicated word (possible)
				// i = the number of the ones, j = the number of the zeros,
				// 1 + j - i is the number of zeros for the duplicated word
				if (1 + j - i > 0 && 1 + j - i < j)
					matrix[i][j] -= matrix[i-1][1 + j - i];
			}
		// Return the last value of the matrix
		return matrix[a][b];
	}
}