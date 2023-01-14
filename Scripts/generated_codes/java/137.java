/*

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class unionFind
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[][] arr = new int[n+1][2];
		for(int i=1;i<=n;i++){
		    arr[i][0]=i;
		    arr[i][1]=i;
		}
		for(int i=0;i<q;i++){
		    String s = sc.next();
		    if(s.equals("UNION")){
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = arr[a][0];
		        int d = arr[b][0];
		        if(c!=d){
		            if(arr[c][1]>arr[d][1]){
		                arr[d][0]=c;
		                arr[c][1]+=arr[d][1];
		            }else{
		                arr[c][0]=d;
		                arr[d][1]+=arr[c][1];
		            }
		        }
		    }else{
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        int c = arr[a][0];
		        System.out.println(arr[c][1]-arr[c][0]+1-b+1);
		    }
		}
	}
}