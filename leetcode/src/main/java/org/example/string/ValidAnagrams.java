package org.example.string;

import java.util.Arrays;

public class ValidAnagrams {

    public static void main(String[] args) {
        System.out.println(find("sunil", "linuk"));
    }

    public static boolean find(String s, String t) {
        int[] arr = new int[26];
        System.out.println(Arrays.toString(arr));
        for (int i=0; i<s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i=0; i<arr.length; i++) {
            if(arr[i] != 0)
                return false;
        }
        return true;
    }
}
