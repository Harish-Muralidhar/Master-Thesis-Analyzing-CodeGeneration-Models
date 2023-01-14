/*

*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        
        int testCases = s.nextInt();
        
        for(int i = 0; i < testCases; i++) {
            int N = s.nextInt();
            int K = s.nextInt();
            int M = s.nextInt();
            
            List<Integer> A = new ArrayList<Integer>();
            List<Integer> B = new ArrayList<Integer>();
            List<Integer> C = new ArrayList<Integer>();
            List<Integer> D = new ArrayList<Integer>();
            
            for(int j = 0; j < N; j++) {
                A.add(s.nextInt());
            }
            
            for(int j = 0; j < N; j++) {
                B.add(s.nextInt());
            }
            
            for(int j = 0; j < K; j++) {
                C.add(s.nextInt());
            }
            
            for(int j = 0; j < M; j++) {
                D.add(s.nextInt());
            }
            
            int minSum = Integer.MAX_VALUE;
            
            for(int j = 0; j < C.size(); j++) {
                
                List<Integer> A1 = new ArrayList<Integer>(A);
                
                for(int k = 0; k < N; k++) {
                    
                    if(A1.get(k) >= C.get(j)) {
                        A1.set(k, A1.get(k) - C.get(j));
                    }
                }
                
                for(int k = 0; k < D.size(); k++) {
                
                    List<Integer> B1 = new ArrayList<Integer>(B);
                    List<Integer> A2 = new ArrayList<Integer>(A1);
                    
                    for(int l = 0; l < N; l++) {
                        
                        if(A2.get(l) > B1.get(l)) {
                            B1.set(l, B1.get(l) + D.get(k));
                        }
                    }
                    
                    int sum = 0;
                    
                    for(int l = 0; l < N; l++) {
                        sum +=  A2.get(l) - B1.get(l);
                    }
                    
                    if(sum < minSum) {
                        minSum = sum;
                    }
                    
                }
            }
            System.out.println(minSum);
        }

    }
}