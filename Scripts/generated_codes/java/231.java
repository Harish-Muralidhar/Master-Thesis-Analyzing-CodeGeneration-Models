/*

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class ChefAndCube {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            String[] inp = br.readLine().split(" ");
            Set<String> set = new HashSet<String>(Arrays.asList(inp));
            String[] colours = {"black", "blue", "red", "green", "yellow", "orange"};
            String ans = "NO";
            for(int i=0; i<colours.length; i++) {
                if(set.contains(colours[i]) && set.size() != 1) {
                    ans = "YES";
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}