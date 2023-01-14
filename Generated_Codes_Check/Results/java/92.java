/*


*/
import java.util.*;
import java.io.*;

class Main {
  public static void main(String[] args) throws IOException {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int Q = in.nextInt();
    int[] A = new int[N];
    for(int i = 0; i < N; i++)
        A[i] = in.nextInt();
    SegmentTree st = new SegmentTree(A,N);
    StringBuilder sb = new StringBuilder();
    while(Q > 0) {
        int query = in.nextInt();
        int L = in.nextInt();
        int R = in.nextInt();
        if(query == 0) {
            sb.append(st.min(L-1,R-1,1,0,N-1)).append("\n");
        } else {
            int X = in.nextInt();
            st.update(L-1,R-1,X,1,0,N-1);
        }
        Q--;
    }
    System.out.print(sb);
  }
}

class SegmentTree {
    int[] tree;
    int[] A;
    SegmentTree(int[] arr, int n) {
        int h = (int)Math.ceil(Math.log(n)/Math.log(2));
        int max = 2*(int)Math.pow(2,h)-1;
        tree = new int[max];
        A = new int[n];
        for(int i = 0; i < n; i++)
            A[i] = arr[i];
        construct(0,n-1,1);
    }
    int construct(int ss, int se, int index) {
        if(ss == se) {
            tree[index] = A[ss];
            return A[ss];
        }
        int mid = (ss+se)/2;
        int left = construct(ss,mid,2*index);
        int right = construct(mid+1,se,2*index+1);
        tree[index] = Math.min(left,right);
        return tree[index];
    }
    int min(int qs, int qe, int index, int ss, int se) {
        if(qs <= ss && qe >= se)
            return tree[index];
        if(qe < ss || qs > se)
            return Integer.MAX_VALUE;
        int mid = (ss+se)/2;
        int left = min(qs,qe,2*index,ss,mid);
        int right = min(qs,qe,2*index+1,mid+1,se);
        return Math.min(left,right);
    }
    void update(int qs, int qe, int newval, int index, int ss, int se) {
        if(qs <= ss && qe >= se) {
            tree[index] &= newval;
            return;
        }
        if(qe < ss || qs > se)
            return;
        int mid = (ss+se)/2;
        update(qs,qe,newval,2*index,ss,mid);
        update(qs,qe,newval,2*index+1,mid+1,se);
        tree[index] = Math.min(tree[2*index],tree[2*index+1]);
    }
}