package oop_tuan4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testBMI {

	@Test
	public void test() {
		main testBMI = new main();
		String result = testBMI.BMI(1.7, 66);
		String expect = "binh thuong";
		assertEquals(expect, result);
		String result1 = testBMI.BMI(1.6, 67.84);
		String expect1 = "beo phi";
		assertEquals(expect1, result1);
		String result2 = testBMI.BMI(1.65, 64);
		String expect2 = "thua can";
		assertEquals(expect2, result2);
		String result3 = testBMI.BMI(1.65, 49);
		String expect3 = "thieu can";
		assertEquals(expect3, result3);
		String result4 = testBMI.BMI(1.52, 46);
		String expect4 = "binh thuong";
		assertEquals(expect4, result4);
	}

}
