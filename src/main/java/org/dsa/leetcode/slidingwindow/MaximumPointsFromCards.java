package org.dsa.leetcode.slidingwindow;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
//cardPoints = [1,2,3,4,5,6,1], k = 3
class MaximumPointsFromCards {
    public static int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = 0, l =0;

        // Calculate total sum of all card points
        for (int point : cardPoints) {
            totalSum += point;
        }

        // If we need to take all cards
        if (n == k)
            return totalSum;

        // Find the minimum sum of n-k elements window
        int windowSum = 0;
        int minWindowSum = Integer.MAX_VALUE;

        // Calculate the initial window sum for the first n-k elements
        //TC : O(n) SC:O(1)
        for (int r = 0; r < n; r++) {
            windowSum += cardPoints[r];
            if(r-l+1 >= n-k){ //shift once window size equal n-k
                minWindowSum = minWindowSum <= windowSum ? minWindowSum : windowSum;
                windowSum -= cardPoints[l++];
            }
        }

        return totalSum - minWindowSum;
    }


    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9};
        System.out.println(maxScore(arr,7));
    }
}