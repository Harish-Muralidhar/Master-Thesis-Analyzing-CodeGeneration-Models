

A:

<code>import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      while(t--&gt;0) {
         int n = sc.nextInt();
         int[] ar = new int[1000005];
         int ans = 0;
         for(int i=0;i&lt;n;i++) {
            int val = sc.nextInt();
            ar[val]++;
         }
         for(int i=1;i&lt;=1000001;i++) {
            if(ar[i]&gt;0) {
               int min = (ar[i]-1)/2;
               ans += min;
            }
         }
         System.out.println(ans);
      }
   }
}
</code>
