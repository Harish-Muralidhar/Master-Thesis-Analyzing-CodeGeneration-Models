/*

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class AditiMagicTrick {
    private static BufferedReader br = null;
    private static PrintStream ps = null;
    private static final Set<Integer> primes;

    static {
        br = new BufferedReader(new InputStreamReader(System.in));
        ps = System.out;
        primes = new HashSet<>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(17);
    }

    public static void main(String[] args) throws Exception {
        try {
            int testCases = Integer.parseInt(br.readLine());
            while (testCases-- > 0) {
                long number = Long.parseLong(br.readLine());
                Stack<Integer> primeFactors = primeFactors(number);
                int minimumRequiredCards = 0;
                while (!primeFactors.isEmpty()) {
                    minimumRequiredCards++;
                    int commonFactor = primeFactors.pop();
                    while (!primeFactors.isEmpty() && primeFactors.peek() == commonFactor) {
                        primeFactors.remove(primeFactors.size() - 1);
                    }
                }
                ps.println(minimumRequiredCards);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }

    private static Stack<Integer> primeFactors(long number) {
        Stack<Integer> factors = new Stack<>();
        int primeIndex = 0;
        while (number != 1) {
            int prime = getPrime(primeIndex++);
            while (number % prime == 0) {
                factors.push(prime);
                number /= prime;
            }
        }
        return factors;
    }

    private static int getPrime(int index) {
        int prime = 2;
        for (int i = 0; i < index; i++) {
            if (primes.contains(prime)) {
                prime++;
                i--;
            } else {
                prime++;
            }
        }
        return prime;
    }
}