package org.dsa.leetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

class LongestSubstring {
    //Solution 1
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
//pwwkew 01234 l2 r 4 4-2=

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left+1);
                right ++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
    //Solution 2
    public static int lengthOfLongestSubstring2(String s) {
        int count = 0, left = 0, right = 0;
        //char[] arr = s.toCharArray();

        for (int i = 0; i < s.length()-1; i++) {
            //aabcdef

            if (s.charAt(i) != s.charAt(i + 1)) {
                right = i + 1;
            } else left = i + 1;
        }
        for (int j = left; j <= right; j++) {
            count++;
        }

        return count==0?1:count;
    }
    //Solution 3
    public static int lengthOfLongestSubstring3(String s) {
        int n = s.length();
        if (n == 0) return 0; // Handle empty string case

        int[] hash = new int[256];
        int max = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char rightChar = s.charAt(right);
            hash[rightChar]++;

            while (hash[rightChar] > 1) {
                char leftChar = s.charAt(left);
                hash[leftChar]--;
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring3("pwwkew")); // Output: 3
    }
}
