/*

Time Limit : 2 sec
*/

/*

ReadMe:

Maximum value that can be entered as N is 10^18. But storing set B in memory is not possible for large values of N. 

So, there is a different approach to solve the problem.

For a given set A, if we find number of distinct pairs of subsets X,Y of A such that X is not a subset of Y and 

Y is not a subset of X. 

Now let us call this number as P. Now if we can find P, then the value of R_1 is P/2 and value of R_2 is P/4.


Now how to find P?

We can build up a binary tree of all the distinct pairs of subsets.

Example:

Let A={1,2,3,4}

Then the binary tree will be as follows:

{1,2,3,4}

{1,2,3} {1,2,4} {1,3,4} {2,3,4}

{1,2} {1,3} {1,4} {2,3} {2,4} {3,4}

{1} {2} {3} {4}

From the binary tree, it is clear that, there are 7 distinct pairs of subsets and hence P=7.

Now how to build the binary tree?

If we look carefully, the binary tree can be built recursively.

The root of the binary tree will be A and its left and right subtree will be all the possible pairs of subsets of A except A.

Now, to build the left and right subtree, for each element of A, we can consider that element as a seperate set and then find all the possible pairs of subsets of the remaining elements of A and then join the singleton set to each of the pair.

For example, if we consider A={1,2,3,4}

Let us take 1 as a singleton set. So, the remaining elements of A are {2,3,4}.

Now, we can find all the possible pairs of subsets of {2,3,4} and join the singleton set 1 to each of the pair.

This will give us the left subtree.

Similarly, we can find the right subtree.

*/

import java.util.*;
import java.lang.*;

class Pair{
  long first;
  long second;
  Pair(long a, long b){
    first=a;
    second=b;
  }
}

class GFG {
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            long n=s.nextLong();
            System.out.println(find_ans(n));
        }
    }
    
    public static String find_ans(long n){
        StringBuilder s=new StringBuilder("");
        Pair p=find_pairs(n);
        long r1=p.first;
        long r2=p.second;
        r1=(r1/2)%100000007;
        r2=(r2/4)%100000007;
        s.append(r1);
        s.append(" ");
        s.append(r2);
        return s.toString();
    }
    
    public static Pair find_pairs(long n){
        long r1=0,r2=0;
        if(n==1){
            return new Pair(r1,r2);
        }
        long count=n*(n-1)/2;
        r1=count;
        r2=count;
        long level=2;
        long num=n;
        while(num>3){
            count=count*(n-level+1)/level;
            r1+=count;
            r2+=count;
            level++;
            num--;
        }
        return new Pair(r1,r2);
    }
}