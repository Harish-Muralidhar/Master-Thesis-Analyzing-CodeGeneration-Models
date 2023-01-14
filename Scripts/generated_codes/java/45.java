
Solution:

import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        int t;
        Scanner in=new Scanner(System.in);
        t=in.nextInt();
        while(t!=0)
        {
            String s=in.next();
            int n=s.length();
            int flag=0;
            for(int i=0;i<n;i++)
            {
                int count1=0,count2=0;
                for(int j=0;j<n;j++)
                {
                    if(s.charAt(i)==s.charAt(j))
                    count1++;
                }
                for(int j=0;j<n;j++)
                {
                    if(s.charAt(j)!=s.charAt(i))
                    count2++;
                }
                if(count1==count2)
                flag=1;
            }
            if(flag==1)
            System.out.println("YES");
            else
            System.out.println("NO");
            t--;
        }
    }
}