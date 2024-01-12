package org.example.graph;

import java.util.*;

public class CourseSchedule {

    public static Map<Integer, List<Integer>> graph = new HashMap<>();
    public static Set<Integer> visitedSet = new HashSet<>();
    public static boolean noCycle = true;
    public static void main(String[] args) {

        int[] arr1 = {1, 0};
        int[] arr2 = {0, 1};
        int[] arr3 = {2, 0};
        int[] arr4 = {3, 2};
        int[][] courses = {arr1, arr2};
//        int[][] courses = {arr1, arr2, arr3, arr4};
        System.out.println("canFinish = " + hasCycle(4, courses));
    }

    public static boolean hasCycle(int noOfCourses, int[][] courses) {
        // construct the graph with a hashMap
        for (int[] arr : courses) {
            if (graph.containsKey(arr[1])) {
                List<Integer> list = graph.get(arr[1]);
                list.add(arr[0]);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(arr[0]);
                graph.put(arr[1], list);
            }
        }
        return dfs(0);
    }

    public static boolean dfs(int n) {
        if (!visitedSet.contains(n)) {
           visitedSet.add(n);
           List<Integer> neighbors = graph.get(n);
           if (neighbors != null) {
               for (int i : neighbors) {
                   dfs(i);
               }
           }
        } else {
            noCycle = false;
        }
        return noCycle;
    }
}
