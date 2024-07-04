package org.dsa.datastructure.bstleeetcode;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
public class TwoSumBST {
    static List<Integer> list = new ArrayList<>();

    public static void inorderTraversal(TreeNode root){
        //inorder -nlr
        TreeNode temp = root;
        if(root ==null) return ;
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
    }
    public static boolean findTarget(TreeNode root, int k) {
        //Inorder Traversal
        if(list.isEmpty()) return false;
        int i=0, j=list.size()-1;
        while(i<j){
            if(list.get(i)+list.get(j)==k) return  true;
            i++;
            j--;
        }
        return false;
}

}

