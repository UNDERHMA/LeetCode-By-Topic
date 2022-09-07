package AmazonPrep.AmazonPrep;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AmazonQuestion2Test {

	AmazonQuestion2 a2 = new AmazonQuestion2();

	
	
	@Test
	public void test() {

		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(0);
		l1.add(0);
		
		List<Integer> l2 = new ArrayList<>();
		l2.add(1);
		l2.add(0);
		l2.add(0);
		
		List<Integer> l3 = new ArrayList<>();
		l3.add(1);
		l3.add(9);
		l3.add(1);
		
		List<List<Integer>> i1 = new ArrayList<>();
		i1.add(l1);
		i1.add(l2);
		i1.add(l3);
		
		assertEquals(3, AmazonQuestion2.minimumDistance(i1));
		
		
		
		
	}

}
