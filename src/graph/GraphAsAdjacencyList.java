package graph;//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GraphAsAdjacencyList {
  public static void main(String args[]) throws IOException {
    int V = 5;
    //int[][] edges = {{0,1},{0,4},{1,2},{1,3},{1,4},{2,3},{3,4}};
    int[][] edges = {{3,7},{4,7},{5,7},{1,8},{6,2},{0,6}};
    List<List<Integer>> adjacencyList = printGraph(9, edges);
    System.out.println(adjacencyList);
    for(var i : adjacencyList){
      Collections.sort(i);
      for(int j: i){
        System.out.println(j+" ");
      }
      System.out.println();

    }

  }
  public static List<List<Integer>> printGraph(int V, int edges[][]) {

    List<List<Integer>> adjacencyList = new ArrayList<>();
    for(int i=0;i<V;i++){
      adjacencyList.add(i, new ArrayList<>());
    }
    for(int edge[] : edges){
      int u=edge[0];
      int v= edge[1];

      adjacencyList.get(u).add(v);
      adjacencyList.get(v).add(u);
    }

    return adjacencyList;

  }
}