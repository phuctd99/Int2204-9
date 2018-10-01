package bàitapt4;

import static org.junit.Assert.*;

import org.junit.Test;

public class cauaTest {

	@Test
	public void test1() {
		assertEquals(5,caua.maxvalue(4,5));
	}
	@Test
	public void test2() {
		assertEquals(5,caua.maxvalue(3,5));
	}
	@Test
	public void test3() {
		assertEquals(1,caua.maxvalue(1,5));
	}
	@Test
	public void test4() {
		assertEquals(9,caua.maxvalue(4,9));
	}
	@Test
	public void test5() {
		assertEquals(89,caua.maxvalue(4,89));
	}

}
