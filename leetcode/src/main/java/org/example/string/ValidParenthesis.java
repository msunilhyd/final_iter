package org.example.string;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        System.out.println(find("{([])}"));
    }

    public static boolean find(String str) {
        String openBrackets = "({[";
        String closeBrackets = ")}]";
        Stack<Character> stack = new Stack();
        for (char c : str.toCharArray()) {
            if (openBrackets.indexOf(c) != -1) {
                stack.push(c);
            } else {
                char k = stack.pop();
                if (openBrackets.indexOf(k) != closeBrackets.indexOf(c)) {
                    break;
                }
            }
        }
        System.out.println(stack);
        if (stack.isEmpty())
            return true;
        return false;
    }
}
