package com.sunil.redis.ds;

import java.util.HashSet;

public class LengthOfSubstringOfNonrepeatingChars {

    public static void main(String[] args) {
        System.out.println(find("SUNNILK"));
    }

    public static int find(String s) {
        if (s == null || s.length() == 0)
            return 0;
        if (s.length() == 1)
            return 1;
        int left = 0;
        int right = 0;
        int ans = 0;

        HashSet<Character> set = new HashSet<>();
        while (right < s.length()){
            char c = s.charAt(right);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}
