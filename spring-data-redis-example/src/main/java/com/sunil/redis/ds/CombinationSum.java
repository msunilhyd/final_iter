package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> candidates = Arrays.asList(2, 3, 5);
        List<Integer> cur = new ArrayList<>();
        find(candidates, 8, 0, cur, combinations);
        for (List<Integer> list: combinations) {
            System.out.println(list);
        }
    }

    public static void find (List<Integer> candidates, int target, int index, List<Integer> cur, List<List<Integer>> combinations) {
        if (target <= 0 || index > candidates.size()-1) {
            if (target == 0) {
                combinations.add(new ArrayList<>(cur));
                System.out.println("cur = " + cur);
                System.out.println("combinations = " + combinations);
            }
            return ;
        }
        if (index < candidates.size()) {
            int value = candidates.get(index);
            cur.add(value);
            find(candidates, target-value, index, cur, combinations);
            cur.remove(cur.size() - 1);
            find(candidates, target, index + 1, cur, combinations);
        }
//        System.out.println(combinations);
    }
}
