package org.dsa.leetcode.math;
//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
//JPMorgan
public class ChessBoard {
	public boolean squareIsWhite(String coordinates) {
		int c = coordinates.charAt(0)-'a';
		int n = coordinates.charAt(1)-'0';
		return (c+n)%2==0;
	}
}