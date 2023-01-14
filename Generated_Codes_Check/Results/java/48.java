/*

Input:
1
11
1
2
1
2
3
3
4
4
5
5
6

Output:
6

Explanation
Example case 1. 
In the given example there are 3-1,1-2,2-1. 
There is only one 2 hence 2 is the answer.

Example case 2. 
In the given example there are 2-1,1-2,2-3,3-4,4-5,5-2 
There is only one 3 hence 3 is the answer.

Example case 3. 
In the given example there are 1-2,2-1,1-2,2-3,3-4,4-5,5-6,6-1. 
There is only one 6 hence 6 is the answer.

*/

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
	     int n=sc.nextInt();
	     int a[]=new int[n];
	     for(int j=0;j<n;j++){
	         a[j]=sc.nextInt();
	     }
	     HashMap<Integer,Integer> hm=new HashMap<>();
	     for(int j=0;j<n;j++){
	         if(hm.containsKey(a[j])){
	             int v=hm.get(a[j]);
	             v++;
	             hm.put(a[j],v);
	         }
	         else{
	             hm.put(a[j],1);
	         }
	     }
	    
	     for(int j=0;j<n;j++){
	         if(hm.get(a[j])%2!=0){
	             System.out.println(a[j]);
	             break;
	         }
	     }
	     
	     
	 }
	 }
}