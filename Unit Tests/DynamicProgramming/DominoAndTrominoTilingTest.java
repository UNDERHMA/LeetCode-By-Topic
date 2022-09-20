package leetcode.LeetCode.DynamicProgramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DominoAndTrominoTilingTest {

	@Test
	void test() {
		DominoAndTrominoTiling d = new DominoAndTrominoTiling();
		assertEquals(312342182, d.numTilings(30));
	}

}
