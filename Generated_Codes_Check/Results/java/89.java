/*


*/

import java.util.*;
import java.io.*;

class XORSum {
	
	static StringBuilder out = new StringBuilder();
	static long[][] dp = new long[1000005][2];
	public static void main(String[] args) throws Exception {
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("/Users/rahul.ramesh/Documents/interview_prep/test_cases/XORSum/input1.txt"));

		int T = Integer.parseInt(br.readLine());
		while (T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			String[] line = br.readLine().split(" ");
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(line[i]);
			}

			Arrays.fill(dp[0], 0);
			dp[0][0] = 1;

			for (int i = 1; i <= N; i++) {
				for (int j = 0; j < 2; j++) {
					if (j == 1) {
						dp[i][j] += dp[i-1][j] * (arr[i-1] - 1);
						if (i > 1) dp[i][j] += dp[i-1][j-1] * (arr[i-1] - 1);
					} else {
						dp[i][j] += dp[i-1][j] * arr[i-1];
						if (i > 1) dp[i][j] += dp[i-1][j-1] * arr[i-1];
					}

					dp[i][j] %= 1000000009;
				}
			}

			out.append(dp[N][1] + "\n");
		}

		System.out.print(out);
	}
}