package org.dsa.leetcode.cyclicsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//https://leetcode.com/problems/set-mismatch/description/  - Set Mismatch

//Amazon, Microsoft
class FindAllDuplicates {
    public static List<Integer> findAllDuplicates(int[] nums) {
        int i = 0;
        while(i< nums.length){
            if(nums[i]!=nums[nums[i]-1]) DuplicateNumber.swap(nums,i,nums[i]-1);
            else i++;
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1) list.add(nums[j]);
        }
        return  list;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2,3};
        System.out.println(findAllDuplicates(nums));
        System.out.println(Arrays.toString(nums));

    }
}