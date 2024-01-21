package org.example.string;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = {"flow", "flowk", "flowrrr"};
        System.out.println(find(strs));
    }

    public static String find(String[] strs) {
        if (strs.length == 0)
            return "";
        int length = strs[0].length();
        for (int i=1; i<strs.length; i++) {
            length = Math.min(length, strs[i].length());
            for (int j=0; j<length; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    length = j;
                    break;
                }
            }
        }
        return strs[0].substring(0, length);
    }
}
