/*

*/



import java.util.Scanner;

class teamchoosing{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++){
			long n = sc.nextLong();
			long k = sc.nextLong();
			long result = fact(n,n-k+1)/fact(k,1);
			System.out.println(result);
		}
	}
	static long fact(long a,long b){
		long result = 1;
		for(long i=a;i>=b;i--){
			result = result*i;
		}
		return result;
	}
}