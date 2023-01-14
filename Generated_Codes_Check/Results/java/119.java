/*
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[2*m];
        int x[] = new int[m];
        for(int i=0;i<m;i++){
            char ch = sc.next().charAt(0);
            if(ch=='P'){
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[2*i]=a;
                arr[2*i+1]=b;
            }
            else if(ch=='M'){
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr[2*i-2*a]=arr[2*i-2*a]+b;
                arr[2*i-2*a+1]=arr[2*i-2*a+1]+b;
            }
            else if(ch=='B'){
                int a = sc.nextInt();
                x[i]=a;
            }
        }
        for(int i=0;i<m;i++){
            if(x[i]!=0){
                int count=0;
                for(int j=0;j<m;j++){
                    if(x[i]>=arr[2*j] && x[i]<=arr[2*j+1]){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
}