package org.example.string;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        find("sunillll", 2);
    }

    public static int find(String s, int k) {
        int N = s.length();
        int[] char_counts = new int[26];
        int window_start = 0;
        int max_length = 0;
        int max_count = 0;
        for (int window_end=0; window_end<N; window_end++) {
            int curIndex = s.charAt(window_end)-'A';
            char_counts[curIndex]++;
            max_count = Math.max(max_count, char_counts[curIndex]);

//            while (window_end - window_start - max_count <= k)
        }
        System.out.println(Arrays.toString(char_counts));
        return max_length;
    }
}
