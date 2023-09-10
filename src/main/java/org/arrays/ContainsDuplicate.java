package org.arrays;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> numCountMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(numCountMap.containsKey(nums[i])){
                return true;
            }
            else
                numCountMap.put(nums[i],1);
        }
        return false;
    }
}
