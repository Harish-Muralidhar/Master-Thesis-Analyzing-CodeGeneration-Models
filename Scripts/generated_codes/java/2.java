/*

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Kattapa {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String[] arr = br.readLine().split(" ");
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(arr[i]);
            if ( num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(evenCount > oddCount ? "READY FOR BATTLE" : "NOT READY");
    }
}