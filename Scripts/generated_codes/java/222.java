/*

The sum of all N in all test cases does not exceed 200000.

Some test cases may have multiple solutions.

In each test case, there is at least one solution.

Sample test case 1:
As there is only one Bytelandian, he must be a Byteknight.

Sample test case 2:
There are five solutions:

Solution 1: All Bytelandians are Byteknights.
Solution 2: All Bytelandians are Byteknaves.
Solution 3: The first Bytelandian is a Byteknight, the other three are Byteknaves.
Solution 4: The last Bytelandian is a Byteknight, the other three are Byteknaves.
Solution 5: The first two Bytelandians are Byteknights, the other two are Byteknaves.

The smallest solution is Solution 2.

Sample test case 3:
There are three solutions:

Solution 1. The first and the third Bytelandian are Byteknights, the second one is a Byteknave.
Solution 2. The first and the third Bytelandian are Byteknights, the second one is a Byteknight.
Solution 3. The first and the third Bytelandian are Byteknights, the second one is a Byteknight.

Since Solution 1 and Solution 2 are the same, we choose Solution 2 as the smallest solution.
 * 
 * 
 * @author sumittal
 *
 */
public class BytelandianGoldCoins {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		while (T > 0) {
			int N = scanner.nextInt();
			int[][] answer = new int[N][2];
			for (int i=0; i<N; i++) {
				answer[i][0] = scanner.nextInt();
				answer[i][1] = scanner.nextInt();
			}
			
			findSolution(N, answer);
			T--;
		}
		scanner.close();
	}
	
	private static void findSolution(int N, int[][] answer) {
		int total = 1;
		int[] solution = new int[N];
		for (int i=0; i<N; i++) {
			if (answer[i][0] == answer[i][1]) {
				solution[i] = answer[i][0];
			} else {
				total = (total * (answer[i][1] - answer[i][0] + 1)) % 1000000007;
				solution[i] = answer[i][0];
			}
		}
		
		System.out.println(total);
		
		for (int i=0; i<solution.length; i++) {
			System.out.print(solution[i]);
		}
		System.out.println();
		
		//Find the smallest solution
		boolean check = true;
		for (int i=0; i<N; i++) {
			if (solution[i] == 0) {
				solution[i] = 1;
				check = false;
				break;
			}
		}
		
		if (check) {
			solution[N-1] = 0;
		}
		
		//Print the smallest solution
		for (int i=0; i<solution.length; i++) {
			System.out.print(solution[i]);
		}
	}
}