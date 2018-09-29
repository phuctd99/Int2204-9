package oop_tuan4;

import static org.junit.Assert.*;

import org.junit.Test;

public class testFindMin extends main {

	@Test
	public void testfindMin() {
		main newMain = new main();
		int[] arr = {-100, 32, 32, 19};
		assertEquals(-100, newMain.findMin(arr));
		int[] arr1 = {-100, -173, 100, 198};
		assertEquals(-173, newMain.findMin(arr1));
		int[] arr2 = {0, 33, 324, 19};
		assertEquals(0, newMain.findMin(arr2));
		int[] arr3 = {1010, 100, -1010, 19};
		assertEquals(-1010, newMain.findMin(arr3));
		int[] arr4 = {13, 29, 78, 9302};
		assertEquals(13, newMain.findMin(arr4));
	}
}