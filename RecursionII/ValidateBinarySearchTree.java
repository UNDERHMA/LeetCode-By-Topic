package leetcode.LeetCode.RecursionII;

public class ValidateBinarySearchTree {
	
	public boolean isValidBST(TreeNode root) {
		if(root == null) {
			return true;
		}
		if(isValidBST(root.left,null,root.val) 
				&& isValidBST(root.right,root.val,null)) 
			return true;
		else return false;
    }
	// credit to Jeantimex for Integer solution
	// solution was made after seeing his solution
	public boolean isValidBST(TreeNode root, Integer min, Integer max) {
		if(root == null) {
			return true;
		}
		if((min != null && min >= root.val) || (max != null && max <= root.val))
			return false;
		if(isValidBST(root.left,min,root.val) 
				&& isValidBST(root.right,root.val,max)) 
			return true;
		else return false;
    }
}