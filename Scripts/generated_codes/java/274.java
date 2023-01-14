/*

{ (-1,0), (0,-1), (0,0) }, Ash is at (0,1) or (1,0). Ash can be killed in both the cases.
{ (-1,0), (0,-1), (0,1) }, Ash is at (0,0) or (1,0). Ash can be killed in both the cases.
{ (-1,0), (0,-1), (1,0) }, Ash is at (0,0) or (0,1). Ash can be killed in both the cases.
{ (-1,0), (0,0), (0,1) }, Ash is at (0,-1) or (1,0). Ash can be killed in both the cases.
{ (-1,0), (0,0), (1,0) }, Ash is at (0,-1) or (0,1). Ash can be killed in both the cases.
{ (-1,0), (0,1), (1,0) }, Ash is at (0,-1) or (0,0). Ash can be killed in both the cases.
{ (0,-1), (0,0), (0,1) }, Ash is at (-1,0) or (1,0). Ash can be killed in both the cases.
{ (0,-1), (0,0), (1,0) }, Ash is at (-1,0) or (0,1). Ash can be killed in both the cases.
{ (0,-1), (0,1), (1,0) }, Ash is at (-1,0) or (0,0). Ash cannot be killed in either of the cases.
{ (0,0), (0,1), (1,0) }, Ash is at (-1,0) or (0,-1). Ash cannot be killed in either of the cases.
*/

import java.util.Scanner;

public class TeamRocket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            Point[] points = new Point[n];
            for(int i=0;i<n;i++){
                points[i] = new Point(sc.nextInt(),sc.nextInt());
            }
            double ans = solve(points);
            System.out.println(ans);
        }
    }

    private static double solve(Point[] points) {
        int n = points.length;
        int total = n*(n-1)*(n-2)/6;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(findCircumcenter(points[i],points[j],points[k])){
                        count++;
                    }
                }
            }
        }
        return ((double)count)/total;
    }

    private static boolean findCircumcenter(Point a, Point b, Point c) {
        double x1 = a.x;
        double y1 = a.y;
        double x2 = b.x;
        double y2 = b.y;
        double x3 = c.x;
        double y3 = c.y;
        Point p = new Point(x1,y1);
        Point q = new Point(x2,y2);
        Point r = new Point(x3,y3);
        double x = (c.y - a.y) * (b.x * b.x - a.x * a.x + b.y * b.y - a.y * a.y)
                - (b.y - a.y) * (c.x * c.x - a.x * a.x + c.y * c.y - a.y * a.y);
        x = x/(2*(b.y - a.y)*(c.y - a.y) - 2*(b.x - a.x)*(c.x - a.x));

        double y = (c.x - a.x) * (b.x * b.x - a.x * a.x + b.y * b.y - a.y * a.y)
                - (b.x - a.x) * (c.x * c.x - a.x * a.x + c.y * c.y - a.y * a.y);
        y = y/(2*(b.x - a.x)*(c.y - a.y) - 2*(b.y - a.y)*(c.x - a.x));

        Point res = new Point(x,y);
        double distP = Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
        double distQ = Math.sqrt(Math.pow(x-x2,2)+Math.pow(y-y2,2));
        double distR = Math.sqrt(Math.pow(x-x3,2)+Math.pow(y-y3,2));
        return ((distP == distQ) && (distQ == distR));
    }

    static class Point{
        double x,y;
        Point(double x,double y){
            this.x = x;
            this.y = y;
        }
    }
}