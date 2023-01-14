/*

Time Limit: 2.0 sec(s) for each input file.
Memory Limit: 256 MB
Source Limit: 1024 KB
Marking Scheme: Marks are awarded if any testcase passes.

Allowed Languages: Java, C, C++, C#, Python, Python 3, Perl, PHP, PHP 7, Ruby, Haskell, Scala, Clojure
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class ChefAndSequence {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		//StringBuffer sb = new StringBuffer();
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    int count =0 ;
		    for(int i=0;i<n-1;i++){
		        if(arr[i]>arr[i+1]){
		            count++;
		        }
		    }
		    System.out.println(count+1);
		}
	}
}