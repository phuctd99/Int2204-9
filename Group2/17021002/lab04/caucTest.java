package bàitapt4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class caucTest {

	@Test
	public void test1() {
		assertEquals("Binh thuong",cauc.BMI(80, 2));	
	}
	@Test
	public void test2() {
		assertEquals("Beo phi",cauc.BMI(82, 1.7));
	}
	@Test
	public void test3() {
		assertEquals("Thua can",cauc.BMI(90, 2.3));
	}
	@Test
	public void test4() {
		assertEquals("Thieu can",cauc.BMI(56, 1.8));
	}
	@Test
	public void test5() {
		assertEquals("Binh thuong",cauc.BMI(45, 1.64));
	}
	}
                                                                                                          