package GooglePrep.GooglePrep;

import static org.junit.Assert.*;

import org.junit.Test;

public class NextClosestTimeTest {

	@Test
	public void test() {

		String time = "19:34";
		String time2 = "01:32";
		String time3 = "20:48";
		String time4 = "00:13";
		String time5 = "00:05";
		String time6 = "00:00";
		NextClosestTime nct = new NextClosestTime();
		assertEquals("00:50",nct.nextClosestTime(time5));
		assertEquals("19:39",nct.nextClosestTime(time));
		assertEquals("01:33",nct.nextClosestTime(time2));
		assertEquals("22:00",nct.nextClosestTime(time3));
		assertEquals("00:30",nct.nextClosestTime(time4));
		assertEquals("00:00",nct.nextClosestTime(time6));
	}

}
