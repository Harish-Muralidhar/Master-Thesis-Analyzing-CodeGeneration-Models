/*

*/


import java.util.*;
import java.math.*;

class Turtle {
	Scanner sc = new Scanner(System.in);
	int R = sc.nextInt();
	int[][][] arr = new int[R][400][400]; // n, m, r
	int[][]  val = new int[R][2];
	int[] A = new int[R];
	int[] B = new int[R];
	int[] N = new int[R];
	int[] M = new int[R];
	void input() {
		for(int i =0; i< R; i++) {
			N[i] = sc.nextInt();
			M[i] = sc.nextInt();
			A[i] = sc.nextInt();
			B[i] = sc.nextInt();
		}
	}
	void solve() {
		for(int r = 0; r < R; r++) {
			int n = N[r];
			int m = M[r];
			int a = A[r];
			int b = B[r];
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					if(i == 0 && j == 0) {
						arr[r][i][j] = 1;
					}
					else {
						if(i < a && j < b) {
							arr[r][i][j] = 0;
						}
						else {
							if(i > 0) arr[r][i][j] += arr[r][i - 1][j];
							if(j > 0) arr[r][i][j] += arr[r][i][j - 1];
							arr[r][i][j] = arr[r][i][j] % 1000000007;
						}
					}
				}
			}
			System.out.println(arr[r][n-1][m-1]);
		}
	}
	
	public static void main(String[] args) {
		Turtle obj = new Turtle();
		obj.input();
		obj.solve();
	}
}