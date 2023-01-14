
import java.util.Scanner;

public class JavaStringReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.next();
			String str1 = sc.next();
			str = str.toLowerCase();
			str1 = str1.toLowerCase();
			int len = str.length();
			int len1 = str1.length();
			int count = 0;
			int count1 = 0;
			int count2 = 0;
			int k = 0;
			int l = 0;
			for (int j = 0; j < len; j++) {
				count = 0;
				count1 = 0;
				count2 = 0;
				int k1 = j;
				int l1 = len1 - 1;
				for (k = k1; k < len; k++) {
					for (l = 0; l < len1; l++) {
						if (str.charAt(k) == str1.charAt(l)) {
							count++;
						}
					}
				}
				for (l = 0; l < len1; l++) {
					for (k = 0; k < len; k++) {
						if (str1.charAt(l) == str.charAt(k)) {
							count1++;
						}
					}
				}
				for (l = l1; l >= 0; l--) {
					for (k = len - 1; k >= 0; k--) {
						if (str1.charAt(l) == str.charAt(k)) {
							count2++;
						}
					}
				}
				if (count1 == count && count2 == count1) {
					break;
				}
			}
			if (count1 == count && count2 == count1) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
		sc.close();
	}
}