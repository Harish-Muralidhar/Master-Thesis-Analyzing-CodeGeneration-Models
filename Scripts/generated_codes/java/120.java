/*

Sample Input:
4 3 1 4
1 3 5
3 3 4
2 2 1
2 1 2
Sample Output:
2
 */

public class MinimumCostOfBarricadeRemoval {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width");
        int width = sc.nextInt();
        System.out.println("Enter the height");
        int height = sc.nextInt();
        System.out.println("Enter the d");
        int d = sc.nextInt();
        System.out.println("Enter the number of barricades");
        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the x,y and cost for barricade " + i);
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
            arr[i][2] = sc.nextInt();
        }
        System.out.println(getMinimumCost(width, height, d, arr));
    }

    private static int getMinimumCost(int width, int height, int d, int[][] arr) {
        int count = 0;
        int cost = 0;
        int maxCost = 0;
        int minCost = 0;
        boolean flag = false;

        int[][] costArr = new int[width][height];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i][0];
            int y = arr[i][1];
            int barricadeCost = arr[i][2];
            costArr[x][y] = barricadeCost;
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 && j == 0) {
                    cost = cost + costArr[i][j];
                } else {
                    if (i == width - 1 && j == height - 1) {
                        cost = cost + costArr[i][j];
                    } else {
                        if (i == 0 && j == height - 1) {
                            cost = cost + costArr[i][j];
                        } else {
                            if (j == 0 && i == width - 1) {
                                cost = cost + costArr[i][j];
                            } else {
                                if (i == 0 || i == width - 1 || j == 0 || j == height - 1) {
                                    cost = cost + costArr[i][j];
                                } else {
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 && j == 0) {
                    maxCost = maxCost + costArr[i][j];
                } else {
                    if (i == width - 1 && j == height - 1) {
                        maxCost = maxCost + costArr[i][j];
                    } else {
                        if (i == 0 && j == height - 1) {
                            maxCost = maxCost + costArr[i][j];
                        } else {
                            if (j == 0 && i == width - 1) {
                                maxCost = maxCost + costArr[i][j];
                            } else {
                                if (i == 0 || i == width - 1 || j == 0 || j == height - 1) {
                                    maxCost = maxCost + costArr[i][j];
                                } else {
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (i == 0 && j == 0) {
                    minCost = minCost + costArr[i][j];
                } else {
                    if (i == width - 1 && j == height - 1) {
                        minCost = minCost + costArr[i][j];
                    } else {
                        if (i == 0 && j == height - 1) {
                            minCost = minCost + costArr[i][j];
                        } else {
                            if (j == 0 && i == width - 1) {
                                minCost = minCost + costArr[i][j];
                            } else {
                                if (i == 0 || i == width - 1 || j == 0 || j == height - 1) {
                                    minCost = minCost + costArr[i][j];
                                } else {
                                }
                            }
                        }
                    }
                }
            }
        }
        int finalCost = 0;
        if (minCost > cost) {
            finalCost = cost;
        } else {
            if (maxCost < cost) {
                finalCost = maxCost;
            }
        }

        return finalCost;
    }
}

// This solution is incomplete as I am not able to figure out the logic to check for the 2d