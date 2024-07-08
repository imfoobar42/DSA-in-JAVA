package org.dsa.leetcode.twopointers;

//https://leetcode.com/problems/remove-element/description/
class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i=0;//index where the unique element can be exchanged
        for (int j = 0; j < nums.length; j++) {
        if(nums[j]!=val){
            nums[i] = nums[j];
            i++;
            }
        }

    return  i;
    }

}