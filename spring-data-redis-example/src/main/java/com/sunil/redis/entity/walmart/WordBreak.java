package com.sunil.redis.entity.walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak {

    public static void main(String[] args) {
        String str = "applepenapplek";
        List<String> wordList = new ArrayList<>();
        wordList.add("apple");
        wordList.add("pen");
        System.out.println(find(str, wordList));
    }

    public static boolean find(String str, List<String> wordList) {

        boolean[] arr = new boolean[str.length() + 1];
        arr[0] = true;

        for (int i=1; i<=str.length(); i++) {
            for (int j=0; j<i; j++) {
                if (arr[j] && wordList.contains(str.substring(j,i))) {
                    arr[i] = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr[str.length()];
    }
}
