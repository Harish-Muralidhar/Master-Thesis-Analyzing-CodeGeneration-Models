/*

Example case 2. Sasha will choose 1 and Chef will choose 3 in the first turn of the game. In the second turn she will choose 2 and Chef will choose 4. In the both turns Sasha will kiss Chef. Hence, answer is 2.

Example case 3. Sasha and Chef will choose 2 in each turn of the game and since 2^2=2^2 they will not kiss. Hence, answer is 0.
 */
package com.Geeksforgeeks.mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class SashaAndChef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            int n = Integer.parseInt(br.readLine());

            ArrayList<Integer> a = new ArrayList<>();
            ArrayList<Integer> b = new ArrayList<>();

            String[] in = br.readLine().split(" ");
            for (String i : in) {
                a.add(Integer.parseInt(i));
            }

            in = br.readLine().split(" ");
            for (String i : in) {
                b.add(Integer.parseInt(i));
            }

            double res = 0, total = 0;
            while (a.size() > 0 && b.size() > 0) {
                int sizeA = a.size();
                int sizeB = b.size();
                res += (double) (sizeA * sizeB) / (sizeA + sizeB);
                total++;
                int x = a.get((int) (Math.random() * sizeA));
                int y = b.get((int) (Math.random() * sizeB));

                if (Math.pow(x, y) > Math.pow(y, x)) {
                    a.remove(new Integer(x));
                    b.remove(new Integer(y));
                } else if (Math.pow(x, y) < Math.pow(y, x)) {
                    a.remove(new Integer(x));
                    b.remove(new Integer(y));
                } else {
                    a.remove(new Integer(x));
                }
            }

            System.out.println(res / total);
        }
    }
}