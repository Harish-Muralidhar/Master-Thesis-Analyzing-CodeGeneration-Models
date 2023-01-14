/*
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int tc = scn.nextInt();
        while(tc-->0){
            int n = scn.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n){
        if(n<=11) return n;
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<=n;i++){
            arr[i] = Math.max(arr[i/2] + arr[i/3] + arr[i/4], i);
        }
        return arr[n];
    }
}