package AmazonPrep.AmazonPrep;

public class BinaryTreeInorderPostOrder {

	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1,0,inorder.length,inorder,postorder);
    }

	public TreeNode helper(int preEnd, int inStart, int inLength, int[] inorder,
			int[] postorder) {
		
		//base case
		if(inStart == inLength-1) return new TreeNode(inorder[inStart]);
		if(inStart > inLength-1) return null;
		
		TreeNode root = new TreeNode(postorder[preEnd]);
		int inOrderIndex = 0;
		for(int i = inStart; i < inLength ; i++) {
			if(root.val == inorder[i]) {
				inOrderIndex = i;
			}
		}
		
		root.left = helper(inOrderIndex-1, inStart, inOrderIndex, inorder, postorder);
		root.right = helper(preEnd-1, inOrderIndex+1,inLength,inorder, postorder);
		return root;
	}
}
