package org.example.arr;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductOfArrExceptSelf {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        find(arr);
    }

    public static int[] find(int[] arr) {
        int[] res = new int[arr.length];
        int pre = 1;
        int post = 1;

        for (int i=0; i<arr.length; i++) {
            res[i] = pre;
            pre = pre * arr[i];
        }
        // [1, 1, 2, 6]
        for (int i=arr.length-1; i>=0; i--) {
            res[i] = post * res[i];
            post = post * arr[i];
        }
        System.out.println(Arrays.toString(res));
        return res;
    }
}
