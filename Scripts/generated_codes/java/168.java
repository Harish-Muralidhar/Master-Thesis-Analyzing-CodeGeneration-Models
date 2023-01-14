/*



//--------------------------WRONG--------------------------------
import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int k=0;k<t;k++)
        {
            int x=in.nextInt();
            in.nextLine();
            BigInteger n=in.nextBigInteger();
            BigInteger c=new BigInteger("8");
            BigInteger c1=new BigInteger("5");
            BigInteger c2=new BigInteger("3");
            BigInteger n1=n.add(BigInteger.valueOf(1));
            BigInteger quo=n1.divide(c);
            BigInteger rem=n1.remainder(c);
            BigInteger rem1=n1.remainder(c1);
            BigInteger rem2=n1.remainder(c2);
            if(rem.compareTo(BigInteger.valueOf(0))==0&&rem1.compareTo(BigInteger.valueOf(0))==0&&rem2.compareTo(BigInteger.valueOf(0))==0)
                System.out.println(n);
            else
            {
                BigInteger n2=n1.divide(c1);
                BigInteger rem3=n2.remainder(c1);
                BigInteger rem4=n2.remainder(c2);
                if(rem3.compareTo(BigInteger.valueOf(0))==0&&rem4.compareTo(BigInteger.valueOf(0))==0)
                    System.out.println(n1.divide(c1));
                else
                {
                    BigInteger n3=n1.divide(c2);
                    BigInteger rem5=n3.remainder(c2);
                    if(rem5.compareTo(BigInteger.valueOf(0))==0)
                        System.out.println(n1.divide(c2));
                    else
                        System.out.println("-1");
                }
            }
        }

    }
}
*/


//--------------------------------------CORRECT ANSWER---------------------------

/*
import java.util.*;
import java.math.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int k=0;k<t;k++)
        {
            int x=in.nextInt();
            String s=in.next();
            String s1=new String();
            String s2=new String();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='3')
                    s1+='8';
                else if(s.charAt(i)=='4')
                    s1+='7';
                else if(s.charAt(i)=='7')
                    s1+='4';
                else if(s.charAt(i)=='8')
                    s1+='3';
                else
                    s1+=s.charAt(i);
            }
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='6')
                    s2+='5';
                else if(s.charAt(i)=='9')
                    s2+='6';
                else
                    s2+=s.charAt(i);
            }
            BigInteger n=new BigInteger(s);
            BigInteger n1=new BigInteger(s1);
            BigInteger n2=new BigInteger(s2);
            if(n.compareTo(n1)<=0&&n.compareTo(n2)>=0)
                System.out.println(s);
            else if(n.compareTo(n1)>0&&n.compareTo(n2)>0)
                System.out.println(n2);
            else if(n.compareTo(n1)<0&&n.compareTo(n2)<0)
                System.out.println(n1);
            else
                System.out.println("-1");
        }

    }
}

*/