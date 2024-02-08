package org.example.arr;

import java.util.Arrays;

public class RotateArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotate(arr, 2)));
        System.out.println(Arrays.toString(rotate(arr, -2)));
    }

    // {4, 5, 1, 2, 3}
    // {3, 4, 5, 1, 2}

    public static int[] rotate(int[] arr, int k) {
        if (k >= arr.length)
            k = k % arr.length;
        if (k < 0)
            k = arr.length + k;
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            int index = (arr.length - k) + i;
            if (index >= arr.length)
                index = index - arr.length;
            newArr[i] = arr[index];
        }
        return newArr;
    }
}
