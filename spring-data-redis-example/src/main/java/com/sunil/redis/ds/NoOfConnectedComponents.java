package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.List;

public class NoOfConnectedComponents {

    public static void main(String[] args) {

    }

    public int countComponents(int n, int[][] edges) {

        int counter = 0;
        int[] visited = new int[n];

        List<Integer>[] adjList = new ArrayList[n];
        for (int i=0; i<n; i++) {
            adjList[i] = new ArrayList<Integer>();
        }

        for (int[] edge: edges) {
            adjList[edge[0]].add(edge[1]);
            adjList[edge[1]].add(edge[0]);
        }

        for (int i=0; i<n; i++) {
            if (visited[i] == 0) {
                counter += 1;
//                dfs(adjList, visited, i);
            }
        }
        return 1;
    }
}
