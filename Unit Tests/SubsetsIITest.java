package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SubsetsIITest {
	
	int[] input1 = new int[] {1,2,3};
	int[] input2 = new int[] {0};
	
	int[][] result1 = new int[][] {{},{1},{1,2},{1,2,2},{2},{2,2}};
	int[][] result2 = new int[][] {{},{0}};
	
	SubsetsII s = new SubsetsII();
	
	@Test
	public void test() {
		assertArrayEquals(result1,converter(s.subsetsWithDup(input1)));
		assertArrayEquals(result2,converter(s.subsetsWithDup(input2)));
	}
	
	public int[][] converter(List<List<Integer>> input) {
		
		int maxLength = 0;
		for(List<Integer> l : input) {
			if(l.size() > maxLength) maxLength = l.size();
		}
		
		int[][] result = new int[input.size()][maxLength];
		for(int i = 0; i < input.size(); i++) {
			for(int j = 0; j < input.get(i).size(); j++) {
				result[i][j] = input.get(i).get(j);
			}
		}
		return result;
	}

}
