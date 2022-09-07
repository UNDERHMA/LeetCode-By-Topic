package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddEvenJumpTest {

	@Test
	public void test() {

		int[] input = new int[] {1,2,3,2,1,4,4,5};
		int[] input2 = new int[] {1,1,1,1};
		OddEvenJump oej = new OddEvenJump();
		
		assertEquals(6,oej.oddEvenJumps(input));
		assertEquals(4,oej.oddEvenJumps(input2));
	}

}
