package AmazonPrep.AmazonPrep;

public class LowestCommonAncestorOfABinaryTree {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
		if(root == null || p == null || q == null) return null;
		TreeNode left = lowestCommonAncestor(root.left,p,q);
		TreeNode right = lowestCommonAncestor(root.right,p,q);
        if(root == p || root == q) return root;
		if(left != null && right != null) return root;
		if(left != null) return left;
		if(right != null) return right;
		return null;
    }
}
