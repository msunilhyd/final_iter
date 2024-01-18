package org.example.redo;

import java.util.*;

public class AlienDictionary {

    public static Map<Character, Set<Character>> g = new HashMap<>();
    public static int[] inDegree = new int[26];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        System.out.println("sequence is = " + find(words));
        System.out.println(g);
        System.out.println(sb);
    }

    public static void dfs() {
        Queue<Character> queue = new LinkedList<>();
        for (Character c : g.keySet()) {
            if (inDegree[c - 'a'] == 0) {
                queue.add(c);
                sb.append(c);
            }
        }
        while (!queue.isEmpty()) {
            Character c = queue.poll();
            for (Character neighbor : g.get(c)) {
                inDegree[neighbor - 'a']--;
                if (inDegree[neighbor - 'a'] == 0) {
                    sb.append(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static String find(String[] words) {
        // create the graph
        // dfs

        for (String word : words) {
            for (int i=0; i<word.length(); i++) {
                g.putIfAbsent(word.charAt(i), new HashSet<>());
            }
        }

        for (int i=1; i<words.length; i++) {
            String word1 = words[i-1];
            String word2 = words[i];
            int len = Math.min(word1.length(), word2.length());

            for (int j=0; j<len; j++) {
                Character out = word1.charAt(j);
                Character in = word2.charAt(j);

                if (out != in) {
                    Set set = g.get(out);
                    set.add(in);
                    inDegree[in - 'a']++;
                    break;
                }
            }
        }
        dfs();
        if (sb.length() == g.size()) {
            return sb.toString();
        }
        return "";
    }
}
