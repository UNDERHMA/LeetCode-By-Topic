package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CombinationSumTest {
	
	int[] candidates1 = new int[] {2,3,6,7};
	int[] candidates2 = new int[] {2,3,5};
	
	@Test
	public void test() {
		List<List<Integer>> results1 = new ArrayList<>();
		List<List<Integer>> results2 = new ArrayList<>();
		Integer[] array1 = new Integer[] {2,2,3};
		Integer[] array2 = new Integer[] {7};
		Integer[] array3 = new Integer[] {2,2,2,2};
		Integer[] array4 = new Integer[] {2,3,3};
		Integer[] array5 = new Integer[] {3,5};
		results1.add(Arrays.asList(array1));
		results1.add(Arrays.asList(array2));
		results2.add(Arrays.asList(array3));
		results2.add(Arrays.asList(array4));
		results2.add(Arrays.asList(array5));
		assertEquals(results1,CombinationSum.combinationSum(candidates1, 7));
		assertEquals(results2,CombinationSum.combinationSum(candidates2, 8));
	}

}
