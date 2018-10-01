package OopWeek4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Week4Test {

	@Test
	void testTimMax1() {
		int a = Week4.timMax(4, 4);
		assertEquals(4,a);
	}
	@Test
	void testTimMax2() {
		int b = Week4.timMax(3, 3);
		assertEquals(3,b);
	}
	@Test
	void testTimMax3() {
		int c = Week4.timMax(-8, 4);
		assertEquals(4,c);
	}
	@Test
	void testTimMax4() {
		int d = Week4.timMax(1, -2);
		assertEquals(1,d);
	}
	@Test
	void testTimMax5() {
		int e = Week4.timMax(3, 7);
		assertEquals(7,e);
	}
	@Test
	void testTimMinCuaMang1() {
		int[] arr1 = {4,3,7,1,0};
		int a = Week4.timMinCuaMang(arr1);
		assertEquals(0,a);
	}
	@Test
	void testTimMinCuaMang2() {
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		int b = Week4.timMinCuaMang(arr2);
		assertEquals(1,b);
	}
	@Test
	void testTimMinCuaMang3() {
		int[] arr3 = {-4,3,1,1,-4,10,16,0};
		int c = Week4.timMinCuaMang(arr3);
		assertEquals(-4,c);
	}
	@Test
	void testTimMinCuaMang4() {
		int[] arr4 = {-10,-9,-8,-7,-6,-5,-11};
		int d = Week4.timMinCuaMang(arr4);
		assertEquals(-11,d);
	}
	@Test
	void testTimMinCuaMang5() {
		int[] arr5 = {0,1,3,5,7,9,-9,-7,-5,-3,-1,0};
		int e = Week4.timMinCuaMang(arr5);
		assertEquals(-9,e);
	}
	@Test
	void testBMI1() {
		String a = Week4.tinhChiSoBMI(29.4,1.4);
		assertEquals("Thiếu cân",a);
	}
	@Test
	void testBMI2() {
		String b = Week4.tinhChiSoBMI(51.2,1.6);
		assertEquals("Bình thường",b);
	}
	@Test
	void testBMI3() {
		String c = Week4.tinhChiSoBMI(54.0,1.5);
		assertEquals("Thừa cân",c);
	}
	@Test
	void testBMI4() {
		String d = Week4.tinhChiSoBMI(86.7,1.7);
		assertEquals("Béo phì",d);
	}
	@Test
	void testBMI5() {
		String e = Week4.tinhChiSoBMI(40.5,1.5);
		assertEquals("Thiếu cân",e);
	}

}
