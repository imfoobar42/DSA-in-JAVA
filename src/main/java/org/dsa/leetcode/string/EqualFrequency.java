package org.dsa.leetcode.string;

class EqualFrequency {
  public static boolean equalFrequency(String word) {
    int[] count = new int[26];
    int index =0;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < word.length(); i++) {
      ++count[word.charAt(i) - 'a'];
      if( count[word.charAt(i) - 'a'] > max){
        max = count[word.charAt(i) - 'a'];
        index = i;
      }
    }

    int freq = --count[word.charAt(index) - 'a'];
    
    for (int j = 0; j < word.length(); j++){
      if(count[word.charAt(j) - 'a']!= freq) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(equalFrequency("abcc"));
  }
}