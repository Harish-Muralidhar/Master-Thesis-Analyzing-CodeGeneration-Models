/*

*/

import java.util.*;

class Atom
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			int arr[][]=new int[m][];
			for(int j=0;j<m;j++)
			{
				int temp=sc.nextInt();
				arr[j]=new int[temp];
				for(int k=0;k<temp;k++)
				{
					arr[j][k]=sc.nextInt();
				}
			}
			int count=0;
			int check[]=new int[n];//check if its used or not
			for(int j=0;j<n;j++)
			{
				int flag=0;
				for(int k=0;k<m;k++)
				{
					for(int l=0;l<arr[k].length;l++)
					{
						if(arr[k][l]==j)
						{
							check[j]=1;
							flag=1;
							break;
						}
					}
					if(flag==1)
						break;
				}
			}
			for(int j=0;j<n;j++)
				count+=check[j];
			System.out.println(count);
		}
	}
}