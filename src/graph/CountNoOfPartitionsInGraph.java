package graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Given an undirected graph with V vertices. We say two vertices u and v belong to a single
 * province if there is a path from u to v or v to u. Your task is to find the number of
 * provinces.
 * <p>
 * Note: A province is a group of directly or indirectly connected cities and no other cities
 * outside of the group.
 *
 * <a href="https://shorturl.at/YaDkI">...</a>
 */

public class CountNoOfPartitionsInGraph {


  public static void main(String[] args) throws IOException {
    int V = 5;
    //int[][] edges = {{0,1},{0,4},{1,2},{1,3},{1,4},{2,3},{3,4}};
    //int[][] edges = {{3, 7}, {4, 7}, {5, 7}, {1, 8}, {6, 2}, {0, 6}};
    int[][] edges = {{0, 1}, {1, 2}, {1, 19}, {17, 23}, {17, 6}, {2, 4}, {2, 7},
        {23, 5}, {16, 10}};
    int count = 0;

    List<List<Integer>> adjacencyList = createGraphAsAdjacencyList(24, edges);
    int[] visitedNodes = new int[adjacencyList.size()];
    for (int i = 0; i < adjacencyList.size(); i++) {
      if (visitedNodes[i] == 0 && !adjacencyList.get(i).isEmpty()) {
        count++;
        dfsTraversal(i, visitedNodes, adjacencyList);
      }
    }
    System.out.println("No. Of partitions : " + count);

  }

  public static List<List<Integer>> createGraphAsAdjacencyList(int V, int[][] edges) {

    List<List<Integer>> adjacencyList = new ArrayList<>();
    for (int i = 0; i < V; i++) {
      adjacencyList.add(i, new ArrayList<>());
    }
    for (int edge[] : edges) {
      int u = edge[0];
      int v = edge[1];

      adjacencyList.get(u).add(v);
      adjacencyList.get(v).add(u);
    }

    return adjacencyList;

  }

  public static void dfsTraversal(Integer node, int[] visitedNodes,
      List<List<Integer>> adjacencyList) {
    if (visitedNodes[node] == 0) {
      visitedNodes[node] = 1;
      // System.out.print(node + " ");
      List<Integer> adjacentNodes = adjacencyList.get(node);
      for (Integer adjacentNode : adjacentNodes) {
        dfsTraversal(adjacentNode, visitedNodes, adjacencyList);
      }

    }

  }
}
