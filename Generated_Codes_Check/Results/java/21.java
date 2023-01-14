/*

*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i = 0;i<t; i++){
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = a%b;
		    System.out.println(c);
		}
	}
}