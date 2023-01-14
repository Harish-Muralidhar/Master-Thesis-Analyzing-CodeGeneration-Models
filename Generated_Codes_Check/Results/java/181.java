/*


*/

import java.util.Scanner;
public class CountingLeaves
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		for(int k=0;k<t;k++)
		{
			int count=0;
			int n=in.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{
				arr[i]=in.nextInt();
			}
			for(int i=1;i<n;i++)
			{
				if((arr[i]-arr[i-1])>=0)
				{
					count=count+(arr[i]-arr[i-1]);
				}
			}
			if(count%2==0)
			{
				System.out.println("Yes");
			}
			else
				System.out.println("No");
		}
	}
}