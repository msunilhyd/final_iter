package com.sunil.redis.ds;

import java.util.*;

public class BFS {

    public static void main(String[] args) {

        int[] arr1 = {0, 1};
        int[] arr2 = {0, 2};
        int[] arr3 = {1, 3};
        int[] arr4 = {1, 5};
        int[] arr5 = {5, 4};
        int[] arr6 = {4, 6};

        int[][] edges = {arr1, arr2, arr3, arr4, arr5, arr6};
        bfs(6, edges);

    }

    public static void bfs(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
        }

        Set<Integer> visited = new HashSet<>();
        LinkedList<Integer> stack = new LinkedList<>();

        stack.add(edges[0][0]);

        while(!stack.isEmpty()) {
            int node = stack.poll();
            visited.add(node);
            System.out.println(node);
            for (int i : graph.get(node)) {
                if (!visited.contains(i)) {
                    stack.add(i);
                    visited.add(i);
                }
            }
        }
    }
}
