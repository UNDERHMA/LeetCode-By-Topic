package leetcode.LeetCode;

import org.junit.Test;

public class RotateImageTest {

	int[][] input1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	int[][] input2 = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
	int[][] input3 = new int[][] {{1,2},{3,4}};
	
	@Test
	public void test() {
		RotateImage.rotate(input3);
		RotateImage.rotate(input2);
		RotateImage.rotate(input1);
	}

}
