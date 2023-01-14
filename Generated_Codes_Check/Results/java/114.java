/*
 */

package com.HackerRank;

import java.util.Scanner;

public class BiCoGrid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int n,c,g;
		int temp,pos;
		while(T-->0)
		{
			n=sc.nextInt();
			c=sc.nextInt();
			g=sc.nextInt();
			temp=0;
			pos=0;
			int arr[]=new int[n+1];
			for(int i=0;i<=n;i++)
			{
				arr[i]=fact(n)/(fact(i)*fact(n-i));
			}
			int arr2[]=new int[n+1];
			for(int i=0;i<=n;i++)
			{
				arr2[i]=arr[i];
			}
			while(g>0)
			{
				for(int i=n;i>=0;i--)
				{
					if(g-arr[i]>=0)
					{
						temp=arr[i];
						break;
					}
				}
				g-=temp;
				arr[pos++]=temp;
				n--;
				for(int i=0;i<=n;i++)
				{
					arr[i]=arr2[i];
				}
			}
			System.out.println(pos);
			for(int i=0;i<pos;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return n*fact(n-1);
	}
	
	
}