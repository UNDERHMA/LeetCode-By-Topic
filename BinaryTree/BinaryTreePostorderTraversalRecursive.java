package leetcode.LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversalRecursive {
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
	public List<Integer> postorderTraversal(TreeNode root) {
	    
	    List<Integer> result = new ArrayList<>();
	    if(root != null) {
	    	postorderTraversal(result,root.left);
	        postorderTraversal(result,root.right);
	        result.add(root.val);
	    }
	    return result;
	}
	
	public void postorderTraversal(List<Integer> resultList, TreeNode root) {
	    if(root != null) {
	    	postorderTraversal(resultList,root.left);
	    	postorderTraversal(resultList,root.right);
	    	resultList.add(root.val);
	    }
	}
}
