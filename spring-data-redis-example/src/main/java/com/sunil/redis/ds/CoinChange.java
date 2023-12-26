package com.sunil.redis.ds;

import java.util.Arrays;
// prog 3
public class CoinChange {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(find(coins, 21));
    }

    public static int find(int[] coins, int target) {
        Arrays.sort(coins);

        int[] amt = new int[target + 1];
        int min = coins[0];
        for (int i=0; i<min; i++)
            amt[i] = 0;
        for (int i=min; i<=target;i++) {
            int leastCoin = findCoin(i, coins);
            amt[i] = 1 + amt[i - leastCoin];
        }
        System.out.println(Arrays.toString(amt));
        return amt[target];
    }

    public static int findCoin(int i, int[] coins) {
        int j;
        for (j=0; j<coins.length; j++) {
            if (coins[j] > i)
                break;
        }
        return coins[j-1];
    }
}
