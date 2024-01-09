package org.example.dp;

public class DecodeWays {

    public static void main(String[] args) {
        String str = "12120";
        System.out.println(find(str));
    }

    public static int find (String str) {

        int[] dp = new int[str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        if (str.length() == 0)
            return 0;
        if (str.length() == 1)
            return 1;

        for (int i=2; i<=str.length(); i++) {
            if (str.charAt(i-1) == '0') {
                if (str.charAt(i-2) == '1' || str.charAt(i-2) == '2')  {
                    dp[i] = dp[i-2];
                } else {
                    return 0;
                }
            } else {
                if ((str.charAt(i-2) == '1' || str.charAt(i-2) == '2') && Character.getNumericValue(str.charAt(i-1)) < 7) {
                    dp[i] = dp[i-1] + dp[i-2];
                } else {
                    dp[i] = dp[i-1];
                }
            }
        }
        return dp[str.length()];
    }
}
