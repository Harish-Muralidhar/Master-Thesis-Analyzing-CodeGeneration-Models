/*
 */

public class CompanyRoads {
	
	static Scanner s = new Scanner(System.in);
	static int[][] arr;
	static int[][] arr2;
	static int[][] arr3;
	static ArrayList<Integer> a= new ArrayList<Integer>();
	static ArrayList<Integer> b= new ArrayList<Integer>();
	static ArrayList<Integer> c= new ArrayList<Integer>();
	static ArrayList<Integer> d= new ArrayList<Integer>();
	static ArrayList<Integer> e= new ArrayList<Integer>();
	static ArrayList<Integer> f= new ArrayList<Integer>();
	static int n,m1,m2,u,v,c,p,q;
	static int sum=0,sum1=0;
	
	
	public static void main(String[] args) 
	{
		int t=s.nextInt();
		
		for(int k=1;k<=t;k++)
		{
			n=s.nextInt();
			m1=s.nextInt();
			m2=s.nextInt();
			
			arr = new int[n][n];
			arr2 = new int[n][n];
			arr3 = new int[n][n];
			
			for(int i=0;i<m1;i++)
			{
				u=s.nextInt();
				v=s.nextInt();
				c=s.nextInt();
				arr[u][v]=c;
			}
			
			for(int i=0;i<m2;i++)
			{
				u=s.nextInt();
				v=s.nextInt();
				c=s.nextInt();
				arr2[u][v]=c;
			}
			
			arr3=arr;
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr[i][j]!=0 && arr2[i][j]!=0)
					{
						arr3[i][j]=Math.min(arr[i][j],arr2[i][j]);
					}
					else if(arr[i][j]!=0)
					{
						arr3[i][j]=arr[i][j];
					}
					else if(arr2[i][j]!=0)
					{
						arr3[i][j]=arr2[i][j];
					}
					else
					{
						arr3[i][j]=0;
					}
				}
			}
			
			for(int i=1;i<n;i++)
			{
				sum=0;
				for(int j=0;j<n;j++)
				{
					//System.out.println(i+" "+j);
					for(int m=0;m<n;m++)
					{
						if(arr3[j][i]!=0 && arr3[i][m]!=0)
						{
							if(arr3[j][m]==0)
							{
								arr3[j][m]=arr3[j][i]+arr3[i][m];
							}
							else
							{
								arr3[j][m]=Math.min(arr3[j][m],arr3[j][i]+arr3[i][m]);
							}
						}
					}
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr2[i][j]!=0 && arr3[i][j]==arr2[i][j])
					{
						a.add(i);
						b.add(j);
						c.add(arr2[i][j]);
					}
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr3[i][j]==0)
					{
						System.out.println("Impossible");
						break;
					}
				}
			}
			
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i)+" "+b.get(i)+" "+c.get(i));
			}
			
			for(int i=0;i<n;i++)
			{
				p=0;
				for(int j=0;j<a.size();j++)
				{
					if(a.get(j)==i)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					d.add(i);
				}
			}
			
			for(int i=0;i<n;i++)
			{
				p=0;
				for(int j=0;j<b.size();j++)
				{
					if(b.get(j)==i)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					e.add(i);
				}
			}
			
			for(int i=0;i<n;i++)
			{
				p=0;
				for(int j=0;j<d.size();j++)
				{
					if(d.get(j)==i)
					{
						p=1;
						break;
					}
				}
				if(p==0)
				{
					f.add(i);
				}
			}

			for(int i=0;i<d.size();i++)
			{
				for(int j=0;j<e.size();j++)
				{
					if(arr2[d.get(i)][e.get(j)]!=0 && arr3[d.get(i)][e.get(j)]==arr2[d.get(i)][e.get(j)])
					{
						a.add(d.get(i));
						b.add(e.get(j));
						c.add(arr2[d.get(i)][e.get(j)]);
					}
					else if(arr2[d.get(i)][e.get(j)]!=0 && arr3[d.get(i)][e.get(j)]!=0)
					{
						if(arr3[d.get(i)][e.get(j)]<arr2[d.get(i)][e.get(j)])
						{
							a.add(d.get(i));
							b.add(e.get(j));
							c.add(arr3[d.get(i)][e.get(j)]);
						}
						else
						{
							a.add(d.get(i));
							b.add(e.get(j));
							c.add(arr2[d.get(i)][e.get(j)]);
						}
					}
					else if(arr2[d.get(i)][e.get(j)]==0 && arr3[d.get(i)][e.get(j)]!=0)
					{
						a.add(d.get(i));
						b.add(e.get(j));
						c.add(arr3[d.get(i)][e.get(j)]);
					}
				}
			}
			
			for(int i=0;i<a.size();i++)
			{
				for(int j=0;j<f.size();j++)
				{
					if(arr3[a.get(i)][f.get(j)]!=0)
					{
						if(arr3[a.get(i)][f.get(j)]<arr2[a.get(i)][f.get(j)])
						{
							a.add(a.get(i));
							b.add(f.get(j));
							c.add(arr3[a.get(i)][f.get(j)]);
						}
						else
						{
							a.add(a.get(i));
							b.add(f.get(j));
							c.add(arr2[a.get(i)][f.get(j)]);
						}
					}
					else if(arr2[a.get(i)][f.get(j)]!=0)
					{
						a.add(a.get(i));
						b.add(f.get(j));
						c.add(arr2[a.get(i)][f.get(j)]);
					}
				}
			}
			
			for(int i=0;i<a.size();i++)
			{
				System.out.println(a.get(i)+" "+b.get(i)+" "+c.get(i));
			}
			
			for(int i=0;i<a.size();i++)
			{
				sum=sum+c.get(i);
			}
			
			for(int i=0;i<a.size();i++)
			{
				for(int j=0;j<n;j++)
				{
					for(int m=0;m<n;m++)
					{
						if(arr3[j][a.get(i)]!=0 && arr3[a.get(i)][m]!=0)
						{
							if(arr3[j][m]==0)
							{
								arr3[j][m]=arr3[j][a.get(i)]+arr3[a.get(i)][m];
							}
							else
							{
								arr3[j][m]=Math.min(arr3[j][m],arr3[j][a.get(i)]+arr3[a.get(i)][m]);
							}
						}
					}
				}
			}
			
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(arr3[i][j]==0)
					{
						System.out.println("Impossible");
						break;
					}
				}
			}
			
			for(int i=0;i<a.size();i++)
			{
				if(arr3[a.get(i)][b.get(i)]==c.get(i))
				{
					sum1=sum1+c.get(i);
				}
			}
			
			System.out.println(sum1+" "+sum);
			
			a.clear();
			b.clear();
			c.clear();
			d.clear();
			e.clear();
			f.clear();
		}
	}
}