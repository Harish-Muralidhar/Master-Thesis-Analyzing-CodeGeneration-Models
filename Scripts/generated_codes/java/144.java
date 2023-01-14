/*

*/

import java.util.Arrays;
import java.util.Scanner;

public class InversionCount {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n,m;
		n=input.nextInt();
		m=input.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=input.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			int p=input.nextInt();
			int q=input.nextInt();
			swap(a,p-1,q-1);
			System.out.println(inversionCount(a, n));
			swap(a,p-1,q-1);
		}
	}
	public static long inversionCount(int a[],int n)
	{
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		Arrays.sort(b);
		long count=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]!=b[i])
				count++;
		}
		return count/2;
	}
	
	public static void swap(int a[],int i,int j)
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}

}