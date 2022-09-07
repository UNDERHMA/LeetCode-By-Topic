package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class SpiralMatrixTest {

	@Test
	public void test() {
		
		int[][] firstTest = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] secondTest = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] thirdTest = new int[][] {{1}};
		int[][] fourthTest = new int[][] {{2,3,4},{5,6,7},{8,9,10},{11,12,13},{14,15,16}};
		
		Integer[] firstTestResult = new Integer[] {1,2,3,6,9,8,7,4,5};
		Integer[] secondTestResult = new Integer[] {1,2,3,4,8,12,11,10,9,5,6,7};
		Integer[] thirdTestResult = new Integer[] {1};
		Integer[] fourthTestResult = new Integer[] {2,3,4,7,10,13,16,15,14,11,8,5,6,9,12};
		
		SpiralMatrix sm = new SpiralMatrix();
		List<Integer> firstTestList = sm.spiralOrder(firstTest);
		List<Integer> secondTestList = sm.spiralOrder(secondTest);
		List<Integer> thirdTestList = sm.spiralOrder(thirdTest);
		List<Integer> fourthTestList = sm.spiralOrder(fourthTest);
		Integer[] firstTestArray = firstTestList.toArray(new Integer[firstTestList.size()]);
		Integer[] secondTestArray = secondTestList.toArray(new Integer[secondTestList.size()]);
		Integer[] thirdTestArray = thirdTestList.toArray(new Integer[thirdTestList.size()]);
		Integer[] fourthTestArray = fourthTestList.toArray(new Integer[fourthTestList.size()]);
		
		assertArrayEquals(firstTestResult, firstTestArray);
		assertArrayEquals(secondTestResult, secondTestArray);
		assertArrayEquals(thirdTestResult, thirdTestArray);
		assertArrayEquals(fourthTestResult, fourthTestArray);
	}

}
