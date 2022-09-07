package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

	int[] preorder = new int[] {3,9,20,15,7};
	int[] inorder = new int[] {9,3,15,20,7};
	
	ConstructBinaryTreeFromPreorderAndInorderTraversal c = new ConstructBinaryTreeFromPreorderAndInorderTraversal();
	
	@Test
	public void test() {
		assertEquals(null,c.buildTree(preorder, inorder));
	}

}
