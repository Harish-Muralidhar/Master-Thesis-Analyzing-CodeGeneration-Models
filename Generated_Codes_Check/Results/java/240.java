/*

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
    static void check(int[] arr,int n,int m){
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min)
            min=arr[i];
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i]-min;
        }
        if(sum==m)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
	public static void main (String[] args)
	 {
	Scanner ab=new Scanner(System.in);
	int t=ab.nextInt();
	while(t-->0){
	    int n=ab.nextInt();
	    int m=ab.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=ab.nextInt();
	    }
	    check(arr,n,m);
	}
	 }
}