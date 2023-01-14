/*
 pairs.
Case 4 : N = 6. Arjuna can make the pair (1,4). Bhima can not make any more pairs ( without crossing the pair (1,4) ).
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- != 0) {
            int N = Integer.parseInt(br.readLine());
            if (N % 4 == 2 || N % 4 == 3) {
                System.out.println("Arjuna");
            } else {
                System.out.println("Bhima");
            }
        }
    }
}