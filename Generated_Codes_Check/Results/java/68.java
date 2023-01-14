/*


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Test {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine());
		    String[] str = br.readLine().split(" ");
		    Map<Integer, Integer> map = new HashMap<>();
		    for(int i=0; i<n; i++) {
		        int curr = Integer.parseInt(str[i]);
		        if(map.containsKey(curr)) {
		            map.put(curr, map.get(curr) + 1);
		        } else {
		            map.put(curr, 1);
		        }
		    }
		    boolean flag = false;
		    int max = -1;
		    for(Integer key : map.keySet()) {
		        if(map.get(key) >= 4) {
		            flag = true;
		            max = Math.max(max, key*key);
		        } 
		        for(Integer key1 : map.keySet()) {
		            if(key != key1 && map.get(key) >= 2 && map.get(key1) >= 2) {
		                flag = true;
		                max = Math.max(max, key*key1);
		            }
		        }
		    }
		    System.out.println(max);
		}
	}
}