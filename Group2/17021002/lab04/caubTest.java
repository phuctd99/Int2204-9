package bàitapt4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class caubTest {

	@Test
	void test1() {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		assertEquals(1,caub.maxn(arr));
	}
	@Test
	void test2() {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		assertEquals(2,caub.maxn(arr));
	}
	@Test
	void test3() {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		assertEquals(4,caub.maxn(arr));
	}
	@Test
	void test4() {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		assertEquals(4,caub.maxn(arr));
	}
	@Test
	void test5() {
		int [] arr = {1,2,3,4,5,6,7,8,9};
		assertEquals(6,caub.maxn(arr));
	}

}
