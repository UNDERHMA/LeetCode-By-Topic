package leetcode.LeetCode.BinaryTree;

public class PathSum {
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
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
        	return false;
        }
        sum = sum - root.val;
        if(root.left == null && root.right == null) {
        	if(sum == 0) {
        		return true;
        	}
        	else {
        		return false;
        	}
        }
        return hasPathSum(root.left,sum) ||
        		hasPathSum(root.right,sum);
    }
}
