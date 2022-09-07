package AmazonPrep.AmazonPrep;

public class BinaryTreeMaximumPathSum {
	
	private int maxSum;

	public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
		if(root == null) return maxSum;
		int result = calculate(root);
		return Math.max(maxSum,result);
    }
	
	public int calculate(TreeNode root) {
        if(root == null) return 0;
		int currentSum = root.val;
		int currentSumLeft = Math.max(calculate(root.left),0);
		int currentSumRight = Math.max(calculate(root.right),0);
		currentSum += currentSumLeft + currentSumRight;
		if(currentSum > maxSum) maxSum = currentSum;
		return root.val + Math.max(currentSumLeft, currentSumRight);
    }

}
