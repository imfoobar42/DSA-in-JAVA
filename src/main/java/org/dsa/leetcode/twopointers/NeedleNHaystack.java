package org.dsa.leetcode.twopointers;

class NeedleNHaystack {

    public static int strStr(String haystack, String needle) {
        // Edge case: If needle is empty, return 0 as per problem definition
        if (needle.length() == 0)
            return 0;

        // Edge case: If needle is longer than haystack, it can't be found, return -1
        if (needle.length() > haystack.length())
            return -1;

        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int i = 0;

        // Iterate through haystack
        for (int j = 0; j < haystack.length(); j++) {
            if (h[j] == n[i]) {
                i++;
                // If the entire needle has been found, return the start index
                if (i == n.length)
                    return j - i + 1;
            } else {
                // Reset i and adjust j to the next potential starting position
                j -= i; // backtrack j to where the match attempt started
                i = 0;
            }
        }
        return -1; // Needle not found in haystack
    }

    public static void main(String[] args) {
        //Solution solution = new Solution();

        // Test cases
      /*  String haystack1 = "hello";
        String needle1 = "ll";
        System.out.println("Index of 'll' in 'hello': " + NeedleNHaystack.strStr(haystack1, needle1));  // Expected output: 2

        String haystack2 = "aaaaa";
        String needle2 = "bba";
        System.out.println("Index of 'bba' in 'aaaaa': " + NeedleNHaystack.strStr(haystack2, needle2));  // Expected output: -1

        String haystack3 = "";
        String needle3 = "";
        System.out.println("Index of '' in '': " + NeedleNHaystack.strStr(haystack3, needle3));  // Expected output: 0
*/
        String haystack4 = "mississippi";
        String needle4 = "issip";
        System.out.println("Index of 'issip' in 'mississippi': " + NeedleNHaystack.strStr(haystack4, needle4));  // Expected output: 4
    }
}
