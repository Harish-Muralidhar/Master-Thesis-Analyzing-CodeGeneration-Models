/*


In the third case, the valid combinations are

Box: 1398101 1124900 1239100 ... 12050090 19006090 15107080
Ball: 1398101 1124900 1239100 ... 12050090 19006090 15107080
*/


import java.util.*;
import java.io.*;
import java.math.BigInteger;
import java.lang.Math;

class SafeCombinations
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T--!=0)
		{
			//Enter the number of boxes, n
			int n = Integer.parseInt(br.readLine());
			//Getting the number of divisors of n
			int divisorsN = getDivisors(n);
			int count = 0;
			//Looping over numbers less than sqrt(n)
			for(int i=1;i<(Math.sqrt(n));i++)
			{
				//Checking the number of divisors of i, if it is same as divisors of n, we increment the count
				if(getDivisors(i)==divisorsN)
					count++;
			}
			//Multiplying the count with 2 and then taking modulo
			System.out.println((2*count)%500009);
		}
	}
	public static int getDivisors(int n)
	{
		int count = 0;
		//Looping over the numbers less than sqrt(n)
		for(int i=1;i<(Math.sqrt(n));i++)
		{
			//Checking if the number is a factor or not, if it is a factor, we increment the count
			if(n%i==0)
				count++;
		}
		//Multiplying the count by 2 and adding 1
		return count*2+1;
	}
}