package GooglePrep.GooglePrep;

import AmazonPrep.AmazonPrep.TreeNode;

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        invertTreeRecursively(root);
        return root;
    }

	
	public void invertTreeRecursively(TreeNode root) {
		if(root == null) return;
		TreeNode left = root.left;
		TreeNode right = root.right;
		root.right = left;
		root.left = right;
		invertTreeRecursively(left);
		invertTreeRecursively(right);
	}
}
