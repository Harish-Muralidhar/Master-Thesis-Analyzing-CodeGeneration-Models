/*
=1, nnn=100, and nnn=100.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AliceAndJohnny {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        for (int i = 0; i < testCases; i++) {
            int noOfHints = Integer.parseInt(br.readLine());
            String[] limits = new String[noOfHints];
            String[] logicalValues = new String[noOfHints];
            for (int j = 0; j < noOfHints; j++) {
                String[] data = br.readLine().split(" ");
                limits[j] = data[0] + data[1];
                logicalValues[j] = data[2];
            }
            System.out.println(minLies(limits, logicalValues));
        }
    }

    private static int minLies(String[] limits, String[] logicalValues) {
        int lies = 0;
        for (int i = 0; i < limits.length; i++) {
            if (logicalValues[i].equals("Yes")) {
                if (limits[i].contains("<")) {
                    lies++;
                    limits[i] = limits[i].replace("<", ">");
                }
            } else if (logicalValues[i].equals("No")) {
                if (limits[i].contains("<")) {
                    limits[i] = limits[i].replace("<", ">");
                } else if (limits[i].contains(">")) {
                    limits[i] = limits[i].replace(">", "<");
                }
            }
            for (int j = i + 1; j < limits.length; j++) {
                if (limits[i].equals(limits[j])) {
                    lies++;
                }
            }
        }
        return lies;
    }
}