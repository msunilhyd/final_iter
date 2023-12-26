package com.sunil.redis.ds;

// prog 2
public class NoOfWaysToClimbStairs {
    public static void main(String[] args) {
        System.out.println(find(5));
    }

    public static int find(int n) {
        int one = 1;
        int two = 2;
        int total = 0;

        for (int i=3; i<=n; i++) {
            total = one + two;
            one = two;
            two = total;
        }
        return total;
    }
}
