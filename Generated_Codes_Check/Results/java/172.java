/*

Author: Rohit Kumar

*/

import java.util.Scanner;
class LittleChief{
	static int finalCount=0;
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while(testCases-->0){
			int upper = scan.nextInt();
			int d = scan.nextInt();
			int m = scan.nextInt();
			int n = scan.nextInt();
			recursiveFunction(upper,d,m,n,0);
			System.out.println(finalCount);
		}
	}

	public static void recursiveFunction(int upper,int d,int m,int n,int count){
		if(upper==0){
			if(count==m)
				finalCount++;
			return;
		}
		for(int i=1;i<=upper;i++){
			recursiveFunction(upper-i,d,m,n,count+((int)Math.pow(i,d)%n));
		}
	}
}