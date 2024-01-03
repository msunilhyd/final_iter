package org.example.dp;

import java.util.Arrays;

public class CoinsChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(find(coins, 12));
    }

    public static int find(int[] coins, int n) {
        Arrays.sort(coins);

        int[] arr = new int[n+1];
        arr[0] = 0;
        for (int i=1; i<=n; i++) {
            int j;
            for (j=0; j<coins.length; j++) {
                if (coins[j]>i)
                    break;
            }

            arr[i] = 1 + arr[i-coins[j-1]];
        }
        return arr[n];
    }
}
