package org.example.arr;

public class SearchInRotSortArr {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 0, 1, 2, 3};
        System.out.println(find(arr, 7));
    }

    public static boolean find(int[] arr, int target) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            System.out.println(mid);
            if (arr[mid] == target)
                return true;
            if (arr[l] <= arr[mid]) {
                if (target > arr[mid] || target < arr[l]){
                    l = mid + 1;
                } else
                    r = mid - 1;
            } else {
                if (target < arr[mid] || target > arr[r]) {
                    r = mid - 1;
                } else
                    l = mid + 1;
            }
        }
        return false;
    }
}
