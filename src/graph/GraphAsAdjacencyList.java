package graph;//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GraphAsAdjacencyList {

  public static void main(String[] args) throws IOException {
    int V = 5;
    //int[][] edges = {{0,1},{0,4},{1,2},{1,3},{1,4},{2,3},{3,4}};
    //int[][] edges = {{3, 7}, {4, 7}, {5, 7}, {1, 8}, {6, 2}, {0, 6}};
    int[][] edges = {{0, 1}, {1, 2}, {1, 19}, {0, 17}, {17, 23}, {17, 6}, {2, 4}, {2, 7}, {23, 5},
        {23, 16}, {16, 10}};

    List<List<Integer>> adjacencyList = createGraphAsAdjacencyList(24, edges);
    //printGraph(adjacencyList);
    bfsTraversal(adjacencyList, 0);


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

  public static void printGraph(List<List<Integer>> adjacencyList) {
    for (var i : adjacencyList) {
      Collections.sort(i);
      for (int j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }

  public static void bfsTraversal(List<List<Integer>> adjacencyList, Integer node) {

    int[] visitedNodes = new int[adjacencyList.size()];
    Queue<Integer> nodeQueue = new LinkedList<>();
    nodeQueue.add(node);
    while (nodeQueue.peek() != null) {
      int element = nodeQueue.poll();
      if (visitedNodes[element] == 0) {
        System.out.print(element + " ");
        visitedNodes[element] = 1;
        List<Integer> adjacentElements = adjacencyList.get(element);
        nodeQueue.addAll(adjacentElements);
      }
    }
  }

}
