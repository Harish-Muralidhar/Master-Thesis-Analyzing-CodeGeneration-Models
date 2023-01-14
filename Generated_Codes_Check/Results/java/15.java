/*
Example 3 : Cops in house 10 can cover houses 1 to 19, and cops in house 51 can cover houses 35 to 100. So, there are 9 safe houses numbered 20 to 34. */

import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i = 0; i < T; i++){
            int M = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            HashSet<Integer> occupied = new HashSet<Integer>();
            for(int j = 0; j < M; j++){
                occupied.add(scanner.nextInt());
            }
            int max = (x * y) + 1;
            int result = 0;
            for(int j = 1; j <= 100 - max; j++){
                boolean isSafe = true;
                for(int k = j; k <= j + max; k++){
                    if(occupied.contains(k)){
                        isSafe = false;
                        break;
                    }
                }
                if(isSafe){
                    result += max;
                }
            }
            System.out.println(result);
        }
    }
}