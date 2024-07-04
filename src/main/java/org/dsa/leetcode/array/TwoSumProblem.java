package org.dsa.leetcode.array;

//https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //Store value and it's index
        for (int index = 0; index < nums.length; index++) {
            // if (!map.containsKey(nums[index]))
            map.put(nums[index], index);
            if (map.containsKey(target - nums[index]) && map.get(target - nums[index]) != index)
                return new int[]{index, map.get(target - nums[index])};
        }
        return null;
    }
//        }
//        for (int j = 0; j < nums.length; j++) {
//            if ( map.containsKey(target-nums[j]) &&  map.get(target-nums[j]) != j)
//                return new int[]{j, map.get(target - nums[j])};
//        }
//        return null;



    public static void main(String[] args) {
        int[] numb = {3,2,4};
        System.out.println(Arrays.toString(twoSum(numb, 6)));
    }
}