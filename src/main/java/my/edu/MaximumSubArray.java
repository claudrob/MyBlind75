package my.edu;

import java.util.Arrays;

public class MaximumSubArray {

    public static void main(String[] args) {
        MaximumSubArray maximumSubArray = new MaximumSubArray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(Arrays.toString(nums) + " = " + maximumSubArray.maxSubArray(nums));
    }


    public int maxSubArray(int[] nums) {

        int max = nums[0];
        int cur = nums[0];
        for(int i = 1; i < nums.length; i++){
            cur = Math.max(nums[i], nums[i] + cur);
            max = Math.max(max, cur);

        }
        return max;


    }


}
