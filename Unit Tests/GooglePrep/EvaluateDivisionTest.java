package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class EvaluateDivisionTest {

	@Test
	public void test() {
		List<List<String>> equations = new ArrayList<>();
		List<List<String>> queries = new ArrayList<>();
		double[] values = new double[]{2.0,3.0};
		
		List<String> e1 = Arrays.asList("a","b");
		List<String> e2 = Arrays.asList("b","c");
		equations.add(e1);
		equations.add(e2);
		
		List<String> q1 = Arrays.asList("a","c");
		List<String> q2 = Arrays.asList("b","a");
		List<String> q3 = Arrays.asList("a","e");
		List<String> q4 = Arrays.asList("a","a");
		List<String> q5 = Arrays.asList("x","x");
		queries.add(q1);
		queries.add(q2);
		queries.add(q3);
		queries.add(q4);
		queries.add(q5);
		
		EvaluateDivision ed = new EvaluateDivision();
		
		assertTrue(Arrays.equals(new double[] {6.00000,0.50000,-1.00000,1.00000,-1.00000}, 
				ed.calcEquation(equations, values, queries)));
		
		
		equations = new ArrayList<>();
		queries = new ArrayList<>();
		values = new double[]{1.5,2.5,5.0};
		
		e1 = Arrays.asList("a","b");
		e2 = Arrays.asList("b","c");
		List<String> e3 = Arrays.asList("bc","cd");
		equations.add(e1);
		equations.add(e2);
		equations.add(e3);
		
		q1 = Arrays.asList("a","c");
		q2 = Arrays.asList("c","b");
		q3 = Arrays.asList("bc","cd");
		q4 = Arrays.asList("cd","bc");
		queries.add(q1);
		queries.add(q2);
		queries.add(q3);
		queries.add(q4);;
		
		
		assertTrue(Arrays.equals(new double[] {3.75000,0.40000,5.00000,0.20000}, 
				ed.calcEquation(equations, values, queries)));
	}

}
