/*

*/

import java.util.*;

class Java_Substitution_Cypher
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            String s = sc.next();
            char[] ch = s.toCharArray();
            String str = sc.next();
            char[] ch1 = str.toCharArray();
            for(int j=0;j<ch1.length;j++)
            {
                int val = ch1[j];
                if(val>=65 && val<=90)
                {
                    val = val+32;
                    char c = ch[val-97];
                    System.out.print((char)(c-32));
                }
                else if(val>=97 && val<=122)
                {
                    char c = ch[val-97];
                    System.out.print(c);
                }
                else
                    System.out.print(ch1[j]);
            }
            System.out.println();
        }
    }
}