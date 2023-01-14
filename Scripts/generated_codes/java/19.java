/*
 * @author rbk
 */
import java.util.*;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	for(int i=0; i<n; i++) {
	    int num = in.nextInt();
	    System.out.println(factorial(num));
	}
    }

    public static BigInteger factorial(int n) {
	BigInteger fact = BigInteger.ONE;
	for(int i=1; i<=n; i++) {
	    fact = fact.multiply(BigInteger.valueOf(i));
	}
	return fact;
    }
}
/*
  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i<n; i++) {
            int num = in.nextInt();
            System.out.println(factorial(num));
        }
    }

    public static BigInteger factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for(int i=1; i<=n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
 */