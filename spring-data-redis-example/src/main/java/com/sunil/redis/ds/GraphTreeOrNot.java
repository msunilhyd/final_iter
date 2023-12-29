package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class GraphTreeOrNot {

    public static void main(String[] args) {

    }


    public static boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adjacencyList = new ArrayList();
        for (int i=0; i<n; i++) {
            adjacencyList.add(new ArrayList<>());
        }
        for (int[] edge: edges){
            adjacencyList.get(edge[0]).add(edge[1]);
            adjacencyList.get(edge[1]).add(edge[0]);
        }

        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> visited = new HashSet<>();

        stack.push(0);
        visited.add(0);

        while(!stack.isEmpty()) {
            int node = stack.pop();
            for (int neighbor: adjacencyList.get(node)) {
                if (visited.contains(neighbor))
                    continue;
                stack.push(neighbor);
                visited.add(neighbor);
            }
        }
        if (visited.size() == n)
            return true;
        return false;
    }
}
