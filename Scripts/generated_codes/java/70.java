/*
 */
package dsa.strings;

import java.util.Scanner;

/**
 * Created by rajeevgurram on 6/9/16.
 */
public class NonDecreasingSubArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T= Integer.parseInt(scanner.next());
        while(T-- >0){
            int N= Integer.parseInt(scanner.next());
            int[] elements = new int[N];
            for(int i=0; i<N; i++){
                elements[i]=Integer.parseInt(scanner.next());
            }
            int result=0;
            result= countNonDecreasing(elements);
            System.out.println(result);
        }
    }

    private static int countNonDecreasing(int[] elements) {
        int result=0;
        for(int i=0; i<elements.length; i++){
            result+=1;
            int j=i+1;
            while(j<elements.length && elements[j-1]<=elements[j]){
                result++;
                j++;
            }
        }
        return result;
    }
}