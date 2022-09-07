package leetcode.LeetCode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversalRecursive {
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
		          if(root != null) {
		              result.add(root.val);
		              preOrderTraversal(result,root.left);
		              preOrderTraversal(result,root.right);
		          }
		          return result;
		      }
		      
		      public void preOrderTraversal(List<Integer> resultList, TreeNode root) {
		          if(root != null) {
		              resultList.add(root.val);
		              preOrderTraversal(resultList,root.left);
		              preOrderTraversal(resultList,root.right);
		          }
		      }
}
