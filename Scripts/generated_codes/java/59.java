/*

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0)
		{
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c=(a>b)?a:b;
			while(a%c!=0 || b%c!=0)
				c--;
			System.out.println(a/c*b/c);
		}
	}
}