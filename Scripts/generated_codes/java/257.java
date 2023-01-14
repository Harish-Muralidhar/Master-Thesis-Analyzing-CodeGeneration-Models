/*
Explanation
Example 1
There will be only 1 distinct point in which the dots will coincide.

Example 2
There will be only 1 distinct point in which the dots will coincide.

Example 3
There will be only 3 distinct point in which the dots will coincide.
*/

//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            
            if(s1 == 0 || s2 ==0){
                System.out.println("0");
            }
            else if(s1 == s2 || s1 == -1*s2){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }
        }

    }
}