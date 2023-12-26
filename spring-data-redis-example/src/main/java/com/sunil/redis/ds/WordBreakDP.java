package com.sunil.redis.ds;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// prog 6
public class WordBreakDP {
    public static void main(String[] args) {
        String str = "leetcodeleet";
        String[] dict = {"leet", "code"};
        System.out.println(find(str, dict));
    }

    public static boolean find(String str, String[] dict) {
        List<String> list = Arrays.asList(dict);
        Set<String> set = new HashSet<>(list);
        boolean[] dp = new boolean[str.length() + 1];
        dp[0] = true;

        for (int i=1; i<=str.length(); i++) {
            for (int j=0; j<i; j++) {
                if (dp[j] && set.contains(str.substring(j, i)))
                    dp[i] = true;
            }
        }
        return dp[str.length()];
    }
}
