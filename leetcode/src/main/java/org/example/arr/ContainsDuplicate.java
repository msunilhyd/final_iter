package org.example.arr;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 5};
        System.out.println(find(nums));
    }
    public static boolean find(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n: nums) {
            if (set.contains(n))
                return true;
            set.add(n);
        }
        return false;
    }
}
