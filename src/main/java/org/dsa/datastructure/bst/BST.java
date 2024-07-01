package org.dsa.datastructure.bst;

public class BST {
	public static void main(String[] args) {
		BinarySearchTree myBst = new BinarySearchTree();
		myBst.insert(47);
		myBst.insert(21);
		myBst.insert(76);
		myBst.insert(18);
		myBst.insert(52);
		myBst.insert(27);
		System.out.println(myBst.root.left.right.value);
		System.out.println(myBst.contains(18));
	}
}
