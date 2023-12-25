package com.sunil.redis.ds;

import org.springframework.web.servlet.tags.form.SelectTag;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 7, 2};
        System.out.println(containsDupli(nums));
    }

    public static boolean containsDupli(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num))
                return true;
            set.add(num);
        }
        return false;
    }
}
