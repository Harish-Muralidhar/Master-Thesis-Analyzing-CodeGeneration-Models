/*

Explanation
1^1+2^1+...+10^1 = 55
1^2+2^2+...+10^2 = 385
1^3+2^3+...+10^3 = 3025
1^4+2^4+...+10^4 = 25333

For input:
3
10 2 1000000
10 3 1000000
10 4 1000000

the correct output is:
385
3025
25333

Explanation
1^2+2^2+...+10^2 = 385
1^3+2^3+...+10^3 = 3025
1^4+2^4+...+10^4 = 25333

For input:
1
10 3 1000000

the correct output is:
3025

Explanation
1^3+2^3+...+10^3 = 3025

For input:
1
10 4 1000000

the correct output is:
25333

Explanation
1^4+2^4+...+10^4 = 25333

***************************************************/

import java.io.*;
import java.util.*;

class SumOfPowers
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for(int i = 0; i < t; i++)
		{
			int n = input.nextInt();
			int k = input.nextInt();
			int p = input.nextInt();
			
			int total = 0;
			for(int j = 1; j <= n; j++)
			{
				int x = j;
				for(int l = 2; l <= k; l++)
				{
					x = x * j;
				}
				
				total = total + x;
			}
			System.out.println(total % p);
		}
	}
}