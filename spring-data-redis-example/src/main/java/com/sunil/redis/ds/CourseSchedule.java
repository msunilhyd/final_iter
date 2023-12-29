package com.sunil.redis.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class CourseSchedule {

    public static void main(String[] args) {
        int[] arr1 = {0, 1};
        int[] arr2 = {0, 2};
        int[] arr3 = {1, 3};
        int[] arr4 = {1, 4};
        int[] arr5 = {3, 4};

        int[][] prerequisties = {arr1, arr2, arr3, arr4, arr5};
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> courseGraph = new HashMap<>();

        for (int[] pre: prerequisites) {
            if (courseGraph.containsKey(pre[1])) {
                courseGraph.get(pre[1]).add(pre[0]);
            } else {
                List<Integer> nextCourses = new LinkedList<>();
                nextCourses.add(pre[0]);
                courseGraph.put(pre[1], nextCourses);
            }
        }
        HashSet<Integer> visited = new HashSet<>();
        for (int currentCourse=0; currentCourse<numCourses; currentCourse++) {
            if (courseSchedule(currentCourse, visited, courseGraph) == false)
                return false;
        }
        return true;
    }

    public static boolean courseSchedule(int course, HashSet<Integer> visited, HashMap<Integer, List<Integer>> courseGraph) {
        if (visited.contains(course))
            return false;
        if (courseGraph.get(course) == null)
            return true;

        visited.add(course);
        for (int pre: courseGraph.get(course)) {
            if (courseSchedule(pre, visited, courseGraph) == false) {
                return false;
            }
        }
        visited.remove(course);
        courseGraph.put(course, null);
        return true;
    }
}
