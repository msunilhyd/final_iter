package org.example.redo;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    public static void main(String[] args) {
        int[] candidates = {2, 3, 5};
        List<Integer> cur = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();
        find(candidates, 0, 8, cur, combinations);
        for (List<Integer> list : combinations) {
            System.out.println(list);
        }
    }

    public static void find(int[] candidates, int index, int target, List<Integer> cur, List<List<Integer>> combinations) {

        if (target <= 0 || index >= candidates.length) {
            if (target == 0) {
                combinations.add(new ArrayList<>(cur));
            }
            return;
        } else {
            int val = candidates[index];
            cur.add(val);
            find(candidates, index, target - val, cur, combinations);
            cur.remove(cur.size()-1);
            find(candidates, index + 1, target, cur, combinations);
        }
        return;
    }
}
