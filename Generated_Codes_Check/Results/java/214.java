/*

(4, 2, 1, 3) -> (4, 4) -> (4)


(1, 3, 2, 4) -> (3, 4) -> (4)


(2, 1, 4, 3) -> (2, 4) -> (4)


(3, 4, 1, 2) -> (3, 4) -> (4)


(4, 3, 2, 1) -> (4, 4) -> (4)


(2, 3, 1, 4) -> (2, 3) -> (3, 4) -> (4)


(1, 4, 3, 2) -> (3, 4) -> (4)


(3, 1, 2, 4) -> (3, 2) -> (3, 4) -> (4)


(4, 2, 3, 1) -> (4, 3) -> (4)


(1, 2, 4, 3) -> (2, 4) -> (4)


(2, 4, 1, 3) -> (4, 4) -> (4)


(3, 4, 2, 1) -> (3, 4) -> (4)


(4, 3, 1, 2) -> (4, 4) -> (4)


(4, 1, 2, 3) -> (4, 4) -> (4)


(2, 3, 4, 1) -> (2, 3) -> (3, 4) -> (4)


(1, 4, 2, 3) -> (2, 4) -> (4)


(3, 1, 4, 2) -> (3, 4) -> (4)


(4, 2, 3, 1) -> (4, 4) -> (4)

*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class Knights_Tournaments
{

	static long count_final=0;
	static long mod=1000000009;
	static int N;
	static int K;
	static long count_initial=1;
	static long intermediate_count=0;
	static int not_final_count=0;


	public static void count_initial_combinations(ArrayList<Integer> list,int count)
	{

		if(count==K)
		{
			count_initial=(count_initial%mod+1%mod)%mod;
			return;
		}

		count_initial_combinations(list,count+1);
		
		int n=list.size();
		int j=0;
		while(list.get(j)==0)
		{
			j++;
		}
		int i=list.get(j);
		list.remove(j);
		list.add(0);
		count_initial_combinations(list,count+1);

		list.remove(n-1);
		list.add(j,i);
	}

	public static void count_intermediate_combinations(ArrayList<Integer> l1,int count)
	{
		if(count==K-1)
		{
			int i=1;
			while(l1.get(i)==0)
			{
				i++;
			}
			intermediate_count=intermediate_count%mod+1%mod;
			return;
		}

		ArrayList<Integer> l2=new ArrayList<Integer>(l1);
		ArrayList<Integer> l3=new ArrayList<Integer>(l1);

		count_intermediate_combinations(l2,count+1);
		int n=l1.size();
		int j=0;
		while(l1.get(j)==0)
		{
			j++;
		}
		int i=l1.get(j);
		l1.remove(j);
		l1.add(0);
		count_intermediate_combinations(l1,count+1);

		l1.remove(n-1);
		l1.add(j,i);


		int k=l3.size()-1;
		while(l3.get(k)==0)
		{
			k--;
		}
		int x=l3.get(k);
		l3.remove(k);
		l3.add(0);
		count_intermediate_combinations(l3,count+1);

		l3.remove(n-1);
		l3.add(k,x);

		return;
	}


	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		K=sc.nextInt();
		N=(int)Math.pow(2,K);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<N;i++)
		{
			list.add(i+1);
		}
		
		count_initial_combinations(list,0);
		int count=0;
		for(int i=1;i<N;i++)
		{
			ArrayList<Integer> l1=new ArrayList<Integer>(list);
			intermediate_count=0;
			count_intermediate_combinations(l1,1);
			count_final=(count_final%mod+intermediate_count%mod)%mod;
			System.out.println((count_final*count_initial)%mod);
			count_final=0;
		}
		count_final=(count_final%mod+count_initial%mod)%mod;
		System.out.println((count_final*count_initial)%mod);
	}
}