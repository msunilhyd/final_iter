package com.sunil.redis.entity.walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactorialsStartWithEvenNo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(find(5, 7)));
    }

    public static Integer[] find(int m, int n) {
        List<Integer> factList = new ArrayList<>();
        for (int i=m; i<n; i++) {
            int fact = factorial(i);
            int fDigit = firstDigit(fact);
            if (fDigit % 2 == 0)
                factList.add(i);
        }
        return factList.toArray(new Integer[factList.size()]);
    }

    public static int firstDigit(int n) {
        int digit = 0;
        while (n > 0) {
            digit = n % 10;
            n = n / 10;
        }
        return digit;
    }

    public static int factorial (int n) {
        int fact = 1;
        for (int i=2; i<=n; i++)
            fact = fact * i;
        return fact;
    }
}
