/*

*/

import java.util.*;
import java.io.*;
import java.lang.Math;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running */

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++){
        	int len=sc.nextInt();
        	int q=sc.nextInt();
        	String str=sc.next();
        	int arr[] = new int[len];
        	arr=getArray(str);
        	for(int j=0;j<q;j++){
        		int k=sc.nextInt();
        		System.out.println(getCount(arr,k));
        	}

        }

        

        // System.out.println("Hello World!");
    }
    public static int[] getArray(String str){
    	int len=str.length();

    	int arr[] = new int[len];
    	for(int i=0;i<len;i++){
    		arr[i]=(int)str.charAt(i)-97;
    		//System.out.println(arr[i]);
    	}
    	return arr;
    }
    public static long getCount(int arr[],int k){
    	int len=arr.length;
    	int mod_val=1000000007;
    	long[] f = new long[26];
    	for(int i=0;i<len;i++){
    		f[arr[i]]++;
    	}
    	long res=0;
    	for(int i=0;i<26;i++){
    		//System.out.println(f[i]);
    		if(f[i]>=k){
    			res=(res+getCombi(f[i],k))%mod_val;
    		}
    	}
    	return res;
    }
    public static long getCombi(long n,int r){
    	long res=1;
    	if(r>(n-r)){
    		r=(int)(n-r);
    	}
    	for(int i=0;i<r;i++){
    		res=res*(n-i);
    		res=res/(i+1);
    	}
    	return res;
    }
}