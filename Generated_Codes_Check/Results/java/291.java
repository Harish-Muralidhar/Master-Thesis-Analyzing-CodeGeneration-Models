/*

*/

import java.util.Scanner;
import java.util.Arrays;


public class TrafficCones
{
	public static void main(String[] args)
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			String line = sc.nextLine();

			int caseCount = Integer.parseInt(line);
			if(caseCount < 1 || caseCount > 25)
			{
				throw new Exception();
			}

			int[][] caseInfo = new int[caseCount][3];
			for(int i=0; i<caseCount; i++)
			{
				line = sc.nextLine();
				String[] split = line.split(" ");
				if(split.length != 2)
				{
					throw new Exception();
				}
				caseInfo[i][0] = Integer.parseInt(split[0]);
				caseInfo[i][1] = Integer.parseInt(split[1]);

				line = sc.nextLine();
				caseInfo[i][2] = Integer.parseInt(line);
			}

			for(int i=0; i<caseCount; i++)
			{
				System.out.println(findLargestCar(caseInfo[i][0], caseInfo[i][1], caseInfo[i][2], sc));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static double findLargestCar(int r, int R, int N, Scanner sc)
	{
		double largestCar = 0;
		int[] coneSizes = new int[N];
		for(int i=0; i<N; i++)
		{
			String line = sc.nextLine();
			String[] split = line.split(" ");
			if(split.length != 2)
			{
				throw new Exception();
			}
			int x = Integer.parseInt(split[0]);
			int y = Integer.parseInt(split[1]);
			int dist = x*x + y*y;
			if(dist < r*r || dist > R*R)
			{
				throw new Exception();
			}
			coneSizes[i] = dist;
		}

		Arrays.sort(coneSizes);
		for(int i=0; i<N-1; i++)
		{
			if(coneSizes[i] == coneSizes[i+1])
			{
				throw new Exception();
			}
		}

		for(int i=0; i<N; i++)
		{
			int max = coneSizes[i];
			int min = coneSizes[i];
			int index = i;
			for(int j=i+1; j<N; j++)
			{
				if(coneSizes[j] <= max)
				{
					if(coneSizes[j] < min)
					{
						min = coneSizes[j];
					}
				}
				else
				{
					break;
				}
				index = j;
			}
			double diameter = Math.sqrt((max-min)/2);
			if(diameter > largestCar)
			{
				largestCar = diameter;
			}
			i = index;
		}
		return largestCar;
	}
}