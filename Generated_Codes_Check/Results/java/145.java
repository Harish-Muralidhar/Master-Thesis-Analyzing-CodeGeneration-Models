/*

Input:
5 5
1 2
2 3
3 4
4 5
2 5

Output:
NO

Explanation
We cannot make all pair of vertices good by adding at most one edge.
*/

import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[][] a = new int[n][n];
    for(int i=0;i<m;i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      a[x][y] = 1;
      a[y][x] = 1;
    }
    int count = 0;
    boolean flag = false;
    for(int i=0;i<n;i++) {
      for(int j=0;j<n;j++) {
        if(a[i][j] == 1 && a[j][i] == 1) {
          count++;
        }
        if(count>1) {
          flag = true;
          break;
        }
      }
      if(flag)
        break;
    }
    if(flag) {
      System.out.println("NO");
    }
    else {
      System.out.println("YES");
    }
  }
}