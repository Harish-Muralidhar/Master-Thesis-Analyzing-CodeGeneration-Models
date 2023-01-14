/*

*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            int l1 = sc.nextInt();
            int[] a = new int[l1];
            for(int i = 0;i<l1;i++){
                a[i] = sc.nextInt();
            }
            int l2 = sc.nextInt();
            int[] b = new int[l2];
            for(int i = 0;i<l2;i++){
                b[i] = sc.nextInt();
            }
            boolean done = false;
            for(int i = 0;i<l1;i++){
                if(a[i]==b[0] && i+l2-1<l1){
                    done = true;
                    for(int j = 1;j<l2;j++){
                        if(a[i+j]!=b[j]){
                            done = false;
                            break;
                        }
                    }
                    if(done){
                        System.out.println("Yes");
                        break;
                    }
                }
            }
            if(!done){
                System.out.println("No");
            }
        }
    }
}