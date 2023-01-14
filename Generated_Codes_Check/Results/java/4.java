/*

*/

import java.util.HashMap;
import java.util.Scanner;

public class ChefAndSubarrays {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0 ; i < n ; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(solve(arr,n));
		}
		sc.close();
	}
	
	static long solve(int arr[], int n) {
		HashMap<Long, Long> sumMap = new HashMap<Long, Long>();
		HashMap<Long, Long> prodMap = new HashMap<Long, Long>();
		long sum = 0,prod = 1;
		long count = 0;
		for(int i = 0 ; i < n ; i++) {
			sum += arr[i];
			prod *= arr[i];
			if(sum == prod)
				++count;
			if(sumMap.get(sum) == null) {
				sumMap.put(sum, (long) 1);
			}
			else {
				sumMap.put(sum, sumMap.get(sum) + 1);
			}
			if(prodMap.get(prod) == null) {
				prodMap.put(prod, (long) 1);
			}
			else {
				prodMap.put(prod, prodMap.get(prod) + 1);
			}
		}
		for(int i = 0 ; i < n ; i++) {
			sum -= arr[i];
			prod /= arr[i];
			if(sum == prod) {
				++count;
			}
			if(sumMap.get(sum) != null) {
				count += sumMap.get(sum);
			}
			if(prodMap.get(prod) != null) {
				count += prodMap.get(prod);
			}
		}
		return count;
	}
}