

*/

import java.util.*;
import java.io.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int t,k,n,i,j,count,count1,count2,count3;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
          k=sc.nextInt();
          count1=0;count2=0;
          while(k>0)
          {
              n=sc.nextInt();
              count=0;
              while(n>0)
              {
                  if(sc.nextInt()%2==0)
                  count++;
                  n--;
              }
              if(count==0)
              count2++;
              else if(count>0)
              count1++;
              k--;
          }
          if(count1>0 && count2==0)
          {
              System.out.println("EVEN");
          }
          else if(count2>0 && count1==0)
          {
              System.out.println("ODD");
          }
          else
          {
              System.out.println("DON'T PLAY");
          }
          t--;
        }
    }
}