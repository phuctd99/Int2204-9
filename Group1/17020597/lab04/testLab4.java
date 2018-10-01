package Lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testLab4 {

	@Test
	void testMax1() {
		int n = Lab04abd.maximumNumber(3 , 5); // test max1
		assertEquals(5, n);
	}
	@Test
	void testMax2() {
		//Lab04abd cd = new Lab04abd();
		int n = Lab04abd.maximumNumber(0, 0); // test max2
		assertEquals(0, n);
	}
	@Test
	void testMax3() {
		//Lab04abd cd = new Lab04abd();
		int n = Lab04abd.maximumNumber(-3, -11); // test max3
		assertEquals(-3, n);
	}
	@Test
	void testMax4() {
		//Lab04abd cd = new Lab04abd();
		int n = Lab04abd.maximumNumber(-99, 21); // test max4
		assertEquals(21, n);
	}
	@Test
	void testMax5() {
		//Lab04abd cd = new Lab04abd();
		int n = Lab04abd.maximumNumber(-1000, -999); // test max5
		assertEquals(-999, n);
	}
	@Test
	void testMin1() {
		//Lab04abd cd = new Lab04abd();
		int[] arr = {4, 6, 2, 7, 6, 9}; // test min1
		int n = Lab04abd.minimumArr(arr);
		assertEquals(2, n);
	}
	@Test
	void testMin2() {
		//Lab04abd cd = new Lab04abd();
		int[] arr = {0, 0, 3, -3, -5, -5, 22}; // test min2
		int n = Lab04abd.minimumArr(arr);
		assertEquals(-5, n);
	}
	@Test
	void testMin3() {
		//Lab04abd cd = new Lab04abd();
		int[] arr = {2, 9, 6, 3, 1, 6}; // test min3
		int n = Lab04abd.minimumArr(arr);
		assertEquals(1, n);
	}
	@Test
	void testMin4() {
		//Lab04abd cd = new Lab04abd();
		int[] arr = {99, -10, -9, -8, -22}; // test min4
		int n = Lab04abd.minimumArr(arr);
		assertEquals(-22, n);
	}
	@Test
	void testMin5() {
		//Lab04abd cd = new Lab04abd();
		int[] arr = {0, -9}; // test min5
		int n = Lab04abd.minimumArr(arr);
		assertEquals(-9, n);
	}
	
	@Test
	void testBMI1() {
		//Lab04abd cd = new Lab04abd();
		String s = Lab04abd.BMI(46, 1.59);
		assertEquals("Thiếu cân", s);
		
	}
	
	@Test
	void testBMI2() {
		//Lab04abd cd = new Lab04abd();
		String s = Lab04abd.BMI(50, 1.62);
		assertEquals("Bình thường", s);
	}
	@Test
	void testBMI3() {
		//Lab04abd cd = new Lab04abd();
		String s = Lab04abd.BMI(60, 1.55);
		assertEquals("Thừa cân", s);
	}
	@Test
	void testBMI4() {
		//Lab04abd cd = new Lab04abd();
		String s = Lab04abd.BMI(100, 1.54);
		assertEquals("Béo phì", s);
	}
	@Test
	void testBMI5() {
		//Lab04abd cd = new Lab04abd();
		String s = Lab04abd.BMI(150, 1.99);
		assertEquals("Béo phì", s);
	}
}
