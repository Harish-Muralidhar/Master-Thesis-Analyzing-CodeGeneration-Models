/*

*/

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Solution {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		BigInteger[] sum = new BigInteger[T];
		for (int i = 0; i < T; i++) {
		    int N = sc.nextInt();
		    BigInteger[] memory = new BigInteger[N];
		    for (int j = 0; j < N; j++) {
		        memory[j] = sc.nextBigInteger();
		    }
		    sum[i] = BigInteger.valueOf(0);
		    BigInteger allocated = BigInteger.valueOf(0);
		    for (int j = 0; j < N; j++) {
		        if (allocated.compareTo(memory[j]) >= 0) {
		            allocated = allocated.subtract(memory[j]);
		        } else {
		            sum[i] = sum[i].add(memory[j].subtract(allocated));
		            allocated = BigInteger.valueOf(0);
		        }
		    }
		}
		for (int i = 0; i < T; i++) {
		    System.out.println(sum[i]);
		}
	}
}