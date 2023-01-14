/*
*/

import java.util.*;
import java.io.*;

class Main {

	static final int MAX_K = 10;
	static final int MAX_LEN = 101;
	static final int MAX_T = 1000;

	static int t;
	static int[] k = new int[MAX_T];
	static char[][] s = new char[MAX_T][MAX_LEN];
	static int[] qIndex = new int[MAX_T];
	static int[] len = new int[MAX_T];

	static void init() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			k[i] = Integer.parseInt(br.readLine());
			s[i] = br.readLine().toCharArray();
			len[i] = s[i].length;
			for (int j = 0; j < len[i]; j++) {
				if (s[i][j] == '?') {
					qIndex[i] = j;
					break;
				}
			}
		}
	}

	static boolean isValid(int i, char[] s, int len) {
		for (int j = 0; j < len - 1; j++) {
			if (s[j] == s[j + 1]) {
				return false;
			}
		}
		if (s[0] == s[len - 1] && len > 1) {
			return false;
		}
		return true;
	}

	static boolean isAnswer(int i, char[] s, int qIndex) {
		int k = Main.k[i];
		if (qIndex == 0) {
			for (int c = 1; c < k; c++) {
				if (s[0] == c || s[len[i] - 1] == c) {
					continue;
				}
				for (int j = 0; j < len[i]; j++) {
					char[] tmp = s.clone();
					tmp[j] = (char)c;
					if (isValid(i, tmp, len[i])) {
						return false;
					}
				}
			}
		}
		else {
			for (int c = 0; c < k; c++) {
				if (s[0] == c || s[len[i] - 1] == c) {
					continue;
				}
				for (int j = 1; j < len[i]; j++) {
					char[] tmp = s.clone();
					tmp[j] = (char)c;
					if (isValid(i, tmp, len[i])) {
						return false;
					}
				}
			}
		}
		return true;
	}

	static char[] solve(int i, char[] s) {
		int k = Main.k[i];
		int qIndex = Main.qIndex[i];
		if (qIndex == 0) {
			for (int c = 1; c < k; c++) {
				if (s[0] == c || s[len[i] - 1] == c) {
					continue;
				}
				for (int j = 0; j < len[i]; j++) {
					char[] tmp = s.clone();
					tmp[j] = (char)c;
					if (isValid(i, tmp, len[i])) {
						return tmp;
					}
				}
			}
		}
		else {
			for (int c = 0; c < k; c++) {
				if (s[0] == c || s[len[i] - 1] == c) {
					continue;
				}
				for (int j = 1; j < len[i]; j++) {
					char[] tmp = s.clone();
					tmp[j] = (char)c;
					if (isValid(i, tmp, len[i])) {
						return tmp;
					}
				}
			}
		}
		return new char[] {'N', 'O'};
	}

	public static void main(String[] args) throws Exception {
		init();
		for (int i = 0; i < t; i++) {
			System.out.println(new String(isAnswer(i, s[i], qIndex[i]) ? s[i] : solve(i, s[i])));
		}
	}
}