package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestIncreasingPathInAMatrixTest {

	@Test
	public void test() {
		int[][] input = new int[][] {{9,9,4},{6,6,8},{2,1,1}};
		
		LongestIncreasingPathInAMatrix li = new LongestIncreasingPathInAMatrix();
		assertEquals(4,li.longestIncreasingPath(input));
	}

}
