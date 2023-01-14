/*

package contest2;


*/

import java.util.Scanner;

public class test1


{
	public static int rec_fun(int n,int m,int s)
	{
		if(n==1)
			return 1;
		if(n==m)
			return 1;
		if(m==0)
			return 0;
		if(m==1)
			return 1;
		int mid=n/2;
		if(s<=mid)
			return rec_fun(mid,m-1,s)+rec_fun(n-mid,m-1,s);
		else
			return rec_fun(mid,m-1,s-mid)+rec_fun(n-mid,m-1,s-mid);
	}
	public static void main(String[] args)
	{
		int n,m,s;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		s=sc.nextInt();
		System.out.println(rec_fun(n,m,s));
	}
}