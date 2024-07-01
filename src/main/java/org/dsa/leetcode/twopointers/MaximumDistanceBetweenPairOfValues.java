package org.dsa.leetcode.twopointers;

//https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/
class MaximumDistanceBetweenPairOfValues {
    public static int maxDistance(int[] nums1, int[] nums2) {
        int i = 0, j= 0;
        //intializing the pointers
      //distance is i-j > absolute work or j-i to save on space
      int maxDistance = 0;
      while(i< nums1.length && j< nums2.length){
        if(nums2[j] >= nums1[i]){
          // increment the first pointer
          //maxDistance = Math.max(maxDistance,j- i) ;
          if(maxDistance < j-i) maxDistance = j-i;

          j++;
          // maxDistance = j>i?j-i:i-j;
        }
        else i++;
      }
      return  maxDistance;
    }
    //[30,29,19,5]
  // [25,25,25,25,25]
    public static void main(String[] args) {
      int[] nums1 = {2,2,2};
      int[] nums2 = {10,10,1} ;
      System.out.println(maxDistance(nums1,nums2));
    }
}
