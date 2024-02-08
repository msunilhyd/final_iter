package org.example.string;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        System.out.println(find("AADDDBKKKCABCD", "ABC"));
    }
    public static String find(String s, String t) {
        Map<Character, Integer> map = new HashMap();

        for (char c : t.toCharArray()){
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }

        int left = 0;
        int right = 0;
        int len = Integer.MAX_VALUE;
        int count = map.size();
        String minWindow = "";
// s = "AADDDBKKKCABCD"
// t = "ABC"
        while(right < s.length()) {
            char rLetter = s.charAt(right);
            if (map.containsKey(rLetter)) {
                map.put(rLetter, map.get(rLetter)-1);
                if (map.get(rLetter) == 0)
                count--;
            }
            right++;
            while(count == 0) {
                if ((right - left) < len){
                    len = right - left;
                    minWindow = s.substring(left, right);
                }
                char lLetter = s.charAt(left);
                if (map.containsKey(lLetter)) {
                    map.put(lLetter, map.get(lLetter) + 1);
                    if (map.get(lLetter) > 0)
                        count++;
                }
                left++;
            }
        }
        return minWindow;
    }
}
