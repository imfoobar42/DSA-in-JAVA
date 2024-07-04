package org.dsa.leetcode.twopointers;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray{
    public static int removeDuplicates(int[] nums) {
        int i=0,j=1;
        while(j<nums.length)
            if(nums[i]==nums[j])    j++;
            else {
                i = i+1;
                nums[i] = nums[j];
            }

        return i+1;
        }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
    }
}