package leetcode.LeetCode.BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
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
		
		public List<List<Integer>> levelOrder(TreeNode root) {
		
			List<List<Integer>> results = new ArrayList<>();
			Deque<TreeNode> queue = new ArrayDeque<>();
			if(root == null) {
				return results;
			}
			TreeNode current = root;
			TreeNode leftChild = current.left;
			TreeNode rightChild = current.right;
			int queueSize = 0;
			queue.add(current);
			
			while(!queue.isEmpty()) {
				List<Integer> resultGroup = new ArrayList<>();
				queueSize = queue.size();
				while(queueSize > 0) {
					current = queue.pollFirst();
					leftChild = current.left;
					rightChild = current.right;
					resultGroup.add(current.val);
					if(leftChild!=null) {
						queue.add(leftChild);
					}
					if(rightChild!=null) {
						queue.add(rightChild);
					}
					queueSize--;
				}
				results.add(resultGroup);
			}
			return results;
	    }
}
