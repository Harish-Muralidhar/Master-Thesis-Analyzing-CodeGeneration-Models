/*

*/

import java.util.*;

class Day34 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0) {
			int N = in.nextInt();
			int M = in.nextInt();
			int[] initialStamps = new int[N];
			for(int i = 0; i < N; i++) {
				initialStamps[i] = in.nextInt();
			}
			int[] days = new int[M];
			int[] firstStamps = new int[M];
			int[] secondStamps = new int[M];
			for(int i = 0; i < M; i++) {
				days[i] = in.nextInt();
				firstStamps[i] = in.nextInt();
				secondStamps[i] = in.nextInt();
			}
			long maxValue = 0;
			for(int i = 0; i < N; i++) {
				maxValue += (long)initialStamps[i]*(long)initialStamps[i];
			}
			//System.out.println(Arrays.toString(days));
			//System.out.println(Arrays.toString(firstStamps));
			//System.out.println(Arrays.toString(secondStamps));
			long[] firstStampValues = new long[M+1];
			long[] secondStampValues = new long[M+1];
			for(int i = M-1; i >= 0; i--) {
				firstStampValues[i] = firstStampValues[i+1];
				secondStampValues[i] = secondStampValues[i+1];
				firstStampValues[i] += (long)firstStamps[i]*(long)firstStamps[i];
				secondStampValues[i] += (long)secondStamps[i]*(long)secondStamps[i];
			}
			//System.out.println(Arrays.toString(firstStampValues));
			//System.out.println(Arrays.toString(secondStampValues));
			//System.out.println(maxValue);
			for(int i = 0; i < M; i++) {
				long val1 = firstStampValues[i+1] - ((long)firstStamps[i]*(long)firstStamps[i]);
				long val2 = secondStampValues[i+1] - ((long)secondStamps[i]*(long)secondStamps[i]);
				//System.out.println(val1 + " " + val2);
				maxValue = Math.max(maxValue, val1 + val2);
			}
			System.out.println(maxValue);
		}
	}
}