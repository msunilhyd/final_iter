package org.example.dp;

public class NoOfWaysToClimbSteps {

    public static void main(String[] args) {
        System.out.println(find(6));
    }

    public static int find(int n) {
        if (n ==1)
            return 1;
        if (n == 2)
            return 2;

        int one = 1;
        int two = 2;
        for (int i=3; i<=n; i++) {
            int temp = two;
            two = one + two;
            one = temp;
        }
        return two;
    }
}
