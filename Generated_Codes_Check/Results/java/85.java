/*

*/

import java.util.Scanner;

class gcd_problem{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            int count = 0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        b[count++] = a[i];
                    }
                }
            }
            int product = 1;
            for(int i=0;i<count;i++){
                product = (product*b[i])%(1000000007);
            }
            System.out.println(product);
        }
    }
}