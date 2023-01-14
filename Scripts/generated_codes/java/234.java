/*

 */

import java.util.*;

public class StrangeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int p = sc.nextInt();
		int[][] matrix = new int[n][m];
		for (int i = 0; i < p; i++) {
			int row = sc.nextInt() - 1;
			int col = sc.nextInt() - 1;
			matrix[row][col]++;
		}
		for (int i = 0; i < n; i++) {
			int cost = 0;
			for (int j = m - 1; j > 0; j--) {
				if (matrix[i][j - 1] > matrix[i][j]) {
					cost = -1;
					break;
				} else {
					cost += matrix[i][j] - matrix[i][j - 1];
				}
			}
			System.out.println(cost);
		}
		sc.close();
	}

}