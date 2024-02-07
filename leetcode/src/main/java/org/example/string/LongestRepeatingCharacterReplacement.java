package org.example.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        System.out.println(find("sunillll", 2));
    }

    public static int find(String s, int k) {
        Map<Character, Integer> map = new HashMap();
        int topFrequency = 0;
        int longest = 0;

        int left = 0;
        int right = 0;

        while(right < s.length()) {
            char rightCharacter = s.charAt(right);
            if (map.containsKey(rightCharacter))
                map.put(rightCharacter, map.get(rightCharacter) + 1);
            else
                map.put(rightCharacter, 1);
            topFrequency = Math.max(topFrequency, map.get(rightCharacter));

            while((right - left + 1) - topFrequency > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);
                left++;
            }
            longest = Math.max(longest, (right - left) + 1);
            right++;
        }
        return longest;
    }

}
