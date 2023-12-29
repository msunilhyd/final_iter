package com.sunil.redis.ds;

import java.util.*;

public class DFS {

    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {1, 2};
        int[] arr2 = {2, 3};
        int[] arr3 = {3, 4};
        int[] arr4 = {4, 5};

        int[][] edges = {arr1, arr2, arr3, arr4};
        bfs(5, edges);

    }

    public static void bfs(int n, int[][] edges) {

        Map<Integer, List<Integer>> adjVertices = new HashMap<>();
        for (int i=0; i<n; i++) {
            adjVertices.put(i+1, new ArrayList<>());
        }
        for (int[] edge : edges) {
            adjVertices.get(edge[0]).add(edge[1]);
            adjVertices.get(edge[1]).add(edge[0]);
        }

        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        stack.push(1);
        while(!stack.isEmpty()) {
            int cur = stack.pop();
            if (!visited[cur]) {
                visited[cur] = true;
                System.out.println(cur);
                for (int i : adjVertices.get(cur)) {
                    if (!visited[i])
                        stack.push(i);
                }
            }
        }
    }
}
