/*

*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    long n=sc.nextLong();
		    long ans=0;
		    for(long i=1;i*i<=n;i++)
		    {
		        if(n%i==0)
		        {
		            if(i!=n/i)
		            {
		                ans+=i;
		                ans+=n/i;
		            }
		            else
		            {
		                ans+=i;
		            }
		        }
		    }
		    System.out.println(ans);
		}
	}
}