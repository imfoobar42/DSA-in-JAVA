package org.dsa.leetcode.cyclicsort;

import java.util.Arrays;


//https://leetcode.com/problems/find-the-duplicate-number/
//Amazon, Apple
public class DuplicateNumber {

    public static void swap(int[] arr, int i, int j){
      int temp = arr[j];
      arr[j] = arr[i];
      arr[i] = temp;
    }
    public static int findDuplicate(int[] nums) {
        //n+1 1-n
      int i = 0;
      while(i<nums.length){
        if(nums[i]!=nums[nums[i]-1]) swap(nums,i,nums[i]-1);
        else i++;
      }
      for (int j = 0; j < nums.length; j++) {
        if(nums[j]!=j+1) return nums[j];
      }

      return  0;
    }

  public static void main(String[] args) {
    int[] nums = {1,3,4,2,2};
    System.out.println(findDuplicate(nums));
    System.out.println(Arrays.toString(nums));

  }
}