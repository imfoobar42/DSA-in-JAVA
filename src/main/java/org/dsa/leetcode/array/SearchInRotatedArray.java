package org.dsa.leetcode.array;

class SearchInRotatedArray {

	public static int binary(int[] nums, int target) {
		int low = 0;
		int high = nums.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] == target) {
				return mid;
			}

			// Determine which half is properly ordered
			if (nums[low] <= nums[mid]) { // Left half is normally ordered
				if (nums[low] <= target && target < nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else { // Right half is normally ordered
				if (nums[mid] < target && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}

		return -1; // Target not found
	}

	public static int search(int[] nums, int target) {
		return binary(nums, target);
	}

	public static void main(String[] args) {
		int[] nums = {6, 7, 1, 2, 3, 4, 5};
		int target = 3;
		int result = search(nums, target);
		System.out.println("Index of target " + target + ": " + result);
	}
}
