/*

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int k = sc.nextInt();
            if(k==0){
                System.out.println(3);
            }else{
                System.out.println("3."+pi(k));
            }
        }
    }
    private static String pi(int k){
        StringBuilder s = new StringBuilder();
        for(int i=0;i<k;i++){
            s.append(piHelper(i));
        }
        return s.toString();
    }
    private static int piHelper(int k){
        int value = 0;
        for(int i=0;i<=k;i++){
            int u = (i%2520);
            if((u%2)==0){
                value += power(10,k-i,u/2+1)/((u/2+1)*10);
            }else{
                value -= power(10,k-i,u/2+1)/((u/2+1)*10);
            }
        }
        return (value%10);
    }

    private static int power(int base, int exponent, int mod){
        if(exponent==0){
            return 1;
        }else if(exponent==1){
            return base;
        }
        if(exponent%2==0){
            return power((base*base)%mod, exponent/2, mod);
        }else{
            return (base*power((base*base)%mod, exponent/2, mod))%mod;
        }
    }
}