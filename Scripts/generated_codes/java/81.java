/*


Explanation

In the first test case, if employee "cmmi-8">1 gets 300$, employee "cmmi-8">2 will get 280$, employee "cmmi-8">3 will get 260$ and employee "cmmi-8">4 will get 100$, total bonus will be 1040$. If employee "cmmi-8">1 gets 500$, employee "cmmi-8">2 will get 480$, employee "cmmi-8">3 will get 260$ and employee "cmmi-8">4 will get 100$, total bonus will be 1440$. If employee "cmmi-8">1 gets 400$, employee "cmmi-8">2 will get 380$, employee "cmmi-8">3 will get 360$ and employee "cmmi-8">4 will get 100$, total bonus will be 1240$. In the second test case, employee "cmmi-8">1, employee "cmmi-8">2 and employee "cmmi-8">3 simply can’t get the same bonus. 
        
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class KinkuBonusDistribution {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int noOfTestCases = Integer.parseInt(br.readLine().trim());

			for (int i = 0; i < noOfTestCases; i++) {
				String[] noOfEmployeesAndComparisons = br.readLine().trim().split(" ");

				int noOfEmployees = Integer.parseInt(noOfEmployeesAndComparisons[0]);
				int noOfComparisons = Integer.parseInt(noOfEmployeesAndComparisons[1]);
				int minBonus = Integer.parseInt(noOfEmployeesAndComparisons[2]);

				HashMap<Integer, HashMap<Integer, Integer>> comparison = new HashMap<>();

				for (int j = 0; j < noOfComparisons; j++) {
					String[] comparisonDetails = br.readLine().trim().split(" ");

					int empId1 = Integer.parseInt(comparisonDetails[0]);
					int empId2 = Integer.parseInt(comparisonDetails[1]);
					int bonusDifference = Integer.parseInt(comparisonDetails[2]);

					HashMap<Integer, Integer> empId1Map = new HashMap<>();
					if (comparison.containsKey(empId1)) {
						empId1Map = comparison.get(empId1);
					}
					empId1Map.put(empId2, bonusDifference);
					comparison.put(empId1, empId1Map);

					HashMap<Integer, Integer> empId2Map = new HashMap<>();
					if (comparison.containsKey(empId2)) {
						empId2Map = comparison.get(empId2);
					}
					empId2Map.put(empId1, -1 * bonusDifference);
					comparison.put(empId2, empId2Map);
				}

				// int[] result = calculateBonus(comparison, minBonus);
				int[] result = calculateBonusUsingFloydWarshall(comparison, minBonus, noOfEmployees);

				if (result == null) {
					System.out.println("Inconsistent analysis.");
				} else {
					int totalBonus = 0;
					for (int j = 1; j <= noOfEmployees; j++) {
						totalBonus += result[j];
					}
					System.out.println(totalBonus);
					for (int j = 1; j <= noOfEmployees; j++) {
						System.out.print(result[j] + " ");
					}
					System.out.println();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int[] calculateBonus(HashMap<Integer, HashMap<Integer, Integer>> comparison, int minBonus) {

		int[] bonus = new int[comparison.size() + 1];
		Arrays.fill(bonus, minBonus);

		HashSet<Integer> visited = new HashSet<>();

		for (int empId : comparison.keySet()) {

			if (!visited.contains(empId)) {
				HashMap<Integer, Integer> subComparison = comparison.get(empId);

				for (int otherEmpId : subComparison.keySet()) {
					if (bonus[empId] < bonus[otherEmpId] + subComparison.get(otherEmpId)) {
						bonus[empId] = bonus[otherEmpId] + subComparison.get(otherEmpId);
					}
				}
				visited.add(empId);

				for (int otherEmpId : subComparison.keySet()) {
					if (!visited.contains(otherEmpId)) {
						if (bonus[otherEmpId] < bonus[empId] - subComparison.get(otherEmpId)) {
							bonus[otherEmpId] = bonus[empId] - subComparison.get(otherEmpId);
						}
					}
				}
				visited.add(empId);
			}
		}

		for (int empId : comparison.keySet()) {
			HashMap<Integer, Integer> subComparison = comparison.get(empId);

			for (int otherEmpId : subComparison.keySet()) {
				if (bonus[empId] < bonus[otherEmpId] + subComparison.get(otherEmpId)) {
					return null;
				}
			}
		}

		return bonus;
	}

	public static int[][] calculateBonusUsingFloydWarshall(HashMap<Integer, HashMap<Integer, Integer>> comparison,
			int minBonus, int noOfEmployees) {
		int[][] result = new int[noOfEmployees + 1][noOfEmployees + 1];

		for (int i = 1; i <= noOfEmployees; i++) {
			for (int j = 1; j <= noOfEmployees; j++) {
				if (i == j) {
					result[i][j] = 0;
				} else {
					result[i][j] = 1000000000;
				}
			}
		}

		for (int empId : comparison.keySet()) {
			HashMap<Integer, Integer> subComparison = comparison.get(empId);

			for (int otherEmpId : subComparison.keySet()) {
				result[empId][otherEmpId] = subComparison.get(otherEmpId);
			}
		}

		for (int k = 1; k <= noOfEmployees; k++) {
			for (int i = 1; i <= noOfEmployees; i++) {
				for (int j = 1; j <= noOfEmployees; j++) {
					if (result[i][j] > result[i][k] + result[k][j]) {
						result[i][j] = result[i][k] + result[k][j];
					}
				}
			}
		}

		boolean isNegativeCycle = false;
		for (int i = 1; i <= noOfEmployees; i++) {
			if (result[i][i] < 0) {
				isNegativeCycle = true;
			}
		}

		if (isNegativeCycle) {
			return null;
		}

		for (int i = 1; i <= noOfEmployees; i++) {
			for (int j = 1; j <= noOfEmployees; j++) {
				if (i != j) {
					System.out.print(result[i][j] + " ");
				}
			}
			System.out.println();
		}

		return result;
	}
}