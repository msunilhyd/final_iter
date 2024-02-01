package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {

    public static void main(String[] args) {
        System.out.println(find("bbbb"));
    }

    public static int find(String str) {
        if (str.length() == 0)
            return 0;
        if (str.length() == 1)
            return 1;
        int l = 0;
        int r = 1;
        Set<Character> set = new HashSet();

        while(l < r && r < str.length()) {
            if (!set.contains(str.charAt(r))) {
                set.add(str.charAt(r));
                r++;
            } else {
                l++;
            }
        }
        return set.size();
    }
}
