/*

*/

//Do not modify the main function/method.
//Write the code in the main method.
import java.util.*;
class AddFractions{
	public String[] fractions(int[] numerator, int[] denominator){
	    String [] ans = new String[numerator.length];
	    int [] gcd = new int[numerator.length];
	    gcd[0] = gcd(numerator[0], denominator[0]);
	    ans[0] = (numerator[0]/gcd[0]) + "/" + (denominator[0]/gcd[0]);
	    for(int i = 1; i < numerator.length; i++){
	        int gcdNum = gcd(numerator[i], denominator[i]);
	        int gcdDen = gcd(denominator[i-1], denominator[i]);
	        gcd[i] = gcdDen;
	        numerator[i] = gcdDen*(numerator[i]/gcdNum) + numerator[i-1]*(denominator[i]/gcdDen);
	        denominator[i] = denominator[i]*(denominator[i-1]/gcdDen);
	        int gcdFinal = gcd(numerator[i], denominator[i]);
	        ans[i] = (numerator[i]/gcdFinal) + "/" + (denominator[i]/gcdFinal);
	    }
	    return ans;
	}
	public int gcd(int a, int b){
	    if(b == 0){
	        return a;
	    }
	    return gcd(b, a%b);
	}
}
public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		int num = 0;
		int den = 0;
		int i = 0;
		int[] numerator = null;
		int[] denominator = null;
		String[] result = null;
		String[] fraction = null;
		AddFractions addFractions = new AddFractions();
		for(int k = 0; k < testCases; k++){
		    int n = sc.nextInt();
		    numerator = new int[n];
		    denominator = new int[n];
		    for(i = 0; i < n; i++){
		        fraction = sc.next().split("/");
		        num = Integer.parseInt(fraction[0]);
		        den = Integer.parseInt(fraction[1]);
		        numerator[i] = num;
		        denominator[i] = den;
		    }
		    result = addFractions.fractions(numerator, denominator);
		    for(i = 0; i < result.length; i++){
		        System.out.println(result[i]);
		    }
		    System.out.println();
		}
	}
}