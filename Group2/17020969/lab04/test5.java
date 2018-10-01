import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test5 {

	@Test
	void testMAX() {
		int max = BTT4.MAX(5, 6);
		assertEquals(6, max);
	}
	@Test
	void testMAX2() {
		int max = BTT4.MAX(15, 6);
		assertEquals(15, max);
	}
	@Test
	void testMAX3() {
		int max = BTT4.MAX(-4, 6);
		assertEquals(6, max);
	}
	@Test
	void testMAX4() {
		int max = BTT4.MAX(50, 6);
		assertEquals(50, max);
	}
	@Test
	void testMAX5() {
		int max = BTT4.MAX(95, 100);
		assertEquals(100, max);
	}
	
	
	@Test
	public void testMIN1() {
		int a[] = {1, 6, 4, 7};
		int min = BTT4.ArrMIN(a);
		assertEquals(1, min);	
	}
	
	@Test
	public void testMIN2() {
		int a[] = {32, 6, 56, 7, 9};
		int min = BTT4.ArrMIN(a);
		assertEquals(6, min);	
	}
	@Test
	public void testMIN3() {
		int a[] = {45, 6, 56, 70, -2};
		int min = BTT4.ArrMIN(a);
		assertEquals(-2, min);	
	}
	@Test
	public void testMIN4() {
		int a[] = {32, -2, -12, 10, 0};
		int min = BTT4.ArrMIN(a);
		assertEquals(-12, min);	
	}
	@Test
	public void testMIN5() {
		int a[] = {30, 12, 60, 0};
		int min = BTT4.ArrMIN(a);
		assertEquals(0, min);	
	}
	@Test
	void testBMI() {
		String BMI = BTT4.timBMI(50, 1.4156);
		//assertEquals(expected, actual);
		assertEquals("Beo phi", BMI);
	}
	@Test
	void testBMI1(){
		String BMI = BTT4.timBMI(60, 1.58);
		//assertEquals(expected, actual);
		assertEquals("Thua can", BMI);
	}
	@Test
	void testBMI2() {
		String BMI = BTT4.timBMI(45, 1.7);
		//assertEquals(expected, actual);
		assertEquals("Thieu can", BMI);
	}
	@Test
	void testBMI3() {
		String BMI = BTT4.timBMI(98, 1.58);
		//assertEquals(expected, actual);
		assertEquals("Beo phi", BMI);
	}
	@Test
	void testBMI4() {
		String BMI = BTT4.timBMI(35, 1.2);
		//assertEquals(expected, actual);
		assertEquals("Thua can", BMI);
	}
}
