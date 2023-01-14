/*
Required sum = 6.0

 */
import java.util.*;


class ProbablityMatix {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            int m = in.nextInt();
            double sum = 0;
            for(int j=1;j<=n;j++){
                for(int k=1;k<=m;k++){
                    sum+=getProb(n,m,j,k);
                }
            }
            System.out.println(sum);
        }
    }

    private static double getProb(int n, int m, int i, int j) {
        if(i==1&&j==1){
            return 1;
        }else{
            if(i+j>n+m){
                return 0;
            }else{
                return (1.0/2.0)*(getProb(n,m,i-1,j)+getProb(n,m,i,j-1));
            }
        }
    }
}