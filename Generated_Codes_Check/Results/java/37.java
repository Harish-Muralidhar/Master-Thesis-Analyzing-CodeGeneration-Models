/*

Test 3: Chef will buy 1 apple by paying 1 gold coin, and will buy 2 oranges by paying 2 gold coins and will have equal number of apples and oranges.

*/

import java.lang.*;
import java.io.*;
import java.util.*;
import java.math.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while( t-- > 0 )
		{
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int k = Integer.parseInt(str[2]);
			int diff = Math.abs(n-m);
			if( k >= diff )
			{
				System.out.println(0);
			}
			else
			{
				System.out.println(diff-k);	
			}
		}
		
	}
}