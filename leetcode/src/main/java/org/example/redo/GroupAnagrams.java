package org.example.redo;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] arr = {
                "cat",
                "tac",
                "act",
                "sunil",
                "linus"
        };
        for(List<String> list : find(arr)) {
            System.out.println(list);
        }
    }

    public static List<List<String>> find(String[] arr) {
        Map<String, List<String>> ansMap = new HashMap();
        int[] count = new int[26];
        for (String str : arr) {
            Arrays.fill(count, 0);
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }
            String key = "";
            for (int i=0; i<26; i++) {
                key = key + count[i] + "#";
            }
            if (ansMap.containsKey(key)) {
                ansMap.get(key).add(str);
            } else {
                List<String> list = new ArrayList();
                list.add(str);
                ansMap.put(key, list);
            }
        }
        return new ArrayList(ansMap.values());
    }
}
