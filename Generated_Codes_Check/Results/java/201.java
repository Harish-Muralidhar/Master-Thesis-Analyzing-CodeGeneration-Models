
Input:
1
2

Output:
5

Input:
1
7

Output:
18



Solution:

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     long ans=0;
	     for(int i=1;i<=n;i++)
	     {
	         ans+=i*2;
	     }
	     System.out.println(ans);
	 }
	 }
}