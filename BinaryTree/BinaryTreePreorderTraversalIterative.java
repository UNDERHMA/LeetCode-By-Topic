package leetcode.LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversalIterative {
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
		public List<Integer> preorderTraversal(TreeNode root) {
		    
		    List<Integer> result = new ArrayList<>();
		    Stack<TreeNode> visited = new Stack<>();
		    if(root == null) {
		    	return result;
		    }
		    TreeNode current = root;
		    while(current != null || !visited.isEmpty()) {
			    while(current != null) {
				        result.add(current.val);
				        visited.add(current);
				        current = current.left;
				}
			    current = visited.pop();
			    current = current.right;
		    }
		    return result;
		}
}
