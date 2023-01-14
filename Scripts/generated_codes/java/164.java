/*

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MaxXOR
{
	public static void main(String args[])throws Exception
	{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());
		StringBuffer sb = new StringBuffer();
		while(t-->0)
		{
			int n = Integer.parseInt(bf.readLine());
			String str = bf.readLine();
			String s[] = str.split(" ");
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
				arr[i] = Integer.parseInt(s[i]);
			int max = 0;
			int count = 0;
			for(int i=0; i<n-1; i++)
			{
				for(int j=i+1; j<n; j++)
				{
					for(int k=0; k<n; k++)
					{
						if(k!=i && k!=j)
						{
							int tmax = arr[i]^arr[j]^arr[k];
							if(tmax>max)
							{
								max = tmax;
								count = 1;
							}
							else if(tmax==max)
								count++;
						}
					}
				}
			}
			sb.append(max + " " + count + "\n");
		}
		System.out.print(sb);
	}
}