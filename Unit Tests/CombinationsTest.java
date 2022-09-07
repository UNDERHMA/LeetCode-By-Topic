package leetcode.LeetCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CombinationsTest {

	int n1 = 4;
	int k1 = 2;
	
	int n2 = 1;
	int k2 = 1;
	
	
	Combinations c = new Combinations();
	
	@Test
	public void test() {
		
		
		List<List<Integer>> a1 = new ArrayList<>();
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();
		List<Integer> l3 = new ArrayList<>();
		List<Integer> l4 = new ArrayList<>();
		List<Integer> l5 = new ArrayList<>();
		List<Integer> l6 = new ArrayList<>();
		
		l1.add(2);
		l1.add(4);
		l2.add(3);
		l2.add(4);
		l3.add(2);
		l3.add(3);
		l4.add(1);
		l4.add(2);
		l5.add(1);
		l5.add(3);
		l6.add(1);
		l6.add(4);
		a1.add(l1);
		a1.add(l2);
		a1.add(l3);
		a1.add(l4);
		a1.add(l5);
		a1.add(l6);
		
		List<List<Integer>> a2 = new ArrayList<>();
		List<Integer> l7 = new ArrayList<>();
		l7.add(1);
		a2.add(l7);
		
		assertEquals(a1,c.combine(n1, k1));
		assertEquals(a2,c.combine(n2, k2));
	}

}
