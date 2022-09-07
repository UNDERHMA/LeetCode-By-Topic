package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class PermutationsTest {
	
	int[] input1 = new int[] {1,2,3};

	@Test
	public void test() {
	
		List<List<Integer>> result1 = Permutations.permute(input1);
		
		for(List<Integer> l : result1) {
			System.out.print("[");
			for(Integer i : l) {
				System.out.print(i + ",");
			}
			System.out.println("],");
		}
		
	}

}
