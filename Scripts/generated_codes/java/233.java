/*

Approach 1:
===========

1) Start from the first row and put all the elements in a set
2) Start from the second row and for every element in the row, do an xor with each element in the set and put the result in a set
3) Now for the set in Step 2, for every element in the set, do an xor with the elements in the third row and put the result in a set
4) Do the same for the 3rd row, 4th row and so on till the last row
5) Return the maximum value of the set in Step 4

Time Complexity: O(n^2)
Auxiliary Space: O(n^2)

Approach 2:
============

1) Start from the first row and put all the elements in a set
2) Start from the second row and for every element in the row, do an xor with each element in the set and put the result in a set
3) Now in the set, for every element in the set, do an xor with the elements in the third row and put the result in a set
4) Do the same for the 3rd row, 4th row and so on till the last row
5) Return the maximum value of the set in Step 4

Time Complexity: O(n^2)
Auxiliary Space: O(n^2)

Approach 3:
===========

1) Start from the first row and put all the elements in a set
2) Start from the second row and for every element in the row, do an xor with each element in the set and put the result in a set
3) Now for the set in Step 2, for every element in the set, do an xor with the elements in the third row and put the result in a set
4) Do the same for the 3rd row, 4th row and so on till the last row
5) Return the maximum value of the set in Step 4

Time Complexity: O(n^2)
Auxiliary Space: O(n)
*/

import java.util.*;
import java.lang.*;

class MaximalXOR
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int N = sc.nextInt();
            int[][] mat = new int[N][N];
            
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < N; j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }
            
            System.out.println(new MaximalXOR().findMaxXOR(mat, N));
        }
    }
    
    int findMaxXOR(int[][] A, int N)
    {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<N; i++)
        {
            set.add(A[0][i]);
        }
        
        for(int i=1; i<N; i++)
        {
            Set<Integer> set2 = new HashSet<Integer>();
            
            for(int j=0; j<N; j++)
            {
                Iterator<Integer> itr = set.iterator();
                
                while(itr.hasNext())
                {
                    set2.add(A[i][j] ^ itr.next());
                }
            }
            
            set = set2;
        }
        
        int max = 0;
        
        Iterator<Integer> itr = set.iterator();
        
        while(itr.hasNext())
        {
            max = Math.max(max, itr.next());
        }
        
        return max;
    }
}