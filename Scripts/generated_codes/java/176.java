/*

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class ChefAndLaddu {
    public static void main(String args[] ) throws Exception {
        
        FastReader fr = new FastReader();
        int testCases = fr.nextInt();
        for(int i=0; i<testCases; i++){
            int c = fr.nextInt();
            int s = fr.nextInt();
            long k = fr.nextLong();
            System.out.println(getNthNumber(c, s, k));
        }
    }

    public static long getNthNumber(int c, int s, long k){
        long ans=0;
        long start = (long)Math.pow(c, s-1);
        long end = (lo