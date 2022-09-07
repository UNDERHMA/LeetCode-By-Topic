package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class CourseScheduleIITest {

	@Test
	public void test() {
		int[] answer1 = new int[] {1,0};
		int[][] input1 = new int[0][0];
		
		CourseScheduleII c = new CourseScheduleII();
		
		assertArrayEquals(answer1,c.findOrder(2, input1));
	}

}
