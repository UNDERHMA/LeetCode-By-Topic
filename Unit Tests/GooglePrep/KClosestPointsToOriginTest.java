package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class KClosestPointsToOriginTest {

	@Test
	public void test() {
		int[][] input1 = new int[][] {{1,3},{-2,2}};
		int[][] input2 = new int[][] {{3,3},{5,-1},{-2,4}};
		
		KClosestPointsToOrigin k = new KClosestPointsToOrigin();
		
		assertArrayEquals(new int[][] {{-2,2}} , k.kClosest(input1, 1));
		assertArrayEquals(new int[][] {{-2,4},{3,3}} , k.kClosest(input2, 2));
	}

}
