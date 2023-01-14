/*

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		int count = 0;
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10000000 && count < 50000; i++) {
			char[] c = String.valueOf(i).toCharArray();
			int a = 0, b = 0, d = 0;
			for (int j = 0; j < c.length; j++) {
				if (c[j] == '8') {
					a++;
				} else if (c[j] == '5') {
					b++;
				} else if (c[j] == '3') {
					d++;
				} else {
					continue;
				}
			}
			if (a >= b && b >= d) {
				list.add(i);
			}
		}
		Collections.sort(list);
//		System.out.println(list);

		for (int z = 0; z < list.size(); z++) {
			System.out.println(list.get(z));
		}
	}
}