/*


Test case generation

For each subtask the following constraints are applied:

N = rand(1, 1000)
Ai = rand(0, 10^9)
M = rand(1, 10^5)
l = rand(1, 10^5)
k = rand(1, 10^6)
v = rand(1, 100)

*/

import java.util.*;

class MagicInteger {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int[] A = new int[N];
		int i = 0;
		while(i < N) {
			A[i] = in.nextInt();
			i++;
		}
		int M = in.nextInt();

		int a, b, c;
		while(M-- > 0) {
			a = in.nextInt();
			b = in.nextInt();
			c = in.nextInt();

			String str = "";
			for(i = a - 1; i < N; i += b)
				str += A[i];

			if(c <= str.length())
				System.out.println(str.charAt(c - 1));
			else 
				System.out.println("So sad");
		}

		in.close();
	}
}