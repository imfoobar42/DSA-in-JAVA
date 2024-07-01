package org.dsa.leetcode.greedy;

public class MaxProduct {


  public static int maxProduct(int[] nums) {
    //create a window
    int windowSize = 1;
    int maxValueProduct = nums[0];
    int newValue = maxValueProduct;
   // int k =
    for(int i=1; i< nums.length; i++){
      maxValueProduct *= nums[i];
      if(newValue > maxValueProduct) maxValueProduct = newValue;

    }
    return maxValueProduct;

  }
}
