/*

*/


import java.util.*;
import java.lang.*;
import java.math.*;
class Main
 {
	public static void main (String[] args)
	 {
	
		Scanner sc=new Scanner(System.in);
		long t=sc.nextLong();
		
		while(t-->0)
		{
		    long n=sc.nextLong();
		    long[] a=new long[10];
		    a[0]=1;
		    a[1]=2;
		    for(int i=2;i<10;i++)
		    {
		        a[i]=(a[i-1]+a[i-2])%1000000007;
		    }
		    long sum=0;
		    long f=0;
		    while(n>0)
		    {
		        long d=n%10;
		        sum=(sum+d*a[f])%1000000007;
		        f++;
		        n=n/10;
		    }
		    System.out.println(sum);
		}
	 }
}