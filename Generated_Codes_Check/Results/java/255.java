/*

Explanation:
For input 1, there are two interesting segments of buildings of length 1: [1,1] and [2,2].
For input 2, there are three interesting segments of buildings of length 2: [1,2], [2,3] and [3,4].
*/
import java.util.Scanner;

public class ChefTownParade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, w;
        n = sc.nextInt();
        w = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i <= n - w; i++) {
            int flag = 0;
            for (int j = i; j < i + w - 1; j++) {
                int a = Math.abs(arr[j] - arr[j + 1]);
                if (a != 1) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}