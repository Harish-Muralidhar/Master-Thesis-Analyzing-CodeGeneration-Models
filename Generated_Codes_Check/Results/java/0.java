/*
But, the lexicographically smallest arrangement is BWBW.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    String s1 = sc.next();
		    String s2 = sc.next();
		    int n = s1.length();
		    StringBuilder sb = new StringBuilder();
		    for(int i=0; i<n; i++) {
		        if(s1.charAt(i) == s2.charAt(i)) {
		            if(s1.charAt(i) == 'B') sb.append('W');
		            else sb.append('B');
		        }
		        else sb.append('B');
		    }
		    System.out.println(sb);
		}
	}
}