package org.example.redo;

public class RemoveDuplicatesArr {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 4, 5, 5};
        System.out.println(nums);
    }

    public static int find(int[] nums) {
        int i = 0;
        for (int j=0; j<nums.length; j++) {
            nums[i] = nums[j];
            i += 1;
            while (j < nums.length - 1 && nums[j] == nums[j+1])
                j++;
        }
        return i;
    }
}
