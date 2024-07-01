package org.dsa.leetcode.slidingwindow;

//https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/description/
//cardPoints = [1,2,3,4,5,6,1], k = 3
class MaximumPointsFromCards {
    public static int maxScore(int[] cardPoints, int k) {
    int left =0, right=cardPoints.length-1, countLeft = 0, countRight=0, maxSum = 0;
    int count = 0;
    while(k!= cardPoints.length && left<=right && ++count<=k){
        if(cardPoints[left]>cardPoints[right])  ++countLeft;
        else ++countRight;
    }
    if(countRight<countLeft) right = k-1;
    else left = right - k+1;
    // l = 7, k =3 456 , l-k //6-3

    for (int sumPointer = left; sumPointer <=right ; sumPointer++) {
            maxSum += cardPoints[sumPointer];
        }

    return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9};
        System.out.println(maxScore(arr,7));
    }
}