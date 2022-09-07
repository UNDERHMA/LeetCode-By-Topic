package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinimumCostToHireKWorkersTest {

	@Test
	public void test() {
		int[] quality = new int[] {10,20,5};
		int[] wage = new int[] {70,50,30};
		
		int[] quality2 = new int[] {3,1,10,10,1};
		int[] wage2 = new int[] {4,8,2,2,7};
		
		MinimumCostToHireKWorkers m = new MinimumCostToHireKWorkers();
		
		assertEquals(30.66667, m.mincostToHireWorkers(quality2, wage2, 3),1);
		assertEquals(105.00, m.mincostToHireWorkers(quality, wage, 2),1);
	}

}
