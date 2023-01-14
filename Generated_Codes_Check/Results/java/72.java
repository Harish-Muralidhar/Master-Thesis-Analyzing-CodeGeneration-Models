/*

The solution is provided in Java.
*/
import java.util.Scanner;

public class AnswerToLifeUniverseAndEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            n = scanner.nextInt();
            if(n != 42) {
                System.out.println(n);
            }
        } while(n != 42);
    }
}