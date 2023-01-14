"""


#include<stdlib.h>
#include<stdio.h>

int main()
{
    int T,N,K,x,y,i;
    int arr[10];
    scanf("%d",&T);
    while(T--)
    {
        scanf("%d %d",&N,&K);
        while(K--)
        {
            scanf("%d %d",&x,&y);
            for(i=0;i<N;i++)
                arr[i]=0;

            for(i=x;i<=y;i++)
                arr[i]++;
        }
        for(i=0;i<N;i++)
        {
            if(arr[i]%2==1)
                printf("(");
            else
                printf(")");
        }
        printf("\n");
    }
    return 0;
}


"""

"""

Question:

The first line of the input contains an integer T denoting the number of test cases. The description of T test cases follows.

Each test case consists of a single line containing the string S.

Output:

For each test case, in a new line, print a single integer denoting the count of the substrings.

Constraints:

1 <= T <= 10
1 <= |S| <= 100000

Example:

Input:
2
1234
5678
Output:
0
0

"""
"""

#include<stdio.h>
#include<string.h>

int main()
{
    int t,i,j,n,k,m,count,l,flag;
    char s[100005];
    scanf("%d",&t);
    while(t--)
    {
        m=0;
        scanf("%s",&s);
        l=strlen(s);
        count=0;
        for(i=0;i<l;i++)
        {
            for(j=i;j<l;j++)
            {
                m=m*10+s[j]-48;
                if(m%4==0)
                    count++;
            }
            m=0;
        }
        printf("%d\n",count);
    }
    return 0;
}

"""

"""

Question:

Alice is playing a game with Bob. There are some cards in a deck, numbered from 1 to n.

Alice and Bob play a game. In the game, Bob plays an integer b. Alice takes turns choosing integers a1, a2, a3 …. The game ends when Bob plays 0.

Alice wins the game if there is any ai, such that ai = bi. If there are multiple ai that are equal to bi, Alice only needs to find one of them to win the game.

Given a sequence of integers a1, a2, a3 … aN, determine how many times Alice wins.

Input:

The first line of input contains a single integer T denoting the number of test cases.

The first line of each test case contains an integer n denoting the number of ai.

The second line of each test case contains n space-separated integers a1, a2, a3 … aN denoting the sequence.

The third line of each test case contains an integer b, denoting Bob's initial choice.

The fourth line of each test case contains an integer m denoting the number of turns played.

The fifth line of each test case contains m space-separated integers b1, b2, b3 … bM denoting the choice of Bob over the game.

Output:

For each test case, print the number of times Alice wins.

Constraints:

1 ≤ T ≤ 100
1 ≤ n ≤ 103
1 ≤ ai ≤ 106
1 ≤ b ≤ 106
1 ≤ m ≤ 103
1 ≤ bi ≤ 106

Example:

Input:
2
2
2 3
2
2
2 1
1
1
1
1
1
1
1
1
1
1

Output:
2
2

"""

"""
#include<stdio.h>

int main()
{
    int t,i,j,n,m,b,count;
    scanf("%d",&t);
    while(t--)
    {
        count=0;
        scanf("%d",&n);
        int a[n];
        for(i=0;i<n;i++)
            scanf("%d",&a[i]);
        scanf("%d",&b);
        scanf("%d",&m);
        for(j=0;j<m;j++)
        {
            scanf("%d",&b);
            for(i=0;i<n;i++)
            {
                if(a[i]==b)
                    count++;
            }
        }
        printf("%d\n",count);
    }
    return 0;
}
"""

"""

Question:

Alice and Bob are playing the following game. There is an integer array, a, of size n. They play n rounds. For each round, they pick a number, b[i], from the array. Then, they simultaneously play one of the following two operations

Concatenate the current number with b[i]
Sum the current number with b[i]
Let's say the current number is x. If the current number and b[i] have the same number of digits and the first digits of both numbers are equal, then Alice plays the first operation, and Bob plays the second operation. Otherwise, they play the operations in the opposite order.

The player who cannot play the desired operation loses the game.

Alice starts the game.

You are given an array, a, and an integer, k, denoting the index of the element the players will pick during the kth round.

If Alice cannot win the game, print "Bob" (without quotes). Otherwise, print "Alice".

Input:

The first line of input contains an integer T denoting the number of test cases.

The first line of each test case contains an integer n, denoting the number of elements in the array a.

The second line of each test case contains n space-separated integers a1, a2, a3 … an, denoting the elements of the array.

The third line of each test case contains an integer, k.

Output:

For each test case, print the winner of the game in a new line.

Constraints:

1 ≤ T ≤ 10
1 ≤ n ≤ 106
1 ≤ ai ≤ 1016
1 ≤ k ≤ n

Example:

Input:
2
5
1 2 3 4 5
3
6
1 2 3 4 5 6
4

Output:
Alice
Bob

"""

"""
#include<stdio.h>
#include<math.h>
#include<stdlib.h>

int main()
{
    int t,n,k,i,j,flag=0;
    char a[100005],b[100005];
    long long int a1[100005],b1[100005],c1[100005],c;
    scanf("%d",&t);
    while(t--)
    {

        flag=0;
        scanf("%d",&n);
        for(i=0;i<n;i++)
        {
            scanf("%lld",&a1[i]);
        }
        scanf("%d",&k);
        c=a1[k-1];
        c1[0]=c;
        for(i=1;i<n;i++)
        {
            if(c/10==a1[i]/10)
            {
                c1[i]=c+a1[i];
                c=c+a1[i];
            }
            else
            {
                c1[i]=c*10+a1[i];
                c=c*10+a1[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(c1[i]%2==0)
                flag++;
        }
        if(flag==n-1)
            printf("Alice\n");
        else
            printf("Bob\n");
    }
    return 0;
}
"""

