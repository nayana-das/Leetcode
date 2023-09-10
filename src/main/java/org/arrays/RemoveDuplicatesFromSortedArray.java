package org.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int u=0;
        for(int i=1;i<nums.length;i++){
            if(nums[u]!=nums[i]){
                nums[u+1]=nums[i];
                u++;
            }
        }
        return u+1;
    }
    public static void main(String[] args) {
        int[] nums={2,3,3,4,5,5,5,6,7};
        int k=removeDuplicates(nums);

        String s="hello";
        Arrays.sort(s.toCharArray());
    }
}
