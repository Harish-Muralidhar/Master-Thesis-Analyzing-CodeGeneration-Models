/*

Explanation

Example case 1.
If chef removes the 3rd pile he can remove at most 4 stones by removing the other two piles.

Example case 2.
Chef can remove at most 3 stones by removing all the piles.

Explanation:

Sample Input

2
3
1 2 3
3
1 2 1

Sample Output

4
3

Explanation

In the first example, each player can remove at most one pile. So we can see that the second player will remove the third pile.

In the second example, the first player removes the second pile, the second player removes the third pile and the first player removes the first pile.
*/
import java.lang.Math;

class StonePiles
{
	public static void main(String[] args)
	{
		int[] a = {1,2,3};
		int[] b = {1,2,1};
		int[] c = {4,4,4,4,4,4,4,4,4,4,4,4};
		int[] d = {4,4,4,4,4,4,4,4,4,4,4,4,4};

		System.out.println(Solution(a));
		System.out.println(Solution(b));
		System.out.println(Solution(c));
		System.out.println(Solution(d));
	}

	public static int Solution(int[] array)
	{
		int sum = 0;
		for(int i = 0; i < array.length; i++)
		{
			sum += array[i];
		}

		int[] runningSum = new int[array.length];
		runningSum[0] = array[0];

		for(int i = 1; i < array.length; i++)
		{
			runningSum[i] += array[i] + runningSum[i-1];
		}

		int[][] dp = new int[array.length][array.length];

		for(int i = 0; i < array.length; i++)
		{
			dp[i][i] = array[i];
		}

		for(int i = 1; i < array.length; i++)
		{
			for(int j = 0; j < array.length - i; j++)
			{
				dp[j][j+i] = runningSum[j+i] - runningSum[j] + dp[j][j];
				dp[j][j+i] = Math.max(dp[j][j+i], dp[j+1][j+i] + runningSum[j+i] - runningSum[j+1] + dp[j][j]);
			}
		}

		return dp[0][array.length-1];
	}
}