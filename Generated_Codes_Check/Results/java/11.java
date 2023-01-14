/*

================================================================================================================== */

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
import java.util.Scanner;

public class ChefAndReceipt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int T = input.nextInt();
        int p;
        for (int i = 0; i < T; i++) {
            p = input.nextInt();
            System.out.println(getResult(p));
        }
    }

    public static int getResult(int p) {
        int numberOfDishes = 0;
        int dishPrice = 2048;
        while (p != 0) {
            while (p >= dishPrice) {
                p -= dishPrice;
                numberOfDishes++;
            }
            dishPrice /= 2;
        }
        return numberOfDishes;
    }
}