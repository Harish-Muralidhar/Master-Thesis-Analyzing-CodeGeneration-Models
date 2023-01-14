/*
(though most should be OK if the algorithm is well designed)



*/

import java.util.*;

class Counting_the_pairs
{
	static int max=0,total=0;
	static int a[][];
	static int b[][];
	static int c[][];
	static int n;
	static void read()
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n][n];
		b=new int[n][n];
		c=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				a[i][j]=sc.nextInt();
				b[i][j]=a[i][j];
			}
		}
	}
	static void find_max()
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				if(b[i][j]>b[i][j+1])
					c[i][j]=b[i][j];
				else
					c[i][j]=b[i][j+1];
			}
			for(int j=0;j<=i;j++)
			{
				b[i-1][j]=b[i-1][j]+c[i][j];
			}
		}
		max=c[0][0];
	}
	static void find_total()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				total=total+a[i][j];
			}
		}
	}
	static void display()
	{
		System.out.println(max+" "+total);
	}
	public static void main(String args[])
	{
		read();
		find_max();
		find_total();
		display();
	}
}


/*

import java.io.*;
import java.util.Scanner;
public class One
{
	static int max=0,total=0;
	static int a[][];
	static int b[][];
	static int c[][];
	static int n;
	public static void main(String args[])
	{
		read();
		find_max();
		find_total();
		display();
	}
	static void read()
	{
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		a=new int[n][n];
		b=new int[n][n];
		c=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				a[i][j]=sc.nextInt();
				b[i][j]=a[i][j];
			}
		}
	}
	static void find_max()
	{
		for(int i=n-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				if(b[i][j]>b[i][j+1])
					c[i][j]=b[i][j];
				else
					c[i][j]=b[i][j+1];
			}
			for(int j=0;j<=i;j++)
			{
				b[i-1][j]=b[i-1][j]+c[i][j];
			}
		}
		max=c[0][0];
	}
	static void find_total()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				total=total+a[i][j];
			}
		}
	}
	static void display()
	{
		System.out.println(max+" "+total);
	}
}

*/