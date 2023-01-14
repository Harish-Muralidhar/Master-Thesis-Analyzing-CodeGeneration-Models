/*

*/

import java.io.*;
import java.util.*;
class Fibonacci {
	public static void main (String[] args) {
		int t,a;
		double b;
		Scanner in=new Scanner(System.in);
		t=in.nextInt();
		for(int i=0;i<t;i++)
		{
		    a=in.nextInt();
		    b=Math.sqrt(5*a*a+4);
		    if((b%1)==0 || (Math.sqrt(5*a*a-4)%1)==0)
		        System.out.println("YES");
		    else
		        System.out.println("NO");
		}
	}
}