package org.dsa.leetcode.string;
 //https://leetcode.com/problems/valid-palindrome
public class ValidPalindrome {

	public static char toLowerCase(char ch){
		if((ch>='A' && ch<='Z'))
			return (char) (ch - 'A'+ 'a');
		else return ch;
	}
	public static boolean isPalindrome(String s) {
		if(s.length()==1) return true;
		//ignore special character
		//convert all character to lowercase
		StringBuilder result = new StringBuilder();
		for(char ch:s.toCharArray()){
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') ||(ch>='0' && ch<='9')){
				result.append(toLowerCase(ch));
			}
		}
		int i = 0, j= result.length()-1;
		while(i<j){//StringBuilder can be directly accessed as an Array
			if(result.charAt(i)!=result.charAt(j)) return false;
			i++; j--;
		}


		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("0P"));
	}
}

