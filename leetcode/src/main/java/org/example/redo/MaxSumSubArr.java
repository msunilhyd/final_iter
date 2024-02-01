package org.example.redo;

public class MaxSumSubArr {

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        int maxSum = 0;
        int curSum = 0;

        for (int i=0; i<arr.length; i++) {
            curSum = curSum + arr[i];
            if (curSum < 0)
                curSum = 0;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
