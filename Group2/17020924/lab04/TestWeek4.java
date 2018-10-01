package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestWeek4 {

	@Test
	void testMax1() {
		int a = MinMaxandBMI.Maxab(4, 4);
		assertEquals(4,a);
	}
	@Test
	void testMax2() {
		int b = MinMaxandBMI.Maxab(3, 3);
		assertEquals(3,b);
	}
	@Test
	void testMax3() {
		int c = MinMaxandBMI.Maxab(-8, 4);
		assertEquals(4,c);
	}
	@Test
	void testMax4() {
		int d = MinMaxandBMI.Maxab(1, -2);
		assertEquals(1,d);
	}
	@Test
	void testMax5() {
		int e = MinMaxandBMI.Maxab(3, 7);
		assertEquals(7,e);
	}
	@Test
	void testMin1() {
		int[] arr0 = {4,3,7,1,0};
		int a = MinMaxandBMI.MinArr(arr0);
		assertEquals(0,a);
	}
	@Test
	void testMin2() {
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int b = MinMaxandBMI.MinArr(arr1);
		assertEquals(1,b);
	}
	@Test
	void testMin3() {
		int[] arr2 = {-4,3,1,1,-4,10,16,0};
		int c = MinMaxandBMI.MinArr(arr2);
		assertEquals(-4,c);
	}
	@Test
	void testMin4() {
		int[] arr3 = {-10,-9,-8,-7,-6,-5,-11};
		int d = MinMaxandBMI.MinArr(arr3);
		assertEquals(-11,d);
	}
	@Test
	void testMin5() {
		int[] arr4 = {0,1,3,5,7,9,-9,-7,-5,-3,-1,0};
		int e = MinMaxandBMI.MinArr(arr4);
		assertEquals(-9,e);
	}
	@Test
	void testBMI1() {
		String a = MinMaxandBMI.printBMI(29.4,1.4);
		assertEquals("Thiếu cân",a);
	}
	@Test
	void testBMI2() {
		String b = MinMaxandBMI.printBMI(51.2,1.6);
		assertEquals("Bình thường",b);
	}
	@Test
	void testBMI3() {
		String c = MinMaxandBMI.printBMI(54.0,1.5);
		assertEquals("Thừa cân",c);
	}
	@Test
	void testBMI4() {
		String d = MinMaxandBMI.printBMI(86.7,1.7);
		assertEquals("Béo phì",d);
	}
	@Test
	void testBMI5() {
		String e = MinMaxandBMI.printBMI(40.5,1.5);
		assertEquals("Thiếu cân",e);
	}

}
