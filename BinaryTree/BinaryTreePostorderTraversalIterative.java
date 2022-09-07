package leetcode.LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class BinaryTreePostorderTraversalIterative {
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
	    Stack<TreeNode> rootNodes = new Stack<>();
	    if(root == null) {
	    	return result;
	    }
	    TreeNode current = root;
	    TreeNode left = current.left;
	    TreeNode right = current.right;
	    while(current != null || !rootNodes.isEmpty()) {
	    	if(current == null) {
		    	current = rootNodes.pop();
		    }
	    	left = current.left;
		    right = current.right;
	    	result.add(0,current.val);
		    if(left != null) {
		    	rootNodes.push(current.left);
		    }
		    current = right;
	    }
	    return result;
	}
}
