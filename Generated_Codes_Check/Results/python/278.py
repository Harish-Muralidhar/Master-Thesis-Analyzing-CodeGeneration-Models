'''

Previous Question
Next Question


Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.

The idea is to use Dynamic Programming to solve this problem. We define a recursive function count(n) to count the number of ways to reach the nth step. The function is shown below.

count(n) = count(n-1) + count(n-2)
The above expression is actually the expression for Fibonacci numbers, but there is one thing to notice, the value of count(n) is equal to Fibonacci(n+1).
This can be easily seen from above expression. The first and second values of the series are 1 and 2, this is because we can reach the first step in one way and second step in two ways.
Below is the implementation of the above idea.
filter_none
edit
play_arrow

brightness_4
// Returns number of ways to reach s'th stair
int countWays(int s)
{
    return fib(s + 1);
}

// Returns n'th fibonacci number
int fib(int n)
{
    int f[n+1];
    int i;
    
    // 0th and 1st number of the series are 0 and 1
    f[0] = 0;
    f[1] = 1;
    
    for (i = 2; i <= n; i++)
    {
       // Add the previous 2 numbers in the series
       // and store it
       f[i] = f[i-1] + f[i-2];
    }
    
    return f[n];
}

// Driver program to test above functions
int main ()
{
  int s = 4;
  printf("Number of ways = %d", countWays(s));
  getchar();
  return 0;
}
Output:

Number of ways = 5
Time Complexity: O(N) where N is the number of stairs.

Please note that the above code is just to illustrate the basic idea, it can be optmized to work in constant space.

Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above.

'''

def count_ways(n):
    count=[0]*(n+1)
    count[0]=0
    count[1]=1
    count[2]=2
    for i in range(3,n+1):
        count[i]=count[i-1]+count[i-2]
    return count[n]

def num1(n):
    count=0
    while n:
        n=n&(n-1)
        count+=1
    return count

test_cases=int(input())
while test_cases>0:
    n=int(input())
    g=int(input())
    if (num1(count_ways(n))==g):
        print("CORRECT")
    else:
        print("INCORRECT")
    test_cases-=1