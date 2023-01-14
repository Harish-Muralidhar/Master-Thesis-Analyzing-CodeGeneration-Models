
https://www.codechef.com/problems/COALTAR
*/
import java.util.HashMap;
import java.util.Map;

class CoalTar {

  static int MIN_PROFIT = -1;
  static Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();

  public static void main(String[] args) {
    int numCities = 3;
    int numRoadsProposedByChef = 1;
    int[] profits = {10};
    int[][] roadsProposedByChef = {{0, 1}};
    int numRoadsProposedByOthers = 2;
    int[][] roadsProposedByOthers = {{0, 1, 5}, {1, 2, 4}};

    System.out.println(minCostAndMaxProfit(numCities, numRoadsProposedByChef, profits, roadsProposedByChef, numRoadsProposedByOthers, roadsProposedByOthers));
  }

  static String minCostAndMaxProfit(
      int numCities, int numRoadsProposedByChef, int[] profits, int[][] roadsProposedByChef,
      int numRoadsProposedByOthers, int[][] roadsProposedByOthers) {

    for (int[] road : roadsProposedByOthers) {
      addEdge(graph, road[0], road[1], road[2]);
    }

    for (int[] road : roadsProposedByChef) {
      addEdge(graph, road[0], road[1], MIN_PROFIT);
    }

    int maxProfit = findMaxProfit(graph, profits, numRoadsProposedByChef, numRoadsProposedByOthers);
    return maxProfit != MIN_PROFIT ? maxProfit + " " + findMinCost(graph, numRoadsProposedByOthers) : "Impossible";
  }

  private static int findMinCost(Map<Integer, Map<Integer, Integer>> graph, int numRoadsProposedByOthers) {
    int minCost = 0;
    for (Map<Integer, Integer> costAndCity : graph.values()) {
      for (Integer cost : costAndCity.values()) {
        if (MIN_PROFIT == cost) {
          minCost += cost;
        }
      }
    }
    return minCost;
  }

  private static int findMaxProfit(
      Map<Integer, Map<Integer, Integer>> graph, int[] profits, int numRoadsProposedByChef, int numRoadsProposedByOthers) {

    if (numRoadsProposedByChef == 0) {
      return MIN_PROFIT;
    }

    Map<Integer, Map<Integer, Integer>> pathsRightToLeft = new HashMap<>();
    Map<Integer, Map<Integer, Integer>> pathsLeftToRight = new HashMap<>();
    findAllPaths(graph, 0, pathsRightToLeft);
    findAllPaths(graph, graph.size() - 1, pathsLeftToRight);

    int totalNumPaths = pathsRightToLeft.get(0).size() + pathsLeftToRight.get(graph.size() - 1).size() - 2;
    int totalNumEdgesIfAllPathsAreFromChef = numRoadsProposedByChef + (totalNumPaths - 1);
    if (totalNumEdgesIfAllPathsAreFromChef < numRoadsProposedByOthers) {
      return MIN_PROFIT;
    }

    int maxProfit = Integer.MIN_VALUE;
    for (int profit : profits) {
      maxProfit = Math.max(maxProfit, profit);
    }
    return maxProfit;
  }

  private static void findAllPaths(Map<Integer, Map<Integer, Integer>> graph, int src, Map<Integer, Map<Integer, Integer>> paths) {
    Map<Integer, Boolean> visited = new HashMap<>();
    for (int i = 0; i < graph.size(); i++) {
      visited.put(i, false);
    }
    Map<Integer, Integer> path = new HashMap<>();
    path.put(src, 0);
    visited.put(src, true);
    findAllPathsUtil(graph, paths, visited, src, src, path);
  }

  private static void findAllPathsUtil(
      Map<Integer, Map<Integer, Integer>> graph, Map<Integer, Map<Integer, Integer>> paths, Map<Integer, Boolean> visited,
      int src, int dest, Map<Integer, Integer> path) {

    if (src != dest) {
      for (Map.Entry<Integer, Integer> adjacentCityAndCost : graph.get(src).entrySet()) {
        int adjacentCity = adjacentCityAndCost.getKey();
        if (!visited.get(adjacentCity)) {
          visited.put(adjacentCity, true);
          path.put(adjacentCity, path.get(src) + adjacentCityAndCost.getValue());
          findAllPathsUtil(graph, paths, visited, adjacentCity, dest, path);
          visited.put(adjacentCity, false);
          path.remove(adjacentCity);
        }
      }
    } else {
      paths.put(src, new HashMap<>(path));
    }
  }

  private static void addEdge(Map<Integer, Map<Integer, Integer>> graph, int src, int dest, int cost) {
    graph.putIfAbsent(src, new HashMap<>());
    graph.get(src).put(dest, cost);

    graph.putIfAbsent(dest, new HashMap<>());
    graph.get(dest).put(src, cost);
  }
}