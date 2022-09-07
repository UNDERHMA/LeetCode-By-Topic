package leetcode.LeetCode.BinaryTree;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {        
		if(root == null) {
			return 0;
		}
        int depth = 0;
		depth = Math.max(maxDepth(root.left)+1,depth);
        depth = Math.max(maxDepth(root.right)+1,depth);
		return depth;
    }
}
