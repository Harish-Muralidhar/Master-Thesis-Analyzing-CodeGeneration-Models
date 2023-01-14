/*

Explanation
Testcase 1:

After first position is selected, the numbering is [1, 0, 1, 2]. Maximum number assigned is 2.
Testcase 2:

After first position is selected, the numbering is [2, 1, 0, 1, 2, 3]. After second position is selected, the numbering is [3, 2, 1, 1, 2, 3].
Maximum number assigned is 3.


*/
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     public static int min(int x,int y)
     {
         if(x<y)
         {
             return x;
         }
         else
         {
             return y;
         }
     }
     
	 public static void main (String[] args)
	 {
	 //code
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t-->0)
	 {
	     int n=sc.nextInt();
	     int m=sc.nextInt();
	     int a[]=new int[m];
	     int count[]=new int[n];
	     for(int i=0;i<m;i++)
	     {
	         a[i]=sc.nextInt();
	     }
	     for(int i=0;i<m;i++)
	     {
	         for(int j=0;j<n;j++)
	         {
	             if(a[i]>=j)
	             {
	                 count[j]+=1;
	             }
	             else
	             {
	                 count[j]+=1;
	             }
	         }
	     }
	     for(int i=0;i<n;i++)
	     {
	         System.out.print(count[i]+" ");
	     }
	     System.out.println();
	 }
	 }
}