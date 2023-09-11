package my.edu;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 1) return false;

        boolean result = false;
        Map<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null){
                return true;
            }else{
                map.put(nums[i], true);
            }

        }
        return false;
    }
}
