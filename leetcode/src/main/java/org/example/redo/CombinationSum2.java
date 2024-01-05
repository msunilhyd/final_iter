package org.example.redo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {

    public static void main(String[] args) {
        List<Integer> candidates = Arrays.asList(2, 3, 5);
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();
        find(candidates, cur, 0, 8, combinations);
        for (List<Integer> list : combinations) {
            System.out.println(list);
        }
    }

    public static void find(List<Integer> candidates, List<Integer> cur, int index, int target, List<List<Integer>> combinations) {
        if (target <= 0 || index >= candidates.size()) {
            if (target == 0) {
                combinations.add(new ArrayList<>(cur));
            }
            return;
        }
        if (index < candidates.size()) {
            int val = candidates.get(index);
            cur.add(val);
            find(candidates, cur, index, target-val, combinations);
            cur.remove(cur.size()-1);
            find(candidates, cur, index+1, target, combinations);
        }
    }
}
