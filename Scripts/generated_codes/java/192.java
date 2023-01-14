/*
*/
import java.util.*;
public class CountPairs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int n=sc.nextInt();
			int arr[]=new int[n];
			int count=0;
			for(int j=0;j<n;j++)
			{
				arr[j]=sc.nextInt();
			}
			for(int k=0;k<n;k++)
			{
				for(int l=k+1;l<n;l++)
				{
					if(arr[k]<arr[l])
					{
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}