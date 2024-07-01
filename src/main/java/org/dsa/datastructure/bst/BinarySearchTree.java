package org.dsa.datastructure.bst;

public class BinarySearchTree {
	public Node root;


	class Node{
		int value;
		Node left;
		Node right;
		Node(int value){
			this.value	=	value;
		}
	}
	public boolean insert(int value){
		//2 edge cases
		// 1. root=null 2.Value already present
	Node newNode = new Node(value);
	if(root==null) {
		root = newNode;
		return true;
	}
		Node temp = root;
	while(true){
		//will return after insertion or of value present
		if(temp.value ==value) return false;
		if(newNode.value< temp.value) {
			if(temp.left==null){
				temp.left = newNode;
				return true;
			}
			temp = temp.left;
		}
		else{
			if(temp.right==null){
				temp.right = newNode;
				return true;
			}
				temp = temp.right;
			}
	}
	}

	public boolean contains(int value){
		Node temp = root;
		while(temp!=null){
			if(temp.value == value) return true;
			else if(temp.value < value) temp= temp.right;
			else temp = temp.left;
		}
		return false;
	}
}
