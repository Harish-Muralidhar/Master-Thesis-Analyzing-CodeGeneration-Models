/*

*/

import java.util.*;
public class ChefAndGoldCoins
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long n=sc.nextLong();
			int res=0;
			int j=1;
			while(n>0)
			{
				n-=j;
				if(n<0)
					break;
				else
					res++;
				j++;
			}
			System.out.println(res);
		}
	}
}