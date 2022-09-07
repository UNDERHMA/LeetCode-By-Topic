package AmazonPrep.AmazonPrep;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeZigZagLevelTraversal {
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
		List<List<Integer>> result = new ArrayList<>();
		if(root == null) return result;
		Deque<TreeNode> queue = new ArrayDeque<>();
		queue.add(root);
		
		int levelSize;
		boolean directionBitLeftToRightTrue = true;
		TreeNode current;
		while(!queue.isEmpty()) {
			levelSize = queue.size();
			List<Integer> levelResults = new ArrayList<>(); 
			for(int i = 0; i < levelSize; i++) {
				current = queue.pollFirst();
				levelResults.add(current.val);
				if(current.left != null) queue.add(current.left);
				if(current.right != null) queue.add(current.right);
			}
			if(!directionBitLeftToRightTrue) reverse(levelResults);
			result.add(levelResults);
			directionBitLeftToRightTrue = !directionBitLeftToRightTrue;
		}
		return result;
    }
	
	public void reverse(List<Integer> inputList) {
		
		int inputListLength = inputList.size();
		int inputListMidpoint = inputListLength/2;
		int temp;
		for(int i = 0; i < inputListMidpoint; i++) {
			temp = inputList.get(i);
			inputList.set(i, inputList.get(inputListLength-1-i));
			inputList.set(inputListLength-1-i, temp);
		}
	}
}
