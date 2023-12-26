package com.sunil.redis.ds;

import java.util.ArrayList;
import java.util.List;
// prog 4
public class LongestIncreasingSubSeq {


    public static void main(String[] args) {
        int[] nums =  {50, 3, 10, 7, 40, 80};
        System.out.println(findLIS(nums));
        System.out.println(findLIS(nums).size());
    }

    public static List<Integer> findLIS(int[] nums) {
        List<Integer> lisList = new ArrayList<>();
        lisList.add(nums[0]);

        for (int i=1; i<nums.length; i++) {
            if (nums[i] > lisList.get(lisList.size()-1))
                lisList.add(nums[i]);
            else {
                if (lisList.size() == 1) {
                    lisList.remove(0);
                    lisList.add(0, nums[i]);
                }
            }
//            System.out.println(lisList);
        }
        return lisList;
    }
}
