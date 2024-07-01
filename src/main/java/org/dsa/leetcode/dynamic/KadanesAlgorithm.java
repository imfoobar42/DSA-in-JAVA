package org.dsa.leetcode.dynamic;

public class KadanesAlgorithm {

  public static int maxSubArray(int[] nums) {
    int globalMaxima = Integer.MIN_VALUE;
    int[] dp= new int[nums.length];
    dp[0] = nums[0];
    for (int i = 1; i < dp.length; i++) {
      dp[i] = Math.max(nums[i],dp[i-1]+nums[i]);
      if(dp[i]>globalMaxima) globalMaxima = dp[i];
    }

    return  globalMaxima;
  }
  public static void main(String[] args) {
    int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));
  }


}


//class Solution {
//  public int maxSubArray(int[] nums) {
//    int max = nums[0], prefix = 0;
//    for(int i = 0; i < nums.length; i++){
//      prefix += nums[i];
//      max = prefix > max ? prefix : max;
//      if(prefix < 0)
//        prefix = 0;
//    }
//    return max;
//  }
//}