/*

In the second Sample Input, it is impossible to select all strings from A, and
0 or more strings from B to form a password.

*/



import java.util.*;
import java.util.regex.*;
import java.text.*;
import java.math.*;


public class Chef_and_Password
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		while(t>0)
		{
			t--;
			int n=sc.nextInt();
			sc.nextLine();
			String[] a=new String[n];
			
			for(int i=0;i<n;i++)
				a[i]=sc.next();
			
			int m=sc.nextInt();
			sc.nextLine();
			String[] b=new String[m];
			
			for(int i=0;i<m;i++)
				b[i]=sc.next();
			
			if(n==m)
			{
				int i=0;
				
				for(i=0;i<n;i++)
					if(!a[i].equals(b[i]))
						break;
				
				if(i==n)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else
			{
				int c=0;
				
				for(int i=0;i<n;i++)
				{
					int d=0;
					
					for(int j=0;j<m;j++)
					{
						if(a[i].equals(b[j]))
						{
							d=1;
							break;
						}
					}
					
					if(d==0)
						c++;
				}
				
				if(c>m-n)
					System.out.println("NO");
				else
					System.out.println("YES");
			}
		}
	}
}