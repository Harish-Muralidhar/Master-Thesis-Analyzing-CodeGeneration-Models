/*

*/

import java.util.*;
import java.io.*;
import java.math.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i=0; i<t; i++) {
            String str = br.readLine();
            String[] strArr = str.split("\\s+");
            int DS = Integer.parseInt(strArr[0]);
            int DT = Integer.parseInt(strArr[1]);
            int D = Integer.parseInt(strArr[2]);
            double ds = Math.pow(DS,2);
            double dt = Math.pow(DT,2);
            double d = Math.pow(D,2);
            double result = 0;
            if(D<DS+DT){
                result = Math.sqrt(ds+dt-d)/2;
            }
            else if(D==DS+DT){
                result = 0;
            }
            else{
                result = Math.sqrt(d-ds-dt)/2;
            }
            System.out.println(result);            
        }
    }
}