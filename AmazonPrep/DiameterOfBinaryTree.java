package AmazonPrep.AmazonPrep;

public class DiameterOfBinaryTree {

	int max = 0;
	public int diameterOfBinaryTree(TreeNode root) {
    
		if(root == null) return 0;
		int left = diameterOfHalfofBinaryTree(root.left);
		int right = diameterOfHalfofBinaryTree(root.right);
		if((left+right) > max) max = left+right;
		return max;
    }
	
	public int diameterOfHalfofBinaryTree(TreeNode root) {
        
		if(root == null) return 0;
		int left = diameterOfHalfofBinaryTree(root.left);
		int right = diameterOfHalfofBinaryTree(root.right);
		if((left+right) > max) max = left+right;
		left++;
		right++;
		return Math.max(left,right);
    }

}
