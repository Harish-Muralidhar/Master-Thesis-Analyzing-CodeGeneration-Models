
Test #2:
Polygon 1: (62, 73)-(-14, 85)-(-38, 85)-(-38, 44)-(-46, -9), only one black point inside: (12, 3).
Polygon 2: (62, 73)-(-14, 85)-(-38, 85)-(-38, 44), contains no black point inside.
Polygon 3: (62, 73)-(-14, 85)-(-38, 44)-(-46, -9), again, no black points inside.
Polygon 4: (62, 73)-(-14, 85)-(-46, -9), contains no black point inside.
Polygon 5: (62, 73)-(-46, -9)-(-38, 44)-(-38, 85), contains three black points inside: (12, 3), (-11, -13), (-3, 97).
Polygon 6: (62, 73)-(-46, -9)-(-38, 44), contains one black point inside: (12, 3).
Polygon 7: (62, 73)-(-38, 44)-(-38, 85), no black points inside.
Polygon 8: (62, 73)-(-38, 85)-(-46, -9), contains three black points: (-11, -13), (-3, 97), (12, 3).



Solution:


import java.util.*;
import java.lang.*;
import java.io.*;
 
 
class Test {
    
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[][] a=new int[n][2];
		int[][] b=new int[m][2];
		for(int i=0;i<n;i++)
		{
		    a[i][0]=s.nextInt();
		    a[i][1]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
		    b[i][0]=s.nextInt();
		    b[i][1]=s.nextInt();
		}
		int q=s.nextInt();
		while(q-->0)
		{
		    int cnt=0;
		    int k=s.nextInt();
		    int[] p=new int[k];
		    for(int i=0;i<k;i++){
		        p[i]=s.nextInt()-1;
		    }
		    for(int i=0;i<m;i++)
		    {
		        if(inside(a,b[i],p))
		            cnt++;
		    }
		    System.out.println(cnt);
		}
	}
	public static boolean onSegment(int[] p,int[] q,int[] r)
	{
	    if(q[0]<=Math.max(p[0],r[0]) && q[0]>=Math.min(p[0],r[0]) && q[1]<=Math.max(p[1],r[1]) && q[1]>=Math.min(p[1],r[1]))
	        return true;
	    return false;
	}
	public static int orientation(int[] p,int[] q,int[] r)
	{
	    int val= (q[1]-p[1])*(r[0]-q[0]) - (q[0]-p[0])*(r[1]-q[1]);
	    if(val==0) return 0;
	    return (val>0)?1:2;
	}
	public static boolean doIntersect(int[] p1,int[] q1,int[] p2,int[] q2)
	{
	    int o1=orientation(p1,q1,p2);
	    int o2=orientation(p1,q1,q2);
	    int o3=orientation(p2,q2,p1);
	    int o4=orientation(p2,q2,q1);
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
	public static boolean inside(int[][] a,int[] b,int[] p)
	{
	    int n=p.length;
	    if(n<3)
	        return false;
	    int extreme[]={Integer.MAX_VALUE,b[1]};
	    int i=0,cnt=0;
	    do{
	        int next=(i+1)%n;
	        if(doIntersect(a[p[i]],a[p[next]],b,extreme))
	        {
	            if(orientation(a[p[i]],b,a[p[next]])==0)
	                return onSegment(a[p[i]],b,a[p[next]]);
	            cnt++;
	        }
	        i=next;
	    }while(i!=0);
	    
	    return (cnt%2==1);
	}
}