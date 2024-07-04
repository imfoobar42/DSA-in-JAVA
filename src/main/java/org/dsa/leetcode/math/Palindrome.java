package org.dsa.leetcode.math;

public class Palindrome {
   public static boolean isPalindrome(int x) {
        int reverse  = 0, temp = x;
        while(temp >0){
            reverse = reverse*10 + (temp%10);
            temp /=10;
        }
        return (reverse==x);

    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome(121));
    }
}