/*
*/

//package chef;
import java.util.*;
import java.io.*;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int[] prices = new int[n];
			for (int j = 0; j < n; j++) {
				prices[j] = in.nextInt();
			}
			Arrays.sort(prices);
			int[] coupons = new int[k];
			for (int j = 0; j < k; j++) {
				coupons[j] = in.nextInt();
			}
			Arrays.sort(coupons);
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += prices[n-1-j] - prices[n-1-j] * coupons[k-1-j] / 100;
			}
			out.println(sum * 1.0 / (1 << k));
			
		}
		out.flush();
	}

}