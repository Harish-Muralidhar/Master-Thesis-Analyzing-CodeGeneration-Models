/*
 
Explanation

Here are the number of test cases you would encounter and the expected output

For the first case when the input is 10 the expected output is 3.1622776601683795.

Similarly for other test cases the expected outputs are 2 for 5, and 100 for 10000.
 */
import java.util.Scanner;
public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double c;
		int z = sc.nextInt();
		int n[] = new int[z];
		for(int i=0;i<z;i++) {
			n[i]=sc.nextInt();
		}
		for(int i=0;i<z;i++) {
			if(n[i]==0) {
				System.out.println(0);
			}
			else {
			a = Math.sqrt(n[i]);
			b = (int)a;
			c = a-b;
			if(c==0) {
				System.out.println(b);
			}
			else {
				System.out.println(a);
			}
			}
		}
		
	}
}