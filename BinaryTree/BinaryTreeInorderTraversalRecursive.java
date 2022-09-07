package leetcode.LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversalRecursive {
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
	public List<Integer> inorderTraversal(TreeNode root) {
	    
	    List<Integer> result = new ArrayList<>();
	    if(root != null) {
	    	inorderTraversal(result,root.left);
	        result.add(root.val);
	        inorderTraversal(result,root.right);
	    }
	    return result;
	}
	
	public void inorderTraversal(List<Integer> resultList, TreeNode root) {
	    if(root != null) {
	    	inorderTraversal(resultList,root.left);
	    	resultList.add(root.val);
	        inorderTraversal(resultList,root.right);
	    }
	}
}
