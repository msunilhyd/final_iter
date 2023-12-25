package com.sunil.redis;

public class OddNum {

    public static void main(String[] args) {

        System.out.println(extractMax("gt12cty65m122"));
    }

    public static int extractMax(String str) {
        int num = 0;
        int res = 0;
// gt12cty65mt123
        for (int i=0; i<str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num = num * 10 + (str.charAt(i) - '0');
                System.out.println(num);
            }
            else {
                if (num % 2 == 1) {
                    res = Math.max(res, num);
                }
                num = 0;
            }
        }
        if (num % 2 == 1) {
            return Math.max(res, num);
        }
        if (res % 2 == 1) {
            return res;
        }
        return -1;
    }
}
