package org.dsa.leetcode.cyclicsort;

public class MaximumSubarraySum {
  public static long maximumSubarraySum(int[] nums, int k) {
    long maxSum = 0;
    int sum = 0;
    // window of length k
    int currentWindowSize = 0;
    int windowStart = 0 ;
    //[1,5,4,2,9,9,9]

    for ( int i = 0; i < nums.length; i++) {
      sum += nums[i];
      ++ currentWindowSize;
      if(sum > maxSum){
       // if(sum >maxSum) maxSum = (long)sum;
        sum -= nums[windowStart++];
        --currentWindowSize;
      }
    }

    return maxSum;
  }

  public static void main(String[] args) {
    int[] nums = {1,5,4,2,9,9,9};
    System.out.println(maximumSubarraySum(nums,3));
  }
}
