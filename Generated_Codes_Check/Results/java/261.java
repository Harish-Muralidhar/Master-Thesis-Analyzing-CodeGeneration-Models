/*

The first polygon contains the second one. The third contains the first one. And the second one doesn't contain any other polygon.


*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0)
		{
		    int n = s.nextInt();
		    int[][] points = new int[n][];
		    int[] count = new int[n];

		    for(int i=0;i<n;i++)
		    {
		        int m = s.nextInt();
		        points[i] = new int[m];
		        for(int j=0;j<m;j++)
		        {
		            points[i][j] = s.nextInt();
		        }
		    }

		    for(int i=0;i<n;i++)
		    {
		        Point[] p = new Point[points[i].length];
		        for(int j=0;j<points[i].length;j++)
		        {
		            if(j%2==0)
		                p[j/2] = new Point(points[i][j],points[i][j+1]);
		        }
		        for(int j=0;j<n;j++)
		        {
		            if(i!=j)
		            {
		                boolean flag = true;
		                Point[] p1 = new Point[points[j].length];
		                for(int k=0;k<points[j].length;k++)
		                {
		                    if(k%2==0)
		                        p1[k/2] = new Point(points[j][k],points[j][k+1]);
		                }
		                for(int k=0;k<p1.length;k++)
		                {
		                    if(!PointInPolygon(p1[k],p))
		                    {
		                        flag = false;
		                        break;
		                    }
		                }
		                if(flag)
		                    count[i]++;
		            }
		        }
		    }

		    for(int i=0;i<n;i++)
		        System.out.print(count[i]+" ");
		    System.out.println();
		}
	}

	static class Point
	{
	    int x,y;
	    Point(int x, int y)
	    {
	        this.x = x;
	        this.y = y;
	    }
	}

	static boolean onSegment(Point p, Point q, Point r)
	{
	    if(q.x <= Math.max(p.x,r.x) && q.x >= Math.min(p.x,r.x) && q.y <= Math.max(p.y,r.y) && q.y >= Math.min(p.y,r.y))
	        return true;
	    return false;
	}

	static int orientation(Point p, Point q, Point r)
	{
	    int val = (q.y-p.y)*(r.x-q.x) - (q.x-p.x)*(r.y-q.y);
	    if(val == 0)
	        return 0;
	    else if(val>0)
	        return 1;
	    else
	        return 2;
	}

	static boolean doIntersect(Point p1, Point q1, Point p2, Point q2)
	{
	    int o1 = orientation(p1,q1,p2);
	    int o2 = orientation(p1,q1,q2);
	    int o3 = orientation(p2,q2,p1);
	    int o4 = orientation(p2,q2,q1);

	    if(o1!=o2 && o3!=o4)
	        return true;
	    if(o1==0 && onSegment(p1,p2,q1))
	        return true;
	    if(o2==0 && onSegment(p1,q2,q1))
	        return true;
	    if(o3==0 && onSegment(p2,p1,q2))
	        return true;
	    if(o4==0 && onSegment(p2,q1,q2))
	        return true;

	    return false;
	}

	static boolean PointInPolygon(Point p, Point[] polygon)
	{
	    int n = polygon.length;
	    if(n<3)
	        return false;
	    Point extreme = new Point(Integer.MAX_VALUE,p.y);
	    int count = 0, i=0;
	    do
	    {
	        int next = (i+1)%n;
	        if(doIntersect(polygon[i],polygon[next],p,extreme))
	        {
	            if(orientation(polygon[i],p,polygon[next])==0)
	                return onSegment(polygon[i],p,polygon[next]);

	            count++;
	        }
	        i=next;
	    }while(i!=0);
	    return (count%2 == 1);
	}
}