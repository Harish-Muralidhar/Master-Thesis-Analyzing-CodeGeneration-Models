/*

*/

/*

package com.google.challenges;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSubSequences {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();

		for (int i = 0; i < testCases; i++) {
			String str = sc.next();
			System.out.println(findTwoSubSequence(str));
		}
		sc.close();
	}

	public static String findTwoSubSequence(String str) {
		HashMap<String, Integer> count = new HashMap<String, Integer>();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				if (count.get(str.substring(i, j)) == null) {
					count.put(str.substring(i, j), 1);
				} else {
					count.put(str.substring(i, j), count.get(str.substring(i, j)) + 1);
				}
			}
		}

		for (String key : count.keySet()) {
			if (count.get(key) == 2) {
				return key;
			}
		}

		return "-1";
	}
}

*/