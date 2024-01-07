package org.example.recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EvenDifference {

    public static List<List<Integer>> list = new ArrayList<>();

    public static void main(String[] args) {
        int[] arr = {93, 87, 85, 50};
        List<Integer> path = new ArrayList();
        find(arr, 0, path);
        int maxSum = 0;
        int maxSize = 0;
        for (List list1: list){
            System.out.println(list1);
            Collections.sort(list1);
            if (list1.size() > 1) {
                int sum = 0;
                for (int i=list1.size()-1; i>0; i--) {
                    int diff = (int)list1.get(i) - (int)list1.get(i-1);
                    sum = sum + diff;
                }
                if (sum % 2 == 0 && sum >= maxSum) {
                    maxSum = sum;
                    maxSize = list1.size();
                    System.out.println("maxSum = " + maxSum);
                    System.out.println("maxList = " + list1);
                }
            }
        }
        System.out.println(maxSize);

    }

    public static void find (int[] arr, int index, List<Integer> path) {
        if (index == arr.length) {
            if (path.size() > 0) {
                List<Integer> curList = new ArrayList<>(path);
                list.add(curList);
            }
        } else {
            find(arr, index + 1, path);
            path.add(arr[index]);
            find(arr, index + 1, path);
            path.remove(path.size()-1);
        }
    }
}
