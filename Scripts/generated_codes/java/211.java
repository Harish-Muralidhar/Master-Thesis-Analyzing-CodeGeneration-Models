/*

Note
For further information please refer to the editorial.



*/



import java.util.*;
import java.lang.*;
import java.io.*;


class AlgoPractice
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while(t-->0){
		    int M = in.nextInt();
		    double p = in.nextDouble();
		    double total = Math.pow(p,M) * 1000000000;
		    System.out.println(total / 2 + " " + total / 2);
		}
	}
}