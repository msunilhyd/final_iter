package org.example.redo;

public class ValidAnagram1 {

    public static void main(String[] args) {
        System.out.println(find("sunil", "linus"));
    }

    public static boolean find(String S, String T) {
        int[] arr = new int[26];
        if (S.length() != T.length())
            return false;
        for (int i=0; i<S.length(); i++) {
            arr[S.charAt(i) - 'a'] += 1;
            arr[T.charAt(i) - 'a'] -= 1;
        }
        for (int i=0;i<26; i++) {
            if (arr[i] != 0)
                return false;
        }
        return true;
    }
}
