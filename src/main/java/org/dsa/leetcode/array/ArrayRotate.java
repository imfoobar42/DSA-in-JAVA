package org.dsa.leetcode.array;

import java.util.Arrays;

import static org.dsa.leetcode.cyclicsort.DuplicateNumber.swap;

public class ArrayRotate {
  //cyclic rotate
  //invert METHOD -> 0 to n-1, 0 to k-1, k to n-1
  public static void rotate(int[] nums, int k) {
    // Ensure k is within the bounds of the array length
    k = k % nums.length;

    // Invert the entire array
    reverse(nums, 0, nums.length - 1);

    // Invert the first k elements
    reverse(nums, 0, k - 1);

    // Invert the remaining elements
    reverse(nums, k, nums.length - 1);
  }

  // Helper method to reverse a portion of the array
  private static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      swap(nums, start, end);
      start++;
      end--;
    }
  }

  public static void main(String[] args) {
    int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
    int k1 = 3;
    rotate(nums1, k1);
    System.out.println("Test case 1: Rotated array: " + Arrays.toString(nums1));  // prints "Rotated array: [5, 6, 7, 1, 2, 3, 4]"

    int[] nums2 = {-1, -100, 3, 99};
    int k2 = 2;
    rotate(nums2, k2);
    System.out.println("Test case 2: Rotated array: " + Arrays.toString(nums2));  // prints "Rotated array: [3, 99, -1, -100]"

    int[] nums3 = {1, 2};
    int k3 = 3;
    rotate(nums3, k3);
    System.out.println("Test case 3: Rotated array: " + Arrays.toString(nums3));  // prints "Rotated array: [2, 1]"

    int[] nums4 = {1};
    int k4 = 0;
    rotate(nums4, k4);
    System.out.println("Test case 4: Rotated array: " + Arrays.toString(nums4));  // prints "Rotated array: [1]"

    int[] nums5 = {1, 2, 3, 4, 5, 6};
    int k5 = 6;
    rotate(nums5, k5);
    System.out.println("Test case 5: Rotated array: " + Arrays.toString(nums5));  // prints "Rotated array: [1, 2, 3, 4, 5, 6]"


  }
}
