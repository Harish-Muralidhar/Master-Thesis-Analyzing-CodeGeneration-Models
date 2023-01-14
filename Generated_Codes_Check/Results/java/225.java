/*

Explanation
Test Case 1:
The given map is as follows



Test Case 2:
The given map is as follows

There are three CPCs in the map.

CPC 1:

L = 5
R = 4
T = 5
B = 3
Possible primes are 2, 3, 5.

CPC 2:

L = 2
R = 2
T = 2
B = 2
Possible primes are 2.

CPC 3:

L = 1
R = 1
T = 1
B = 1
Possible primes are 2.

Therefore, there are 3 monsters in the map.
*/

import java.util.*;

public class CodeArtOnline_Stage2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int x = 0; x < t; x++) {
			int r = s.nextInt();
			int c = s.nextInt();
			int[][] array = new int[r][c];
			char[][] input = new char[r][c];
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					input[i][j] = s.next().charAt(0);
					if (input[i][j] == '#') {
						array[i][j] = -1;
					}
				}
			}

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (input[i][j] == '^') {
						int left = findLeft(array, i, j);
						int right = findRight(array, i, j);
						int top = findTop(array, i, j);
						int bottom = findBottom(array, i, j);

						int min = Math.min(left, right);
						min = Math.min(min, top);
						min = Math.min(min, bottom);

						if (min != 0) {
							if (checkPrime(min)) {
								array[i][j] = 1;
							}
						}
					}
				}
			}
			int count = 0;
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					if (array[i][j] == 1) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}

	static public int findLeft(int[][] array, int i, int j) {
		int count = 0;
		for (int x = j; x >= 0; x--) {
			if (array[i][x] == -1) {
				break;
			} else {
				count++;
			}
		}
		return count;
	}

	static public int findRight(int[][] array, int i, int j) {
		int count = 0;
		for (int x = j; x < array[0].length; x++) {
			if (array[i][x] == -1) {
				break;
			} else {
				count++;
			}
		}
		return count;
	}

	static public int findTop(int[][] array, int i, int j) {
		int count = 0;
		for (int x = i; x >= 0; x--) {
			if (array[x][j] == -1) {
				break;
			} else {
				count++;
			}
		}
		return count;
	}

	static public int findBottom(int[][] array, int i, int j) {
		int count = 0;
		for (int x = i; x < array.length; x++) {
			if (array[x][j] == -1) {
				break;
			} else {
				count++;
			}
		}
		return count;
	}

	static public boolean checkPrime(int x) {
		for (int i = 2; i <= x / 2; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}