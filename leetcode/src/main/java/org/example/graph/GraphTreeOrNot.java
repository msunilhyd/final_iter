package org.example.graph;

import java.util.*;

public class GraphTreeOrNot {

    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {0, 3}, {1, 4}};
        int n = 5;
        System.out.println(isTree(n, edges));
    }

    public static boolean isTree(int n, int[][] edges) {

        if (n-1 != edges.length)
            return false;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i=0; i<n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Stack<Integer> stack = new Stack<>();
        Set<Integer> visited = new HashSet<>();

        stack.add(0);
        visited.add(0);

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            for (int neighbor : graph.get(cur)) {
                if (visited.contains(neighbor)) {
                    continue;
                }
                visited.add(neighbor);
                stack.push(neighbor);
            }
        }
        if (visited.size() == n)
            return true;
        return false;
    }
}
