/*
*/

import java.util.*;
import java.io.*;

class FlipSegment
{
	public static int mod = 1000000007;

	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputs[] = br.readLine().split(" ");
		int N = Integer.parseInt(inputs[0]);
		int M = Integer.parseInt(inputs[1]);
		int arr[] = new int[N+1];
		int seg[][] = new int[M][2];
		int index = 0;
		for(int i = 0; i < M; i++)
		{
			String segPoints[] = br.readLine().split(" ");
			seg[index][0] = Integer.parseInt(segPoints[0]);
			seg[index][1] = Integer.parseInt(segPoints[1]);
			index++;
		}
		System.out.println(flipSeg(arr, seg));
	}

	//Recursive Solution
	public static int flipSeg(int arr[], int seg[][])
	{
		int count = 0;
		int k = 0;
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				arr[j] = i;
				k++;
			}
			if(k == arr.length)
			{
				count++;
			}
			else
			{
				count = count + flipSeg(arr, seg);
			}
		}
		return count;
	}

	//Iterative Solution
	public static int flipSeg2(int arr[], int seg[][])
	{
		int count = 0;
		for(int i = 0; i < 2; i++)
		{
			for(int j = 0; j < arr.length; j++)
			{
				arr[j] = i;
			}
		}
		return count;
	}
}