package org.example.other;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(find(12321));
    }

    public static boolean find(int n) {
        int copy = n;
        int reverse = 0;

        while (copy > 0) {
            reverse = reverse * 10 + copy % 10;
            copy = copy / 10;
        }
        return reverse == n;
    }

    public static boolean isPalindrome(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n%10);
            n = n / 10;
        }
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            if (list.get(left) != list.get(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
