/*
 */
 
 
 
 
 
 
 import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t-->0)
		{
		    int n = Integer.parseInt(sc.nextLine());
		    int[][] a = new int[n][n];
		    for(int i = 0;i<n;i++)
		    {
		        String[] s = sc.nextLine().split(" ");
		        for(int j = 0;j<n;j++)
		        {
		            a[i][j] = Integer.parseInt(s[j]);
		        }
		    }
		    boolean flag = true;
		    for(int i = 0;i<n;i++)
		    {
		        for(int j = 0;j<n;j++)
		        {
		            if(a[i][j] == 1)
		            {
		                flag = false;
		                break;
		            }
		        }
		    }
		    if(flag)
		    {
		        for(int i = 0;i<n;i++)
		        {
		            System.out.print(0+" ");
		        }
		    }
		    else
		    {
		        System.out.print(-1);
		    }
		    System.out.println();
		}
	}
}