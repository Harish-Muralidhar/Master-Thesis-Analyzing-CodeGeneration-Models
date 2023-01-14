/*

 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author pravat
 *
 */
public class PickingIngredients {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfInputs = sc.nextInt();
		for(int i=0; i<noOfInputs; i++) {
			//System.out.println("Entering : " + i);
			int size = sc.nextInt();
			int[] input = new int[size];
			for(int j=0; j<size; j++) {
				input[j] = sc.nextInt();
			}
			int val = findMax(input);
			System.out.println(val);
		}
		sc.close();
	}

	private static int findMax(int[] input) {
		Arrays.sort(input);
		int sum = 0;
		int N = input.length;
		int[] temp = new int[N];
		for(int i=0; i<N; i++) {
			temp[i] = input[i]/2;
		}
		for(int i=0; i<N; i++) {
			if(temp[i] > 0) {
				sum += input[i]/2;
			}
		}
		if(sum >= N) {
			return sum;
		} else {
			return -1;
		}
	}

}