package org.example.other;

import java.util.Arrays;
import java.util.List;

public class StrongWeakPassword {

    // should not be all capital letters
    // should not be all small letters
    // should not be all numerics
    // should not be in the list of common_words list
    // word in common_words list should not be a substring of password
    // length should be greater than 6

    public static void main(String[] args) {
        List<String> common_words = Arrays.asList("dog", "cat", "123");
        String password = "3456";
        find(password, common_words);
    }

    public static void find(String password, List<String> common_words) {
        String type = "";
        if (password.length() <= 6)
            type = "weak";
        int k=0;
        for (int i=0; i<password.length();i++){
            char c = password.charAt(i);
            if (Character.isUpperCase(c))
                k++;
        }
        if (k == password.length())
            type = "weak";

        int l=0;
        for (int i=0; i<password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c))
                l++;
        }
        if (l==password.length())
            type = "weak";
        System.out.println("password type = " + type);
        System.out.println("k = " + l);
    }
}
