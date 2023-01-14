/*




*/




import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T>0){
            int m = s.nextInt();
            long N = 1;
            for(int i=1;i<=m;i++){
                long p = s.nextLong();
                long k = s.nextLong();
                long temp = 1;
                for(long j=1;j<=k;j++){
                    temp = temp*p;
                }
                N = N*temp;
            }


            long count = 0;
            while(N!=1){
                count++;
                N = phi(N);
            }
            System.out.println(count);
            T--;
        }
    }

    public static long phi(long n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        if(n%2==0){
            return phi(n/2);
        }

        long phi = n;
        for(int i=3;i*i<=n;i=i+2){
            if(n%i==0){
                phi = (phi*(i-1))/i;
            }
            while(n%i==0){
                n=n/i;
            }
        }
        if(n>1){
            phi = (phi*(n-1))/n;
        }
        return phi;
    }
}