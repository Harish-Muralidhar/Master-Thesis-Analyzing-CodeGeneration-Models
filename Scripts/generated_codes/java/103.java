/*



*/
import java.util.*;
import java.lang.*;
import java.math.*;
class A11
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    int[] a=new int[n];
		    int[] b=new int[n];
		    int x=0,y=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=s.nextInt();
		        if(i>0)
		        {
		            
		            if(a[i]-a[i-1]==a[i-1]-a[i-2]&&a[i]-a[i-1]>0)
		                x=i;
		            else if(a[i]%a[i-1]==0&&a[i]/a[i-1]>0)
		                y=i;
		        }
		    }
		    if(x==0||y==0)
		        continue;
		    int d=a[x]-a[x-1];
		    int c=a[y-1]*a[y]/a[y-1];
		    int k=a[y]/a[y-1];
		    int c1=0,c2=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]-d)
		        {
		            c1++;
		            b[c2++]=a[x]-d;
		        }
		        if(a[i]==c)
		        {
		            b[c2++]=c;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x])
		        {
		            c1++;
		            b[c2++]=a[x];
		        }
		        if(a[i]==c*k)
		        {
		            b[c2++]=c*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+d)
		        {
		            c1++;
		            b[c2++]=a[x]+d;
		        }
		        if(a[i]==c*k*k)
		        {
		            b[c2++]=c*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+2*d)
		        {
		            c1++;
		            b[c2++]=a[x]+2*d;
		        }
		        if(a[i]==c*k*k*k)
		        {
		            b[c2++]=c*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+3*d)
		        {
		            c1++;
		            b[c2++]=a[x]+3*d;
		        }
		        if(a[i]==c*k*k*k*k)
		        {
		            b[c2++]=c*k*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+4*d)
		        {
		            c1++;
		            b[c2++]=a[x]+4*d;
		        }
		        if(a[i]==c*k*k*k*k*k)
		        {
		            b[c2++]=c*k*k*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+5*d)
		        {
		            c1++;
		            b[c2++]=a[x]+5*d;
		        }
		        if(a[i]==c*k*k*k*k*k*k)
		        {
		            b[c2++]=c*k*k*k*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+6*d)
		        {
		            c1++;
		            b[c2++]=a[x]+6*d;
		        }
		        if(a[i]==c*k*k*k*k*k*k*k)
		        {
		            b[c2++]=c*k*k*k*k*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+7*d)
		        {
		            c1++;
		            b[c2++]=a[x]+7*d;
		        }
		        if(a[i]==c*k*k*k*k*k*k*k*k)
		        {
		            b[c2++]=c*k*k*k*k*k*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+8*d)
		        {
		            c1++;
		            b[c2++]=a[x]+8*d;
		        }
		        if(a[i]==c*k*k*k*k*k*k*k*k*k)
		        {
		            b[c2++]=c*k*k*k*k*k*k*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		        c=b[0];
		    }
		    else
		        c=0;
		    c1=0;
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==a[x]+9*d)
		        {
		            c1++;
		            b[c2++]=a[x]+9*d;
		        }
		        if(a[i]==c*k*k*k*k*k*k*k*k*k*k)
		        {
		            b[c2++]=c*k*k*k*k*k*k*k*k*k*k;
		            c1++;
		        }
		    }
		    if(c1==2)
		    {
		        System.out.println(b[0]+" "+b[1]);
		    }
		}
	}
}