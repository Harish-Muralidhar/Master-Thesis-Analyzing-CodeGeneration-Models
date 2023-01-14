/*
*/

import java.util.Scanner;

class ChefAndAmazingness {
   public static void main(String[] args) {
      try {
         Scanner in = new Scanner(System.in);
         int t = in.nextInt();
         int[] arr = new int[t];

         for(int i = 0; i < t; i++)
            arr[i] = in.nextInt();
         for(int i = 0; i < t; i++)
            System.out.println(findSum(arr[i]));
      } catch (Exception e) {
         System.out.println(e);
      }
   }

   static int findSum(int n) {
      int sum = 0;
      for(int i = 1; i <= n; i++)
         sum += findAmazingness(i);
      return sum;
   }

   static int findAmazingness(int n) {
      int amazingness = 0;
      String str = String.valueOf(n);
      int[] arr = new int[str.length()];
      for(int i = 0; i < str.length(); i++)
         arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
      for(int i = 0; i < arr.length; i++) {
         int val = 0;
         for(int j = i; j < arr.length; j++) {
            val ^= arr[j];
            if(val == 0 || val == 1)
               amazingness += val;
         }
      }
      return amazingness;
   }
}