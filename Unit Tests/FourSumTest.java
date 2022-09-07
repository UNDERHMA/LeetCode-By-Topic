package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FourSumTest {
	
	@Test
	public void test() {
		int[] i1 = {1, 0, -1, 0, -2, 2};
		List<List<Integer>> a1 = new ArrayList<>();
		List<Integer> toAdd1 = new ArrayList<>(Arrays.asList(-1,  0, 0, 1));
		List<Integer> toAdd2 = new ArrayList<>(Arrays.asList(-2, -1, 1, 2));
		List<Integer> toAdd3 = new ArrayList<>(Arrays.asList(-2,  0, 0, 2));
		a1.add(toAdd1);
		a1.add(toAdd2);
		a1.add(toAdd3);
		
		int[] i2 = {-3,-1,0,2,4,5};
		List<List<Integer>> a2 = new ArrayList<>();
		List<Integer> toAdd4 = new ArrayList<>(Arrays.asList(-3,-1,2,4));
		a2.add(toAdd4);
		
		int[] i3 = {-3,-2,-1,0,0,1,2,3};
		List<List<Integer>> a3 = new ArrayList<>();
		List<Integer> toAdd5 = new ArrayList<>(Arrays.asList(-3,-2,2,3));
		List<Integer> toAdd6 = new ArrayList<>(Arrays.asList(-3,-1,1,3));
		List<Integer> toAdd7 = new ArrayList<>(Arrays.asList(-3,0,0,3));
		List<Integer> toAdd8 = new ArrayList<>(Arrays.asList(-3,0,1,2));
		List<Integer> toAdd9 = new ArrayList<>(Arrays.asList(-2,-1,0,3));
		List<Integer> toAdd10 = new ArrayList<>(Arrays.asList(-2,-1,1,2));
		List<Integer> toAdd11 = new ArrayList<>(Arrays.asList(-2,0,0,2));
		List<Integer> toAdd12 = new ArrayList<>(Arrays.asList(-1,0,0,1));
		a3.add(toAdd5);
		a3.add(toAdd6);
		a3.add(toAdd7);
		a3.add(toAdd8);
		a3.add(toAdd9);
		a3.add(toAdd10);
		a3.add(toAdd11);
		a3.add(toAdd12);
		
		int[] i4 = {-4,-3,-2,-1,0,0,1,2,3,4};
		List<List<Integer>> a4 = new ArrayList<>();
		List<Integer> toAdd13 = new ArrayList<>(Arrays.asList(-3,-1,2,4));
		a4.add(toAdd13);
		
		//assertEquals(a1, FourSum.fourSum(i1, 0));
		//assertEquals(a2, FourSum.fourSum(i2, 2));
		//assertEquals(a3, FourSum.fourSum(i3, 0));
		assertEquals(a4, FourSum.fourSum(i4, 0));
	}

}
