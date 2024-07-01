package org.dsa.leetcode.dynamic;

class FrogJump {
    public boolean canCross(int[] stones) {
        int[] jump = new int[stones.length];
        jump[0] = 1;
        int i = 1;
        while(i< stones.length) {
            int difference = stones[i] - jump[i-1];
            if(difference == jump[i-1] || difference == jump[i-1] + 1 || difference == jump[i-1]-1)
                i++;
        }
    return i==stones.length-1;
    }
}