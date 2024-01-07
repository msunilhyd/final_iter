package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubsequences {

    public static void main(String[] args) {
       int[] arr = {2, 4, 1, 7};
       List<Integer> list = new ArrayList<>();
       printSubsequences(arr, 0, list);
    }

    public static void printSubsequences(int[] arr, int index, List<Integer> path) {
        if (index == arr.length) {
            if (path.size() > 0) {
                System.out.println(path);
            }
        } else {
            printSubsequences(arr, index+1, path);
            path.add(arr[index]);
            printSubsequences(arr, index+1, path);
            path.remove(path.size() - 1);
        }
        return ;
    }
}
