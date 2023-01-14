/*

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        int[][] board;
        int[][] table;
        int[][] newTable;
        int finalX;
        int finalY;
        int N;
        int M;
        int startX;
        int startY;
        String[] line;
        String[] line2;
        String[] line3;
        String[] line4;

        for (int i = 0; i < testCases; i++) {
            line = br.readLine().split(" ");
            N = Integer.parseInt(line[0]);
            M = Integer.parseInt(line[1]);
            line2 = br.readLine().split(" ");
            startX = Integer.parseInt(line2[0]);
            startY = Integer.parseInt(line2[1]);
            line3 = br.readLine().split(" ");
            finalX = Integer.parseInt(line3[0]);
            finalY = Integer.parseInt(line3[1]);

            board = new int[N][M];
            table = new int[N][M];
            for (int j = 0; j < N; j++) {
                line4 = br.readLine().split(" ");
                for (int k = 0; k < M; k++) {
                    board[j][k] = Integer.parseInt(line4[k]);
                }
            }

            table[startX - 1][startY - 1] = 1;
            int currentX;
            int currentY;
            int times = board[finalX - 1][finalY - 1];
            int temp;
            for (int j = 0; j < times; j++) {
                newTable = new int[N][M];
                for (int k = 0; k < table.length; k++) {
                    for (int l = 0; l < table[k].length; l++) {
                        if (table[k][l] != 0) {
                            if (k + 1 < table.length && board[k + 1][l] != 0) {
                                currentX = k + 1;
                                currentY = l;
                                temp = table[k][l];
                                while (currentX < table.length) {
                                    newTable[currentX][currentY] += temp;
                                    currentX++;
                                }
                            }
                            if (k - 1 >= 0 && board[k - 1][l] != 0) {
                                currentX = k - 1;
                                currentY = l;
                                temp = table[k][l];
                                while (currentX >= 0) {
                                    newTable[currentX][currentY] += temp;
                                    currentX--;
                                }
                            }
                            if (l + 1 < table[k].length && board[k][l + 1] != 0) {
                                currentX = k;
                                currentY = l + 1;
                                temp = table[k][l];
                                while (currentY < table[k].length) {
                                    newTable[currentX][currentY] += temp;
                                    currentY++;
                                }
                            }
                            if (l - 1 >= 0 && board[k][l - 1] != 0) {
                                currentX = k;
                                currentY = l - 1;
                                temp = table[k][l];
                                while (currentY >= 0) {
                                    newTable[currentX][currentY] += temp;
                                    currentY--;
                                }
                            }
                        }
                    }
                }
                table = newTable;
            }
            System.out.println(table[finalX - 1][finalY - 1]);
        }
    }
}