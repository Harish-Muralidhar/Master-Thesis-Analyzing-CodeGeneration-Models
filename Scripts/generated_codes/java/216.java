

My code:
<code>import java.io.*;
import java.util.*;
import java.math.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i&lt;T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            long N = Long.parseLong(line[0]);
            long K = Long.parseLong(line[1]);

            long out_ = solve(N, K);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static long solve(long N, long K){
        long ans = 1;
        for(long i = 0; i&lt; N-1; i++) {
            ans = (ans * (K-i)) % 1000000007;
        }
        return ans;
    }
}
</code>
