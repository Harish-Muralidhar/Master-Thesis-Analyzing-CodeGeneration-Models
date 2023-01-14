/*


*/

import java.util.*;
import java.lang.*;

public class Chef_and_Binary_Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        long[] arr = new long[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextLine().length();
            //System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        long result = arr[0];
        for (int j=1; j<N; j++) {
            result = result ^ arr[j];
        }
        System.out.println(result);
    }
}