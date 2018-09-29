package oop_tuan4;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestGetMax {

	@Test
	public void testgetMax() {
		main testMain = new main();
		int result = testMain.getMax(2, 1);
		int expect = 2;
		assertEquals(expect, result);
		int result1 = testMain.getMax(2, 1);
		int expect1 = 2;
		assertEquals(expect1, result1);
		int result2 = testMain.getMax(-1, 1);
		int expect2 = 1;
		assertEquals(expect2, result2);
		int result3 = testMain.getMax(0, 0);
		int expect3 = 0;
		assertEquals(expect3, result3);
		int result4 = testMain.getMax(-10000, -9999);
		int expect4 = -9999;
		assertEquals(expect4, result4);
	}
}
