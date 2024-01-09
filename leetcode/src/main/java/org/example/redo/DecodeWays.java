package org.example.redo;

import java.util.Arrays;

public class DecodeWays {

    public static void main(String[] args) {
        String string = "12120";
        System.out.println("HelloKumar");
        System.out.println(find(string));
    }

    public static int find(String str) {
        if (str.length() == 0)
            return 0;
        if (str.length() == 1)
            return 1;
        int[] ways = new int[str.length() + 1];
        ways[0] = 1;
        ways[1] = 1;
        for (int i=2; i<=str.length(); i++) {
            if (str.charAt(i-1) == '0') {
                if (str.charAt(i-2) == '1' || str.charAt(i-2) == '2') {
                    ways[i] = ways[i-2];
                } else {
                    System.out.println("It is 0");
                    return 0;
                }
            } else {
                System.out.println("i = " + i);
                if (Character.getNumericValue(str.charAt(i-1)) < 7 && (str.charAt(i-2) == '1' || str.charAt(i-2) == '2')) {
                    ways[i] = ways[i-1] + ways[i-2];
                } else {
                    ways[i] = ways[i-1];
                }
            }
        }
        System.out.println("Hello");
        System.out.println(Arrays.toString(ways));
        return ways[str.length()];
    }
}
