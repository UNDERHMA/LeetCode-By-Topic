package leetcode.LeetCode.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class UniqueBinarySearchTreesII {
	
	/*terrible solution, but it works. Need to complete in different manner to prevent
	duplicate checking which is very costly (comparing all nodes of all results to the
	current result before adding) */
	
	public List<TreeNode> generateTrees(int n) {
		List<TreeNode> result = new ArrayList<TreeNode>();
		Map<Integer,Integer> used = new HashMap<>();
		if(n == 0) {
			return result;
		}
		
		for(int i = 1; i <= n; i++) {
			TreeNode head = new TreeNode(i);
			used.put(i-1,i);
			generateTrees(n,head,used,result);
			used.remove(i-1);
		}
		return result;
    }
	
	public List<TreeNode> generateTrees(int n, TreeNode head, 
			Map<Integer,Integer> used, List<TreeNode> result) {
		if(used.size() == n) {
			TreeNode newHead = clone(head);
			if(isUniqueTree(newHead,result)) result.add(newHead);
			return result;
		}
		for(int i = 1; i <= n; i++) {
			TreeNode newNode = new TreeNode(i);
			TreeNode currentNode = head;
			if(used.containsKey(i-1)) {
				continue;
			}
			used.put(i-1,i);
			// move down tree and add newNode in appropriate place
			while(currentNode.left != newNode && currentNode.right != newNode) {
				if(i < currentNode.val) {
					if(currentNode.left == null) currentNode.left = newNode;
					else currentNode = currentNode.left;
				}
				else {
					if(currentNode.right == null) currentNode.right = newNode;
					else currentNode = currentNode.right;
				}
			}
			// generate depth first possibilities
			generateTrees(n,head,used,result);
			// wipe out newNode and remove it from used
			if(currentNode.right == newNode) currentNode.right = null;
			else currentNode.left = null;
			used.remove(i-1);
		}
		return result;
	}
	
	public TreeNode clone(TreeNode t) {
		TreeNode newHead = new TreeNode(t.val);
		if(t != null) {
			if(t.left != null) newHead.left = clone(t.left);
			if(t.right != null) newHead.right = clone(t.right);
		}
		return newHead;
	}
	
	public boolean isUniqueTree(TreeNode t, List<TreeNode> result) {
		for(TreeNode node : result) {
		// Traverse and return false if duplicate
			Stack<TreeNode> visitedResult = new Stack<>();
			Stack<TreeNode> visitedT = new Stack<>();
			TreeNode current = node;
			TreeNode currentT = t;
			visitedResult.add(current);
			visitedT.add(currentT);
			boolean stop = false;
			while(current != null || !visitedResult.isEmpty()) {
			    while(current != null) {
			    		visitedResult.add(current);
			    		visitedT.add(currentT);
				        if(current.val != currentT.val) {
				        	stop = true;
				        	current = null;
				        	break; 
				        }
				        current = current.left;
				        currentT = currentT.left;
				}
			    if(stop) break;
			    current = visitedResult.pop();
			    currentT = visitedT.pop();
			    current = current.right;
			    currentT = currentT.right;
		    }
			if(!stop) return false;
		}
		return true;
	}
}
