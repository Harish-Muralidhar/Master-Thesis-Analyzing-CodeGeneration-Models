Subtask 5 (0 points): Sample Testcases. 



import java.util.*;
import java.lang.*;
import java.io.*;


class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextLong();
		}
		long ans=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				ans+=a[i]&a[j];
			}
		}
		System.out.println(ans);
		
	}
}


Q5. 
Write a Java program that determines the points of intersection between N horizontal and M vertical lines. 

Input
The first line of input consists of the integer N. 
The next N lines contain a pair of integers Ai and Bi, separated by a space, where Ai is the y-coordinate of the i-th horizontal line and Bi is either -1 or 1, 
depending on whether the line is considered "open" to the left or to the right. 
The next line of input consists of the integer M. 
The next M lines consist of a pair of integers Ci and Di, separated by a space, where Ci is the x-coordinate of the i-th vertical line and Di is either -1 or 1, 
depending on whether the line is considered "open" to the bottom or to the top. 

Output
The output needs to contain M+N-1 lines. 
On the first line of the output, you must print the number of points of intersection between the horizontal and vertical lines. 
The next M+N-1 lines describe the points of intersection (if they exist) between the lines. 
The lines are ordered in the following way: first, all the points of intersection between the horizontal lines, 
then between the vertical lines. 
Each point of intersection is described in two integers - its x-coordinate and its y-coordinate. 

Example
Input:
2
1 -1
-1 1
2
1 -1
-1 1

Output:
2
-1 1
1 1

Scoring

Subtask 1 (8 points): N = 1 or M = 1 or N = 2 or M = 2. 
Subtask 2 (12 points): No additional constraints. 
Subtask 3 (20 points): N, M <= 1000. 
Subtask 4 (60 points): N, M <= 10^5. 


import java.util.*;
import java.lang.*;
import java.io.*;
 

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		int c[]=new int[m];
		int d[]=new int[m];
		for(int i=0;i<m;i++){
			c[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			d[i]=sc.nextInt();
		}
		int ans=0;
		int x[]=new int[n+m-1];
		int y[]=new int[n+m-1];
		int k=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(a[i]==c[j]){
					ans++;
					x[k]=c[j];
					y[k]=a[i];
					k++;
 
				}
			}
		}
		System.out.println(ans);
		for(int i=0;i<n+m-1;i++){
			System.out.println(x[i]+" "+y[i]);
		}
	}
}