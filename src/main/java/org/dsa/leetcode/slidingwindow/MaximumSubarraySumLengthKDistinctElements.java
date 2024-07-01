package org.dsa.leetcode.slidingwindow;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class MaximumSubarraySumLengthKDistinctElements {
  public static long maximumSubarraySumDistinct(int[] nums, int k) {
    long maxSum = 0;
    int currentSum = 0;
    // window of length k
    int currentWindowSize = 0;
    int windowStart = 0 ;
    //[1,5,4,2,9,9,9]
    //maintaining frequency of each element
    Set<Integer> windowElements = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {

    }
    for ( int i = 0; i < nums.length; i++) {
      currentSum += nums[i];
      ++ currentWindowSize;
      if(currentWindowSize>=k){
        if(currentSum >maxSum) maxSum = (long)currentSum;
        currentSum -= nums[windowStart++];
        --currentWindowSize;
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = {1,5,4,2,9,9,9};
    System.out.println(maximumSubarraySumDistinct(nums,3));
  }
}