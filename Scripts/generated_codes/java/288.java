/*

Explanation
Example case 1. Probability that A and B are coprime is 1.
Example case 2. Probability that A and B are coprime is 3/4.


*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        for(int t = 0; t < T; t++){
            int N = s.nextInt();
            long ans = 0;
            for(int i = 1; i <= N; i++){
                ans += (nearestPrimes(i, N) - 1);
            }
            System.out.println(ans+"/"+N*N);
        }
    }

    public static long nearestPrimes(int n, int max) {
        int[] primes = new int[max+1];
        Arrays.fill(primes, 1);
        int count = 0;
        boolean p = true;
        for(int i = 2; i <= max; i++){
            if(primes[i] == 1){
                int j = 2;
                while(i*j <= max){
                    if(primes[i*j] == 1){
                        primes[i*j] = 0;
                        count++;
                    }
                    j++;
                }
            }
        }
        return max - count;
    }
}