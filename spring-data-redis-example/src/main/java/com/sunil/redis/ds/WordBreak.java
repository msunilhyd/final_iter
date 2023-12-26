package com.sunil.redis.ds;

import org.springframework.scheduling.support.SimpleTriggerContext;

public class WordBreak {
    public static void main(String[] args) {

        String str = "applepenapple";

        String[] wordDict = {"pen", "apple"};

        for (String word: wordDict) {
            if (str.contains(word)) {
                str = str.replaceAll(word, "");
            }
        }

        if (str.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(str);
    }
}
