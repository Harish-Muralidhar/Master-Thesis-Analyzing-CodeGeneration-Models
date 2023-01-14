/*

Explanation
The number 447474 has 4 occurrences of the digit 4, the number 228
has 0 occurrences, and so on.

Solution:

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		sc.nextLine();
		int a[]=new int[t];
		for(int i=0;i<t;i++)
		{
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<t;i++)
		{
			int k=a[i];
			while(k!=0)
			{
				if(k%10==4)
					count++;
				k=k/10;
			}
			System.out.println(count);
			count=0;
		}

    
    
    }
}