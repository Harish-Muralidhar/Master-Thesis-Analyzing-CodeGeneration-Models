


Solution:

import java.io.*;
import java.util.*;
import java.lang.*;

class Point
{
	int x, y;
	Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	boolean isRightAngle(Point p)
	{
		return (this.x * p.x + this.y * p.y == 0);
	}
}

class Checker implements Comparator<Point>
{
	public int compare(Point p1, Point p2)
	{
		if(p1.x == p2.x)
			return p1.y - p2.y;
		else
			return p1.x - p2.x;
	}
}

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		Point[] points = new Point[n];
		int x, y;
		StringTokenizer st;
		for(int i = 0; i < n; i++)
		{
			st = new StringTokenizer(in.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			points[i] = new Point(x, y);
		}
		
		Arrays.sort(points, new Checker());
		int count = 0;
		for(int i = 0; i < n; i++)
		{
			for(int j = i + 1; j < n; j++)
			{
				if(points[i].isRightAngle(points[j]))
					count++;
			}
		}
		System.out.println(count);
	}
}