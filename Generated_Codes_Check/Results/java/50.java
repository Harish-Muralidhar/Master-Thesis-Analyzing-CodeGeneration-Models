
Solution:

import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            int b[]=new int[n];
            int c[]=new int[n];
            int d[]=new int[n];
            int i;
            for(i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                c[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                d[i]=b[i]*c[i];
            }
            int index=0;
            int max=d[0];
            for(i=1;i<n;i++)
            {
                if(max<d[i])
                {
                    max=d[i];
                    index=i;
                }
            }
            System.out.println(index+1);
            t--;
        }
    }
}


Question:

Write a Java code for the following question.
Import the necessary libraries.
You are given a string S of length n.
Your task is to print the lexicographically largest substring of S, that is not a palindrome.
If all substrings of S are palindromes, print a single line containing the string "no solution".

Input
The first line of the input contains an integer T denoting the number of test cases.
The first line of each test case contains an integer n.
The second line of each test case contains a string S denoting the original string.

Output
For each test case, output a single line containing the lexicographically largest substring of S that is not a palindrome.

Constraints
1 ≤ T ≤ 10
1 ≤ n ≤ 1000
S is a lowercase English letter string.

Example
Input:
1
13
abcbacbcbabcb

Output:
bcbacbcba
Explanation
The string S is:
abcbacbcbabcb
The largest non-palindrome substring is:
bcbacbcba

Solution:

import java.util.*;

public class Main {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t!=0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            String max="";
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    String s1=s.substring(i,j+1);
                    int n1=s1.length();
                    int flag=0;
                    for(int k=0;k<n1/2;k++)
                    {
                        if(s1.charAt(k)!=s1.charAt(n1-1-k))
                        {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==1)
                    {
                        if(s1.compareTo(max)>0)
                        {
                            max=s1;
                        }
                    }
                }
            }
            if(max.length()==0)
            {
                System.out.println("no solution");
            }
            else
            {
                System.out.println(max);
            }
            t--;
        }
    }
}