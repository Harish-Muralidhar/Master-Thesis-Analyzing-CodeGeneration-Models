
Solution:
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int testCases = sc.nextInt();
	    for (int i = 0; i < testCases; i++) {
	        int numLength = sc.nextInt();
	        int[] numArr = new int[numLength];
	        for (int j = 0; j < numLength; j++) {
	            numArr[j] = sc.nextInt();
            }
            System.out.println(solution(numArr));
        }
    }

    public static int solution(int[] arr) {
        int max = 0;
        for(int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        while (max > 1) {
            max = 0;
            for (int i = 0; i < arr.length; i++) {
                int num = arr[i];
                if (num > 1) {
                    arr[i] = num - 1;
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        return max;
    }
}