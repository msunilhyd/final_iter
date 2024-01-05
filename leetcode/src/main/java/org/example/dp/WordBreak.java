package org.example.dp;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
        String str = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        System.out.println(canBeBroken(str, wordDict));
    }

    public static boolean canBeBroken(String str, List<String> wordDict) {
        boolean[] dp = new boolean[str.length()+1];
        dp[0] = true;
        for (int i=1;i<=str.length();i++) {
            for (int j=0; j<i; j++) {
                if (dp[j] && wordDict.contains(str.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[str.length()];
    }
}
