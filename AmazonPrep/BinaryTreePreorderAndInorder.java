package AmazonPrep.AmazonPrep;

import java.util.Arrays;

public class BinaryTreePreorderAndInorder {

	public TreeNode buildTree(int[] preorder, int[] inorder) {
	       
        if(preorder.length == 0 || inorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        
        int inorderIndex = 0;
        for(int i = 0; i < inorder.length; i++) {
        	if(root.val == inorder[i]) {
        		inorderIndex = i;
        		break;
        	}
        }
        
        root.left = buildTree(Arrays.copyOfRange(preorder,1,preorder.length),
        		Arrays.copyOfRange(inorder,0,inorderIndex));
        root.right = buildTree(Arrays.copyOfRange(preorder,inorderIndex+1,preorder.length),
        		Arrays.copyOfRange(inorder,inorderIndex+1,inorder.length));
        return root;
	}
}

