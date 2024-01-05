package org.example.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        int target = 8;

        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();
        find(list, target, 0, cur, combinations);
        for (List<Integer> list1 : combinations) {
            System.out.println(list1);
        }
    }

    public static void find(List<Integer> candidates, int target, int index, List<Integer> cur, List<List<Integer>> combinations) {
        if (target <= 0 || index > candidates.size()-1) {
            if (target == 0) {
                List<Integer> copyList = new ArrayList<>(cur);
                combinations.add(copyList);
            }
            return;
        }

        if (index < candidates.size()) {
            int val = candidates.get(index);
            cur.add(val);
            find(candidates, target-val, index, cur, combinations);
            cur.remove(cur.size()-1);
            find(candidates, target, index+1, cur, combinations);
        }
    }
}
