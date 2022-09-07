package leetcode.LeetCode.BinaryTree;

public class BinaryTreeFromInorderAndPostorderTraversal {
	
	public static void main(String[] args) {
		int[] inorder = new int[] {9,3,15,20,7};
		int[] postorder = new int[] {9,15,7,20,3};
		buildTree(inorder,postorder);
	}
	/*private class TreeNode {
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
	}*/
	public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length == 0) {
        	return null;
        }
        int currentPostOrderIndex = postorder.length-1;
        TreeNode root = new TreeNode(postorder[currentPostOrderIndex]);
        currentPostOrderIndex--;
        int rootInOrderIndex = 0;
        for(int i = 0 ; i < inorder.length; i++) {
        	if(inorder[i] == root.val) {
        		rootInOrderIndex = i;
        		i = inorder.length;
        	}
        }
        currentPostOrderIndex = buildTree(inorder,postorder,root,
        		currentPostOrderIndex,rootInOrderIndex,inorder.length-1,false);
        buildTree(inorder,postorder,root,
        		currentPostOrderIndex,0,rootInOrderIndex,true);
        return root;
    }
	
	public static int buildTree(int[] inorder, int[] postorder, TreeNode root, 
			int currentPostOrderIndex, int currentInOrderIndex, 
			int endIndex, boolean buildLeft) {
		
		for(int i = currentInOrderIndex ; i <= endIndex; i++) {
			if(currentPostOrderIndex < 0) {
	            return currentPostOrderIndex;
	        }
        	if(inorder[i] == postorder[currentPostOrderIndex]) {
        		TreeNode current = new TreeNode(postorder[currentPostOrderIndex]);
                currentPostOrderIndex--;
                if(buildLeft) {
                	root.left = current;
                }
                else {
                	root.right = current;
                }
                currentPostOrderIndex = buildTree(inorder,postorder,current,
                		currentPostOrderIndex,i,endIndex,buildLeft);
        	}
        }
		for(int i = endIndex ; i >= currentInOrderIndex; i--) {
			if(currentPostOrderIndex < 0) {
	            return currentPostOrderIndex;
	        }
        	if(inorder[i] == postorder[currentPostOrderIndex]) {
        		if(buildLeft) {
                	root = root.left;
                }
                else {
                	root = root.right;
                }
        		TreeNode current = new TreeNode(postorder[currentPostOrderIndex]);
                currentPostOrderIndex--;
                if(buildLeft) {
                	root.right = current;
                }
                else {
                	root.left = current;
                }
                currentPostOrderIndex = buildTree(inorder,postorder,current,
                		currentPostOrderIndex,currentInOrderIndex,i,buildLeft);
        	}
        }
		return currentPostOrderIndex;
    }
}