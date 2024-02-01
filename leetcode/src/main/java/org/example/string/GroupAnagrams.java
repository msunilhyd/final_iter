package org.example.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> strs = new ArrayList();
        strs.add("eat");
        strs.add("tea");
        strs.add("tan");
        strs.add("ate");
        strs.add("nat");
        strs.add("bat");
        for(List<String> list : group(strs)) {
            System.out.println(list);
        }
    }

    public static List<List<String>> group(List<String> strs) {
        Map<String, List<String>> ansMap = new HashMap();
        for (String str : strs) {
            int[] arr = new int[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            String ks = "";
            for (int i=0; i<26; i++) {
                ks = ks + arr[i] + "#";
            }
            if (!ansMap.containsKey(ks)) {
                List<String> valueList = new ArrayList();
                valueList.add(str);
                ansMap.put(ks, valueList);
            } else {
                ansMap.get(ks).add(str);
            }
        }
        return new ArrayList(ansMap.values());
    }
}
