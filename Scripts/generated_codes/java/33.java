/*


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int a,b,gcd=0;
		int lcm;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		for(int i=1;i<=a && i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		
		lcm=(a*b)/gcd;
		System.out.print(gcd+" "+lcm);
	}
}