package org.example.redo;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleSubsets {

    public static List<List<Integer>> setList = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 7};
        List<Integer> path = new ArrayList<>();
        find(nums, 0, path);
        for (List list : setList) {
            System.out.println(list);
        }
    }

    public static void find(int[] nums, int index, List<Integer> path) {
        if (index == nums.length) {
            if (path.size() > 0) {
                setList.add(new ArrayList<>(path));
            }
        } else {
            find(nums, index+1, path);
            path.add(nums[index]);
            find(nums, index+1, path);
            path.remove(path.size()-1);
        }
        return;
    }
}
