package leetcode.LeetCode;

import static org.junit.Assert.*;

import org.junit.Test;

public class NextPermutationTest {

	int[] input1 = new int[] {1,2,3,4};
	int[] input2 = new int[] {1,1};
	int[] input3 = new int[] {1,3,2};
	int[] input4 = new int[] {1,3,2,4,6,2,4,6,6,2};
	int[] input5 = new int[] {5,4,7,5,3,2};
	int[] input6 = new int[] {2,2,7,5,4,3,2,2,1};
	int[] input7 = new int[] {100,99,98,97,96,95,94,93,92,91,90,89,88,87,86,85,84,83,82,81,80,79,78,77,76,75,74,73,72,71,70,69,68,67,66,65,64,63,62,61,60,59,58,57,56,55,54,53,52,51,50,49,48,47,46,45,44,43,42,41,40,39,38,37,36,35,34,33,32,31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
	
	
	
	@Test
	public void test() {
		//assertEquals(input1, NextPermutation.nextPermutation(input1));
		//assertEquals(input2, NextPermutation.nextPermutation(input2));
		//assertEquals(input3, NextPermutation.nextPermutation(input3));
		//assertEquals(input4, NextPermutation.nextPermutation(input4));
		//assertEquals(input5, NextPermutation.nextPermutation(input5));
		//assertEquals(input6, NextPermutation.nextPermutation(input6));
		//assertEquals(input7, NextPermutation.nextPermutation(input7));
		for(int i: input7) {
			System.out.print(i);
		}
	}

}
