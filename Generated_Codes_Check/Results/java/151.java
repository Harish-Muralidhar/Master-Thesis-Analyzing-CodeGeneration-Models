/*

*/
import java.util.*;
import java.lang.Math;
import java.lang.String;

class ChefAndWords
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n = sc.nextInt();
			int k1 = sc.nextInt();
			String s = sc.next();
			double a[][] = new double[26][26];
			for(int i=0;i<26;i++)
			{
				for(int j=0;j<26;j++)
				{
					a[i][j] = sc.nextDouble();
				}
			}
			int count = 0 ;
			String s2[] = new String[n];
			for(int i=0;i<n;i++)
			{
				s2[i] = sc.next();
				if(s.equals(s2[i]))
					count++;
			}
			double sum = 0;
			double sum1 = 0;
			int c = 0;
			for(int i=0;i<n;i++)
			{
				sum1 = Math.pow(a[s.charAt(0)-97][s2[i].charAt(0)-97],k1);
				for(int j=1;j<s.length();j++)
				{
					sum1*=Math.pow(a[s.charAt(j)-97][s2[i].charAt(j)-97],k1);
				}
				sum+=sum1;
			}
			System.out.println(sum);
		}
	}
}