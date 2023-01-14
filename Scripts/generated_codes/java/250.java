/*

*/

import java.io.*;
import java.util.*;

public class ChefAndDishes {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int dishCount = Integer.parseInt(br.readLine());
        for(int i = 0; i < dishCount; ++i) {
            String dish = br.readLine();
            System.out.println(isSpecial(dish) ? "YES" : "NO");
        }
    }
    
    private static final boolean isSpecial(final String dish) {
        if (dish == null || dish.length() == 0) return false;
        if (dish.length() == 1) return true;
        if (dish.length() == 2) return dish.charAt(0) == dish.charAt(1);
        StringBuilder sb = new StringBuilder(dish);
        for(int i = 0; i < dish.length(); ++i) {
            char c = dish.charAt(i);
            sb.deleteCharAt(i);
            if (isDoubleString(sb.toString())) return true;
            sb.insert(i, c);
        }
        return false;
    }
    
    private static final boolean isDoubleString(final String dish) {
        if (dish == null || dish.length() == 0) return false;
        if (dish.length() == 1) return true;
        if (dish.length() % 2 != 0) return false;
        int len = dish.length() / 2;
        for(int i = 0; i < len; ++i) {
            if (dish.charAt(i) != dish.charAt(i + len)) return false;
        }
        return true;
    }
}