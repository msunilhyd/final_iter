package org.example.arr;

public class MinRotatedSortArr2 {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int min = arr[l];
        while (l <= r) {
            min = Math.min(arr[l], min);
            int mid = (l+r) / 2;
            System.out.println(mid);
            if (arr[l] <= arr[mid])
                l = mid + 1;
            else
                r = mid - 1;
        }
        return min;
    }
}
