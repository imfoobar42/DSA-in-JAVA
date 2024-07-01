package org.dsa.leetcode.slidingwindow;

import java.util.HashSet;
import java.util.Set;

class LongestSubstring {
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

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew")); // Output: 3
    }
}
