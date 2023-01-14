/*


*/

import java.util.*;
import java.io.*;

class BattleShipV{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the number of Test Cases : ");
		int t = in.nextInt();
		long[] result = new long[t];
		for(int k=0; k<t; k++){
			//System.out.println("Enter the Y, X1, X2 values : ");
			long y = in.nextLong();
			long x1 = in.nextLong();
			long x2 = in.nextLong();
			long x = 0;
			if(y==0){
				x = x2-x1+1;
			}else if((y>0 && x1<0 && x2>0) || (y<0 && x1>0 && x2<0)){
				x = x2-x1+1;
			}
			else{
				long gcd = gcd(Math.abs(y), Math.abs(x2));
				if(gcd==1){
					x = 0;
				}else{
					long gcd_x1 = gcd(Math.abs(y), Math.abs(x1));
					long gcd_x2 = gcd(Math.abs(y), Math.abs(x2));
					x = Math.abs(x2-x1)/(gcd-1);
				}
			}
			result[k] = x;
		}
		for(int i=0; i<t; i++){
			System.out.println(result[i]);
		}
	}
	public static long gcd(long a, long b){
		if(b==0)
			return a;
		return gcd(b, a%b);
	}
}