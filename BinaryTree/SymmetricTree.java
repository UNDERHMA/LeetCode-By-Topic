package leetcode.LeetCode.BinaryTree;

import java.util.Stack;

public class SymmetricTree {
	private class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	}
	public boolean isSymmetric(TreeNode root) {
        if(root == null) {
        	return true;
        }
        return isSymmetric(root.left,root.right);
    }
	
	public boolean isSymmetric(TreeNode left, TreeNode right) {
        if(left == null && right == null) {
        	return true;
        }
        else if(left == null || right == null) {
        	return false;
        }
        else if(left.val != right.val) {
        	return false;
        }
        return isSymmetric(left.left,right.right) &&
        isSymmetric(left.right,right.left);
    }
	
	
}
