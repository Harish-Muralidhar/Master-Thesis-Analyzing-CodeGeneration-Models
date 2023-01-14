/*
*/
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		final int MAX = 100000;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while (n != 0) {
			int[] a = new int[MAX + 1];
			boolean ambiguous = true;
			for (int i = 1; i <= n; i++) {
				a[i] = scan.nextInt();
				if (a[i] != a[a[i]]) {
					ambiguous = false;
				}
			}
			if (ambiguous) {
				System.out.println("ambiguous");
			} else {
				System.out.println("not ambiguous");
			}
			n = scan.nextInt();
		}
		scan.close();
	}
}