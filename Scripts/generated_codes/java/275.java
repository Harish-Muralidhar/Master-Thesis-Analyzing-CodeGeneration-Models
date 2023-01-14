/*

*/



import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            // input
            long n = sc.nextLong();
            // solution
            long ans = 0;
            if(n == 1){
                ans = 2;
            }else if(n == 2){
                ans = 4;
            }else if(n == 3){
                ans = 6;
            }else{
                long n_1 = n/2;
                long n_2 = n-n_1;
                long a = n_1+1;
                long b = n_2+1;
                ans = a*b;
            }
            System.out.println(ans%1000000007);
        }
    }
}