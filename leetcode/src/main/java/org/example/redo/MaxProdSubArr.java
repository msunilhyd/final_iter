package org.example.redo;

public class MaxProdSubArr {

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4, 3};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        int maxProd = Integer.MIN_VALUE;
        int curProd = 1;
        for (int i=0; i<arr.length; i++) {
            curProd = curProd * arr[i];
            maxProd = Math.max(maxProd, curProd);
            if (curProd == 0)
                curProd = 1;
        }
        int maxProd2 = Integer.MIN_VALUE;
        curProd = 1;
        for (int i=arr.length-1; i>=0; i--) {
            curProd = curProd * arr[i];
            maxProd2 = Math.max(maxProd2, curProd);
            if (curProd == 0)
                curProd = 1;
        }

        return Math.max(maxProd, maxProd2);

    }
}
