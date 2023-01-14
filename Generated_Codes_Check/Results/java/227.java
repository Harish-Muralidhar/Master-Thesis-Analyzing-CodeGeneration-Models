/*
You can use the code provided in the editor to take input and print output.

Time Limit: 10 secs
Memory Limit: 50 MB
Source Limit: 50000 Bytes

*/


import java.util.Scanner;

public class Maximum_speed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int s=sc.nextInt();
			int[] car=new int[s];
			
			for(int j=0;j<s;j++)
			{
				car[j]=sc.nextInt();
			}
			
			int count=0;
			
			int max=car[0];
			for(int j=1;j<s;j++)
			{
				if(car[j]<=max)
				{
					count++;
				}
				if(car[j]>max)
				{
					max=car[j];
				}
				
			}
			
			System.out.println(count);
			
		}

	}

}