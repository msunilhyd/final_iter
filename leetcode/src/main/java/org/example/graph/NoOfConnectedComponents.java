package org.example.graph;

import java.util.ArrayList;
import java.util.List;

public class NoOfConnectedComponents {

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {1, 2}, {3, 4}, {5, 6}};
        System.out.println(countComponents(7, edges));
    }

    public static int countComponents(int n, int[][] edges) {
        int counter = 0;
        int[] visited = new int[n];
        List<Integer>[] graph = new ArrayList[n];
        for (int i=0; i<n; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        for (int i=0; i<n; i++) {
            if (visited[i] == 0) {
                visited[i] = 1;
                counter += 1;
                dfs(visited, graph, i);
            }
        }
        return counter;
    }

    public static void dfs(int[] visited, List<Integer>[] graph, int i) {
            List<Integer> neighbors = graph[i];
            for (int neighbor : neighbors) {
                if (visited[neighbor] == 0) {
                    visited[neighbor] = 1;
                    dfs(visited, graph, neighbor);
                }
            }
    }
}
