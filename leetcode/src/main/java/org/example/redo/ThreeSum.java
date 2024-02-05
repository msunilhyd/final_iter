package org.example.redo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {-2, -1, -1, 0, 1, 2, 2};
        for (List<Integer> list : find(arr)) {
            System.out.println(list);
        }
    }

    public static List<List<Integer>> find(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ansList = new ArrayList();

        for (int i=0; i<arr.length-2; i++) {
            int curr = arr[i];
            int left = i+1;
            int right = arr.length - 1;
            if (i>0 && arr[i-1] == curr)
                continue;
            while(left < right) {
                int sum = curr + arr[left] + arr[right];
                if (sum == 0){
                    List<Integer> list = new ArrayList();
                    list.add(curr);
                    list.add(arr[left]);
                    list.add(arr[right]);
                    left++;
                    right--;
                    ansList.add(list);
                } else if(sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return ansList;
    }
}