"""

Question:

You are given an expression containing digits and the operations +, -, * and /. Extract each operation from the expression and print the number of each operation. The operations in the expression should be separated from the numbers by a single space.

Input:

The first line of input contains an integer T denoting the number of test cases.

The first line of each test case contains a string denoting the expression.

Output:

Print the number of each operation on a new line.

Constraints:

1 ≤ T ≤ 50
2 ≤ |S| ≤ 100

Example:

Input:
2
1+2*3-10
1/2+3*4

Output:
1 2 1 1
1 1 3 1

"""

"""
#include<stdio.h>
#include<string.h>

int main()
{
    int t;
    scanf("%d",&t);
    while(t--)
    {
        char s[100];
        int sum=0,sub=0,mul=0,div=0,i;
        scanf("%s",&s);
        for(i=0;i<strlen(s);i++)
        {
            if(s[i]=='+')
                sum++;
            else if(s[i]=='-')
                sub++;
            else if(s[i]=='*')
                mul++;
            else if(s[i]=='/')
                div++;
        }
        printf("%d %d %d %d\n",sum,sub,mul,div);
    }
    return 0;
}

"""

"""

Question:

Write a python code for the following question.
Import the necessary libraries

Wonderland is ruled by the Queen of Hearts and her army of cards. The Queen has n boxes placed in a line. Each box is painted with either red or black, and the Queen wants to make all the boxes red.

The Queen has a very special wand that can turn any color to any color. The Queen must use the wand exactly once to make all the boxes red. There are m rules the Queen must follow while using the wand:

She can only change the color of a single box.
She must change the color of the box that is exactly to the left of the currently painted box.
She cannot change the color of the first box, i.e., the box that doesn't have a box to its left.
She can change the color of the last box.
Given the initial colors of the boxes, the Queen wants to know the minimum number of times she needs to use the wand to make all the boxes red.

Input:

The first line of input contains two integers n and m.

The second line of input contains n integers c1, c2, c3 … cn, where ci denotes the color of the ith box. 0 denotes the color black and 1 denotes the color red.

Each of the next m lines contains three integers l, r, x, denoting the following:

The Queen cannot change the color of the box numbered l from the left.
The Queen cannot change the color of the box numbered r from the left.
The Queen must change the color of the box numbered x from the left.
Output:

For each test case, print a single line containing one integer ― the minimum number of times the Queen needs to use the wand.

Constraints:

1 ≤ n ≤ 105
1 ≤ m ≤ 105
0 ≤ ci ≤ 1
1 ≤ l ≤ r ≤ n
1 ≤ x ≤ n

Example:

Input:
6 2
1 0 0 0 1 1
2 3 3
5 6 1

Output:
1

Explanation:

In the given example, the Queen can change the color of the first box in one wand move and make all the boxes red.

"""

"""

#include<stdio.h>
#include<stdlib.h>

int max(int a, int b)
{
    return (a > b)? a: b;
}

int main()
{
    int n,m,i,j,l,r,x,count,k;
    scanf("%d %d",&n,&m);
    int a[n];
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(k=0;k<m;k++)
    {
        count=0;
        scanf("%d %d %d",&l,&r,&x);
        for(i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                if(i<x-1)
                {
                    if(x-i>=l)
                        count++;
                }
                else if(i>=x)
                {
                    if(i-x+1<=r)
                        count++;
                }
            }
        }
        if(a[x-1]==0)
            count++;
        printf("%d\n",count);
    }
    return 0;
}

"""


"""

Question:

Write a python code for the following question.
Import the necessary libraries.

The King of Wonderland has a string, s. He wants to know the length of the longest non-empty prefix of s that is also a suffix of s. Can you help him?

Note: The prefix of a string s is the substring obtained by removing the final character from s. The suffix of s is the substring obtained by removing the first character from s.

Input:

The first line of input contains an integer T denoting the number of test cases.

The first line of each test case contains a string, s.

Output:

For each test case, print a single line containing one integer ― the length of the longest prefix of s that is also a suffix of s.

Constraints:

1 ≤ T ≤ 10
2 ≤ |s| ≤ 106

Example:

Input:
1
aabaa

Output:
2

Explanation:

The longest prefix of s that is also a suffix of s is "aa". Its length is 2.

"""

"""

#include<stdio.h>
#include<string.h>

int main()
{
    int t,i,j,k,l1,l2,flag;
    char s[100005];
    scanf("%d",&t);
    while(t--)
    {
        flag=0;
        scanf("%s",&s);
        l1=strlen(s);
        for(i=1;i<l1;i++)
        {
            if(s[0]==s[i])
            {
                for(j=1;j<i;j++)
                {
                    if(s[j]!=s[i+j])
                        break;
                    else
                        flag=1;
                }
            }
            if(flag==1)
            {
                printf("%d\n",i);
                break;
            }
        }
    }
    return 0;
}

"""


"""

Question:

You are given an expression containing digits and the operations +, -, * and /. Extract each operation from the expression and print the number of each operation. The operations in the expression should be separated from the numbers by a single space.

Input:

The first line of input contains an integer T denoting the number of test cases.

The first line of each test case contains a string denoting the expression.

Output:

Print the number of each operation on a new line.

Constraints:

1 ≤ T ≤ 50
2 ≤ |S| ≤ 100

Example:

Input:
2
1+2*3-10
1/2+3*4

Output:
1 2 1 1
1 1 3 1

"""

"""

#include<stdio.h>

int main()
{
    int n,t,i,j;
    char s[100];
    scanf("%d",&t);
    while(t--)
    {
        int a=0,b=0,c=0,d=0;
        scanf("%s",&s);
        n=strlen(s);
        for(i=0;i<n;i++)
        {
            if(s[i]=='+')
                a++;
            else if(s[i]