package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class MeetingRoomsIITest {

	@Test
	public void test() {
		MeetingRoomsII m = new MeetingRoomsII();
		int[][] input = new int[][] {{13,15},{1,13}};
		int[][] input2 = new int[][] {{0,30},{5,10},{15,20}};
		int[][] input3 = new int[][]  {{6,17},{8,9},{11,12},{6,9}};
		
		assertEquals(1,m.minMeetingRooms(input));
		assertEquals(2,m.minMeetingRooms(input2));
		assertEquals(3,m.minMeetingRooms(input3));
	}

}
