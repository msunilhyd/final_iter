package com.sunil.redis.entity.walmart;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(find(10000000));
    }

    public static List<Integer> find(int n) {
        List<Integer> primeNoList = new ArrayList<>();
        for (int i=2; i<n; i++) {
            if (isPrime(i))
                primeNoList.add(i);
        }
        return primeNoList;
    }

    public static boolean isPrime(int n) {
        for (int i=2; i*i<n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
