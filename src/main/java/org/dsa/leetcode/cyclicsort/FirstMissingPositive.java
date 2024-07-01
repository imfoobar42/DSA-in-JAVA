package org.dsa.leetcode.cyclicsort;

//https://leetcode.com/problems/first-missing-positive/description/
//Cyclic sort ignores values which do not come in range of 1-N eg. 0,

class FirstMissingPositive {
  public void swap(int[] arr, int i, int j) {
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;
  }

  // Ignore Negative no's (coz positive no's are asked) and n>length
  public int firstMissingPositive(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      if (nums[i] > 0 && nums[i] < nums.length && nums[i] != nums[nums[i] - 1])
        swap(nums, i, nums[i] - 1);
      else
        i++;
    }
    //1,-1,3,4
    for( i=0;i<nums.length;i++){
      if(nums[i]!=i+1) return (i+1);
    }
    return nums.length+1; //if all no's are present from 1 to N then N+1 is first +ve missing no
  }
}