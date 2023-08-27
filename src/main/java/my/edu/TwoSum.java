package my.edu;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String [] args){
        System.out.println("Testing: ");
    }


    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                result[0] = map.get(diff);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }


    public int[] twoSumBad(int[] nums, int target) {
        int [] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length; j++) {

                if (i != j && (nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }






//   i nt result [] = new int[2];
//        for(int i = 0; i < nums.length-1; i++){
//        for(int j = 0; j < nums.length; j++){
//
//            if(i != j && (nums[i] + nums [j]) == target){
//                result[0] = i;
//                result[1] = j;
//                break;
//            }
//        }
//    }
//        return result;
}
