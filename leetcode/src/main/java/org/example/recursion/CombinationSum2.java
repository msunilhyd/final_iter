package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        int[] nums = {2, 3, 5};
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();
        find(nums, 0, 8, cur, combinations);

        for (List<Integer> list:combinations) {
            System.out.println(list);
        }
    }

    public static void find(int[] nums, int index, int target, List<Integer> cur, List<List<Integer>> combinations) {
        if (index > nums.length-1 || target <= 0) {
            if (target == 0) {
                combinations.add(new ArrayList<>(cur));
            }
            return;
        }
        else {
            int val = nums[index];
            cur.add(val);
            find(nums, index, target-val, cur, combinations);
            cur.remove(cur.size()-1);
            find(nums, index + 1, target, cur, combinations);
        }
        return;
    }
}
