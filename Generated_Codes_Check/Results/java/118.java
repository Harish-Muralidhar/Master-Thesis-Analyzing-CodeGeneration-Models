/*


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int sx = sc.nextInt();
		int sy = sc.nextInt();
		int p1[] = new int[6];
		int p2[] = new int[6];
		for(int i=0;i<6;i++){
		    p1[i] = sc.nextInt();
		    p2[i] = sc.nextInt();
		}
		while(q-->0){
		    long t = sc.nextLong();
		    int c = 1;
		    for(int i=1;i<=t;i++){
		        int x = (c%6);
		        switch(x){
		            case 0:
		                c = c + (n/p1[x]);
		                if(n%p1[x]!=0)c++;
		                c = c + (m/p2[x]);
		                if(m%p2[x]!=0)c++;
		                break;
		            case 1:
		                c = c + (m/p1[x]);
		                if(m%p1[x]!=0)c++;
		                c = c + (n/p2[x]);
		                if(n%p2[x]!=0)c++;
		                break;
		            case 2:
		                if(sx%p1[x]==0){
		                    c = c + (m/p2[x]);
		                    if(m%p2[x]!=0)c++;
		                }
		                if(sy%p2[x]==0){
		                    c = c + (n/p1[x]);
		                    if(n%p1[x]!=0)c++;
		                }
		                break;
		            case 3:
		                if(sy%p1[x]==0){
		                    c = c + (n/p2[x]);
		                    if(n%p2[x]!=0)c++;
		                }
		                if(sx%p2[x]==0){
		                    c = c + (m/p1[x]);
		                    if(m%p1[x]!=0)c++;
		                }
		                break;
		            case 4:
		                c = c + (n/p1[x]);
		                if(n%p1[x]!=0)c++;
		                if(sx%p1[x]==0){
		                    c = c + (m/p2[x]);
		                    if(m%p2[x]!=0)c++;
		                }
		                break;
		            case 5:
		                c = c + (m/p1[x]);
		                if(m%p1[x]!=0)c++;
		                if(sy%p1[x]==0){
		                    c = c + (n/p2[x]);
		                    if(n%p2[x]!=0)c++;
		                }
		                break;
		        }
		    }
		    System.out.println(c);
		}
	}
}