/*


*/



import java.util.*;
import java.io.*;
import java.util.Scanner;

public class min_balloons
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int counta = 0, countb = 0;
			String s = sc.next();
			for(int i = 0; i < s.length(); i++)
			{
				if(s.charAt(i) == 'a')
					counta++;
				else
					countb++;
			}
			int ans = Math.min(counta, countb);
			System.out.println(ans);
		}
	}
}