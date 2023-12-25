package com.sunil.redis.ds;

public class MaxProd {

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4, -3, -2};
        System.out.println(maxProd(arr));
    }

    public static int maxProd(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int min = arr[0];
        int max = arr[0];
        int result = arr[0];

        for (int i=1; i<arr.length; i++) {
            int cur = arr[i];
            int temp = Math.max(cur, Math.max(max * cur, min * cur));
            min = Math.min(cur, Math.min(max * cur, min * cur));
            max = temp;
            result = Math.max(result, max);
        }
        return result;
    }
}
