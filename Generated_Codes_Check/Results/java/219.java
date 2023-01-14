/*
 */
package Elite;
import java.util.*;
public class SweetSeller {
	
	public static int calculate(int arr[],int sum,int n) {
		Arrays.sort(arr);
		if(sum > arr[n-1]) return -1;
		int left = 0;
		int right = n-1;
		int mid = 0;
		while(left+1 < right) {
			mid = left+(right-left)/2;
			if(arr[mid] < sum) left = mid;
			else right = mid;
		}
		if(arr[right] == sum) return right;
		if(arr[left] == sum) return left;
		return right-1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0) {
			int n = sc.nextInt();
			int sum = sc.nextInt();
			int arr[] = new int[n];
			int total = 0;
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				total += arr[i];
			}
			int count = 0;
			Arrays.sort(arr);
			int i = n-1;
			while(total >= sum) {
				count++;
				total -= arr[i];
				i--;
			}
			int pre = total;
			int result = 0;
			for(int j=0;j<n;j++) {
				int curr = pre;
				curr += arr[j];
				result = calculate(arr,curr,n);
				if(result != -1) {
					count += result+1;
					break;
				}
			}
			if(result == -1) System.out.println(-1);
			else System.out.println(count);
		}
	}
}