/*
*/

import java.util.*;

public class Solution{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<test; i++){
			String s = sc.nextLine();
			int k = sc.nextInt();
			sc.nextLine();
			char[] c = s.toCharArray();
			Arrays.sort(c);
			for(int j=0; j<k; j++)
				System.out.print(c[j]);
			System.out.println();
		}
	}
}