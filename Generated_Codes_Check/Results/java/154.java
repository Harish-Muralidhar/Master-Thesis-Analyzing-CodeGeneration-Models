/*
*/
	
//Solution 1	
import java.io.*;
import java.util.*;

class HACKR1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long t = Long.parseLong(br.readLine());
		while(t-- > 0) {
			long n = Long.parseLong(br.readLine());
			long arr[] = new long[(int)n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++) {
				arr[i] = Long.parseLong(st.nextToken());
			}
			long min = Math.min(arr[0] + arr[1] + arr[2], Math.min(arr[0] + arr[1] - arr[2], Math.min(arr[0] + arr[1] * arr[2], Math.min(arr[0] - arr[1] + arr[2], Math.min(arr[0] - arr[1] - arr[2], Math.min(arr[0] - arr[1] * arr[2], Math.min(arr[0] * arr[1] + arr[2], Math.min(arr[0] * arr[1] - arr[2], arr[0] * arr[1] * arr[2])))))));
			System.out.println(min);
		}
	}
}