/*

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CoinCollector
{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i=0;i<T;i++){
            String[] str = br.readLine().split(" ");
            BigInteger N = new BigInteger(str[0]);
            BigInteger K = new BigInteger(str[1]);
            BigInteger two = new BigInteger("2");
            
            BigInteger coins = N.divide(K);
            BigInteger rem = N.mod(K);
            
            if(rem.equals(BigInteger.ZERO))
                System.out.println(coins.subtract(BigInteger.ONE));
            else
                System.out.println(coins);
        }
    }
}