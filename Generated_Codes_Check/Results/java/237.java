/*
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChefChain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int i=0;
        while(i<T){
            String s = in.next();
            char[] c = s.toCharArray();
            int a=0,b=0;
            int count=0;
            if(i!=0)
                System.out.println();
            for(int j=0;j<c.length;j++){
                if(c[j]=='-'){
                    if(j==0){
                        if(b==1){
                            b=0;
                            count++;
                        }else{
                            a=1;
                        }
                    }else{
                        if(c[j-1]=='+'){
                            if(b==1){
                                b=0;
                                count++;
                            }else{
                                a=1;
                            }
                        }else{
                            if(a==1){
                                a=0;
                                count++;
                            }else{
                                b=1;
                            }
                        }
                    }
                }else{
                    if(j==0){
                        if(a==1){
                            a=0;
                            count++;
                        }else{
                            b=1;
                        }
                    }else{
                        if(c[j-1]=='+'){
                            if(a==1){
                                a=0;
                                count++;
                            }else{
                                b=1;
                            }
                        }else{
                            if(b==1){
                                b=0;
                                count++;
                            }else{
                                a=1;
                            }
                        }
                    }
                }
            }
            System.out.println(count);
            i++;
        }
        in.close();
    }
}