
Testcase 1:
Input
3
3 1 2 2
3 4
2 2
3 3 3
3 4
2 2
3 3 1
40 50
20 30
Output
LuckyChef
UnluckyChef
UnluckyChef

Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int x = sc.nextInt();
		    int y = sc.nextInt();
		    int k = sc.nextInt();
		    int n = sc.nextInt();
		    int p[] = new int[n];
		    int c[] = new int[n];
		    for(int i=0;i<n;i++)
		    {
		        p[i] = sc.nextInt();
		        c[i] = sc.nextInt();
		    }
		    int rem = x-y;
		    boolean flag = false;
		    for(int i=0;i<n;i++)
		    {
		        if(p[i]>=rem && c[i]<=k)
		        {
		            flag = true;
		            break;
		        }
		    }
		    if(flag)
		    {
		        System.out.println("LuckyChef");
		    }
		    else
		    {
		        System.out.println("UnluckyChef");
		    }
		}
	 }
}