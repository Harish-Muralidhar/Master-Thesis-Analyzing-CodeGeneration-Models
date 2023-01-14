/*

Explanation

In the first test case, the point (0,0) satisfies the condition for the house. 

In the second test case, the point (30, -40) satisfies the condition for the house. 

In the third test case, the points (0,0), (1,0), (0,1) and (1,1) satisfy the condition. 
 */
import java.io.*;
import java.util.*;

class Point {
	int x;
	int y;
	int dis;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void updateDis(int x, int y) {
		this.dis = Math.abs(this.x - x) + Math.abs(this.y - y);
	}
}

class TestClass {
    public static void main(String args[] ) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String line = br.readLine();
    	int T = Integer.parseInt(line);
    	for (int i = 0; i < T; i++) {
    		line = br.readLine();
    		int N = Integer.parseInt(line);
    		Point[] points = new Point[N];
    		for (int j = 0; j < N; j++) {
    			line = br.readLine();
    			String[] strs = line.trim().split("\\s+");
    			points[j] = new Point(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
    		}
    		
    		System.out.println(findHouseLocation(points));
    	}
    }
    
    public static int findHouseLocation(Point[] points) {
    	int[] dis = new int[points.length];
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	for (int i = 0; i < points.length; i++) {
    		dis[i] = points[i].x + points[i].y;
    		min = Math.min(min, dis[i]);
    		max = Math.max(max, dis[i]);
    	}
    	
    	int res = max - min + 1;
    	return res;
    }
}