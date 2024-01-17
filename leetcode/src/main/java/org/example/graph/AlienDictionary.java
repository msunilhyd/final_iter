package org.example.graph;

import java.util.*;

public class AlienDictionary {

    public static void main(String[] args) {
        String[] words = {"wrt", "wrf", "er", "ett", "rftt"};
        System.out.println(alienOrder(words));
    }

    public static String alienOrder(String[] words) {
        int[] indegree = new int[26];
        Map<Character, Set<Character>> g = new HashMap<>();
        buildGraph(g, words, indegree);
        return bfs(g, indegree);
    }

    private static String bfs (Map<Character, Set<Character>> g, int[] indegree) {
        StringBuilder sb = new StringBuilder();
        int totalChars = g.size();
        Queue<Character> q = new LinkedList<>();
        for (char c : g.keySet()) {
            if (indegree[c - 'a'] == 0) {
                sb.append(c);
                q.offer(c);
            }
        }

        while (!q.isEmpty()) {
            char cur = q.poll();
            if (g.get(cur) == null || g.get(cur).size() == 0)
                continue;

            for (char neigh : g.get(cur)) {
                indegree[neigh - 'a']--;
                if (indegree[neigh - 'a'] == 0) {
                    q.offer(neigh);
                    sb.append(neigh);
                }
            }
        }
        return sb.length() == totalChars ? sb.toString() : "";
    }

    private static void buildGraph(Map<Character, Set<Character>> g, String[] words, int[] indegree) {
        for (String word : words) {
            for (char c : word.toCharArray()) {
                g.putIfAbsent(c, new HashSet<>());
            }
        }
        for (int i=1; i<words.length; i++) {
            String firstWord = words[i-1];
            String secondWord = words[i];
            int len = Math.min(firstWord.length(), secondWord.length());

            for (int j=0; j<len; j++) {
                if (firstWord.charAt(j) != secondWord.charAt(j)) {
                    char out = firstWord.charAt(j);
                    char in = secondWord.charAt(j);
                    if (!g.get(out).contains(in)) {
                        g.get(out).add(in);
                        indegree[in - 'a']++;
                    }
                    break;
            }
        }
    }
}}
