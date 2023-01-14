/*

There are 4 possible gameplays. A0A1A2, A0A2A1, A1A0A2 and A2A0A1. These gameplays gives scores 2, 2, 4 and 4 respectively. So the answer is 2 + 2 + 4 + 4 = 14.

*/


import java.util.Scanner;

class PrincessRupsaAndGame{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test!=0){
			int n = sc.nextInt();
			int arr[] = new int[n+1];
			for(int i=0;i<arr.length;i++){
				arr[i] = sc.nextInt();
			}
			
			long sum = 0;
			sum = sum + (2*arr[0]*(arr[0]+arr[1]))%mod;
			for(int i=1;i<arr.length-1;i++){
				sum = sum + (2*arr[i]*(arr[i-1]+arr[i+1]))%mod;
			}
			sum = sum + (2*arr[arr.length-1]*(arr[arr.length-1]+arr[arr.length-2]))%mod;
			
			System.out.println(sum%mod);
			test--;
		}
	}
	static int mod = 1000000007;
}