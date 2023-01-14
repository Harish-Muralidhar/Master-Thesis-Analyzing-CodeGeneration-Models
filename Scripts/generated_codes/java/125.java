/*

Example 3
Input:
4 5
11011
01111
10011
11111

Output:
74

Explanation
Example 1

There are only 3 sub-rectangles which contains even number of currants. They are:

0 0
0 1
1 0
1 1

Example 2

There are 26 sub-rectangles which contains even number of currants. They are:

0 0
0 1
0 2
0 3
1 0
1 1
1 2
1 3
2 0
2 1
2 2
2 3
0 0
0 1
0 2
0 3
1 0
1 1
1 2
1 3
2 0
2 1
2 2
2 3
0 0
0 1
0 2
0 3
1 0
1 1
1 2
1 3
2 0
2 1
2 2
2 3
0 0
0 1
0 2
0 3
1 0
1 1
1 2
1 3
2 0
2 1
2 2
2 3
0 0
0 1
0 2
0 3
1 0
1 1
1 2
1 3
2 0
2 1
2 2
2 3

Example 3

There are 74 sub-rectangles which contains even number of currants. They are:

0 0
0 1
0 2
0 3
0 4
1 0
1 1
1 2
1 3
1 4
2 0
2 1
2 2
2 3
2 4
3 0
3 1
3 2
3 3
3 4
4 0
4 1
4 2
4 3
4 4
0 0
0 1
0 2
0 3
0 4
1 0
1 1
1 2
1 3
1 4
2 0
2 1
2 2
2 3
2 4
3 0
3 1
3 2
3 3
3 4
4 0
4 1
4 2
4 3
4 4
0 0
0 1
0 2
0 3
0 4
1 0
1 1
1 2
1 3
1 4
2 0
2 1
2 2
2 3
2 4
3 0
3 1
3 2
3 3
3 4
4 0
4 1
4 2
4 3
4 4
0 0
0 1
0 2
0 3
0 4
1 0
1 1
1 2
1 3
1 4
2 0
2 1
2 2
2 3
2 4
3 0
3 1
3 2
3 3
3 4
4 0
4 1
4 2
4 3
4 4
0 0
0 1
0 2
0 3
0 4
1 0
1 1
1 2
1 3
1 4
2 0
2 1
2 2
2 3
2 4
3 0
3 1
3 2
3 3
3 4
4 0
4 1
4 2
4 3
4 4

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
		    String str=sc.next();
		    for(int j=0;j<m;j++)
		    {
		        arr[i][j]=Integer.parseInt(str.charAt(j)+"");
		    }
		}
		long ans=0;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<m;j++)
		    {
		        ans+=getAns(arr,i,j);
		    }
		}
		System.out.println(ans);
	}
	public static long getAns(int arr[][],int i,int j)
	{
	    long ans=0;
	    long count=0;
	    for(int k=i;k<arr.length;k++)
	    {
	        for(int l=j;l<arr[0].length;l++)
	        {
	            count+=arr[k][l];
	            if(count%2==0)
	            {
	                ans++;
	            }
	        }
	    }
	    return ans;
	}
}