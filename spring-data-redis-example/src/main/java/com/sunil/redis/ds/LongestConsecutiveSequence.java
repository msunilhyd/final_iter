package com.sunil.redis.ds;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {100, 200, 1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println(find(nums));
    }

    public static int find(int[] nums) {
        Set<Integer> set = new HashSet();
        for (int n: nums) {
            set.add(n);
        }
        int longest = 0;
        for (int n: nums) {
            int length = 0;
            if (!set.contains(n-1)) {
                while(set.contains(n + length))
                    length += 1;
            }
            longest = Math.max(longest, length);
        }
        return longest;
    }
}
