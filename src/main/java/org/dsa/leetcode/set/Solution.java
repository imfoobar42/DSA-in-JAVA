package org.dsa.leetcode.set;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int longestConsecutive(int[] nums) {
      int max =0;
      Set<Integer> set = new HashSet<>();
      for(int n:nums){
        set.add(n);
      }
      for(int x : set){
        if(!set.contains(x-1)){
          int current = x;
          max =1;
          while(set.contains(current+1)){
            current++;
            max++;
           // max
          }
        }
      }
      return max;
    }

  public static void main(String[] args) {
    System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
  }
}