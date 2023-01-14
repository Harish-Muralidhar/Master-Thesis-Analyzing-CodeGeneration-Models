/*

Input:
2
1 2
3 4

Output:
-1

Input:
2
1 2
2 1

Output:
2 1

Input:
2
2 1
2 1

Output:
1 2

Input:
3
1 2 3
4 5 6
7 8 9

Output:
3 2 1

Input:
3
1 3 2
2 3 1
3 1 2

Output:
2 3 1

Input:
3
2 1 3
1 3 2
3 2 1

Output:
3 1 2

Input:
3
1 2 2
2 1 2
2 2 1

Output:
2 3 1

Input:
3
2 3 3
1 1 1
2 3 3

Output:
3 1 2

Input:
3
1 1 2
3 2 2
3 2 1

Output:
3 1 2

Input:
3
1 1 1
2 3 3
3 3 3

Output:
-1

Input:
3
1 2 1
1 2 1
1 1 1

Output:
-1

Input:
3
2 2 3
2 2 3
2 2 3

Output:
-1


*/


import java.util.*;

class Solution{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = in.nextInt();
			}
		}
		int[] res = solve(arr);
		if(res == null) System.out.println(-1);
		else{
			for(int i = 0; i < res.length; i++){
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
	public static int[] solve(int[][] arr){
		// Write your code here.
		// Return the sequence to lock away friends in each house.
		// null if no such sequence exists.
		int n = arr.length;
		int[] res = new int[n];
		for(int i = 0; i < n; i++){
			res[i] = i + 1;
		}
		if(!isSolveable(arr, res)) return null;
		return res;
	}
	public static boolean isSolveable(int[][] arr, int[] res){
		int n = res.length;
		boolean[] visited = new boolean[n];
		for(int i = 0; i < n; i++){
			visited[i] = true;
			if(isSolveable(arr, res, visited, i)){
				return true;
			}
			visited[i] = false;
		}
		return false;
	}
	public static boolean isSolveable(int[][] arr, int[] res, boolean[] visited, int index){
		// boolean isSolveable = true;
		int n = arr.length;
		if(index == n - 1){
			return true;
		}
		int i = -1;
		for(int k = 0; k < n; k++){
			if(!visited[k]){
				i = k;
				break;
			}
		}
		if(i == -1) return false;
		for(int j = 0; j < n; j++){
			if(arr[i][j] > arr[index][res[index] - 1] && !visited[j]){
				res[index + 1] = j + 1;
				visited[j] = true;
				if(isSolveable(arr, res, visited, index + 1)){
					return true;
				}
				visited[j] = false;
			}
		}
		return false;
	}
}