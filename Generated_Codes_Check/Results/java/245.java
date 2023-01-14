'''

Solution:
'''

import java.util.*;
import java.lang.*;
import java.io.*;
class ChefAndMaze
 {
	public static void main (String[] args)
	 {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    while(t-->0){
	        long n=s.nextLong();
	        long m=s.nextLong();
	        if((n*m)%2!=0){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
	    }
	 }
}