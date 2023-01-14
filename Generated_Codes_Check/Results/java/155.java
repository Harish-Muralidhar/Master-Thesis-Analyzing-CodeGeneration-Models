/*
  Subtask 4: (No partial credit)

Original Constraints


*/
import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int tt=0;tt<t;tt++){
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            int l=str.length();
            int[][] a=new int[l][l];
            for(int i=0;i<l;i++){
                a[i][i]=1;
            }
            for(int i=0;i<l-1;i++){
                if(str.charAt(i)==str.charAt(i+1))
                    a[i][i+1]=1;
                else
                    a[i][i+1]=2;
            }
            for(int i=2;i<l;i++){
                for(int j=0;j<l-i;j++){
                    if(str.charAt(j)==str.charAt(j+i) && a[j+1][i+j-1]==1){
                        a[j][i+j]=1;
                    }
                    else{
                        int min=Integer.MAX_VALUE;
                        for(int k=j;k<i+j;k++){
                            int x=a[j][k]+a[k+1][i+j];
                            if(min>x)
                                min=x;
                        }
                        a[j][i+j]=min;
                    }
                }
            }
            System.out.println(a[0][l-1]);
        }
    }
}