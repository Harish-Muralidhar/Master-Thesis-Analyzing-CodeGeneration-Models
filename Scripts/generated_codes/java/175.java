/*

*/

/*

We need to find the maximum sum of K subarrays.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    String[] s = br.readLine().split(" ");
		    int n = Integer.parseInt(s[0]);
		    int k = Integer.parseInt(s[1]);
		    int d = Integer.parseInt(s[2]);
		    int m = Integer.parseInt(s[3]);
		    String[] s1 = br.readLine().split(" ");
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        arr[i] = Integer.parseInt(s1[i]);
		    }
		    int[][] dp = new int[k+1][n];
		    int[] sum = new int[n];
		    sum[0] = arr[0];
		    for(int i=1;i<n;i++)
		    {
		        sum[i] = sum[i-1] + arr[i];
		    }
		    int[][] dp1 = new int[k+1][n];
		    for(int i=0;i<k+1;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            dp1[i][j] = Integer.MIN_VALUE;
		        }
		    }
		    for(int i=1;i<=k;i++)
		    {
		        for(int j=1;j<i;j++)
		        {
		            dp1[i][0] = 0;
		        }
		    }
		    for(int i=1;i<=k;i++)
		    {
		        for(int j=1;j<n;j++)
		        {
		            if(j>=d)
		            {
		                dp1[i][j] = Math.max(dp1[i][j-1],sum[j-1]-(sum[j-d]-arr[j-d])+m*(sum[j-1]-sum[j-d]));
		            }
		            dp1[i][j] = Math.max(dp1[i][j-1], sum[j-1]);
		        }
		    }
		    System.out.println(dp1[k][n-1]);
		}
	}
}