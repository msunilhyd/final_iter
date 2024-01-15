package org.example.dp;

import java.util.*;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {
        int[] arr = {4, 100, 1, 2, 3, 21, 22, 23, 24, 25};
        System.out.println(find(arr));
    }

    public static int find(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        System.out.println(set);
        int maxLength = 0;

        for (int n : nums) {
            int length = 1;
            if (!set.contains(n-1)) {
                while (set.contains(n + length)) {
                    length += 1;
                }
            }
            maxLength = Math.max(maxLength, length);
            length = 0;
        }

        return maxLength;
    }
}
